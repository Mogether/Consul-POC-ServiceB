package com.poc.serviceb.service.mapper;

import com.poc.serviceb.domain.Artwork;
import com.poc.serviceb.domain.View;
import com.poc.serviceb.service.dto.ArtworkDTO;
import com.poc.serviceb.service.dto.ViewDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link View} and its DTO {@link ViewDTO}.
 */
@Mapper(componentModel = "spring")
public interface ViewMapper extends EntityMapper<ViewDTO, View> {
    @Mapping(target = "artwork", source = "artwork", qualifiedByName = "artworkId")
    ViewDTO toDto(View s);

    @Named("artworkId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ArtworkDTO toDtoArtworkId(Artwork artwork);
}
