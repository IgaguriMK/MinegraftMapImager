/*
 *  Main Author: Igaguri
 *  Copyright: 2017 Igaguri
 *  License: MIT LICENSE
 *           See README in repository.
 */

package net.kurikagononaka.mapImager.model.map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class Vector2Test {
    @Test
    public void min() throws Exception {
        Vector2 u = new Vector2(0,0);
        Vector2 v = new Vector2(-1, 1);

        assertThat(Vector2.min(u,v), is(new Vector2(-1, 0)));
    }

    @Test
    public void max() throws Exception {
        Vector2 u = new Vector2(0,0);
        Vector2 v = new Vector2(-1, 1);

        assertThat(Vector2.max(u,v), is(new Vector2(0, 1)));
    }

}