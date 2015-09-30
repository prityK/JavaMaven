package com.evolutionnext.model;

import com.evolutionnext.model.Album;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class AlbumTest {
    @Test
    public void testProperties() throws Exception {
        Album album = new Album();
        album.setName("Rumours");
        album.setId(13L);
        assertThat(album.getName()).isEqualTo("Rumours");
        assertThat(album.getId()).isEqualTo(13L);

        //Below are changed made by Hao to fix it
        album.setId(15L);
	assertThat(album.getId()).isEqualTo(15L);
    }
}
