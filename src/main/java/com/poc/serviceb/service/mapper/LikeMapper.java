package com.poc.serviceb.service.mapper;

import com.poc.serviceb.domain.Artwork;
import com.poc.serviceb.domain.Like;
import com.poc.serviceb.service.dto.ArtworkDTO;
import com.poc.serviceb.service.dto.LikeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Like} and its DTO {@link LikeDTO}.
 */
@Mapper(componentModel = "spring")
public interface LikeMapper extends EntityMapper<LikeDTO, Like> {
    @Mapping(target = "artwork", source = "artwork", qualifiedByName = "artworkId")
    LikeDTO toDto(Like s);

    @Named("artworkId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ArtworkDTO toDtoArtworkId(Artwork artwork);
}
