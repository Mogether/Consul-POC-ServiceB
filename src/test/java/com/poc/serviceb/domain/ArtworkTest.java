package com.poc.serviceb.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.poc.serviceb.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ArtworkTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Artwork.class);
        Artwork artwork1 = new Artwork();
        artwork1.setId(1L);
        Artwork artwork2 = new Artwork();
        artwork2.setId(artwork1.getId());
        assertThat(artwork1).isEqualTo(artwork2);
        artwork2.setId(2L);
        assertThat(artwork1).isNotEqualTo(artwork2);
        artwork1.setId(null);
        assertThat(artwork1).isNotEqualTo(artwork2);
    }
}
