package com.poc.serviceb.service.mapper;

import com.poc.serviceb.domain.Artwork;
import com.poc.serviceb.service.dto.ArtworkDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Artwork} and its DTO {@link ArtworkDTO}.
 */
@Mapper(componentModel = "spring")
public interface ArtworkMapper extends EntityMapper<ArtworkDTO, Artwork> {}
