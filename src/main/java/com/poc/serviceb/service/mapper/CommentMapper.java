package com.poc.serviceb.service.mapper;

import com.poc.serviceb.domain.Artwork;
import com.poc.serviceb.domain.Comment;
import com.poc.serviceb.service.dto.ArtworkDTO;
import com.poc.serviceb.service.dto.CommentDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Comment} and its DTO {@link CommentDTO}.
 */
@Mapper(componentModel = "spring")
public interface CommentMapper extends EntityMapper<CommentDTO, Comment> {
    @Mapping(target = "artwork", source = "artwork", qualifiedByName = "artworkId")
    CommentDTO toDto(Comment s);

    @Named("artworkId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ArtworkDTO toDtoArtworkId(Artwork artwork);
}
