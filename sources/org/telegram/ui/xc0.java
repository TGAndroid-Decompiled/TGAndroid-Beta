package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class xc0 extends org.telegram.ui.Components.cw0 {
    public final hd0 f43965f2;

    public xc0(hd0 hd0Var, Context context, org.telegram.ui.Components.uv0 uv0Var, hd0 hd0Var2, wc0 wc0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, uv0Var, 0, null, null, null, 8, 0, hd0Var2, wc0Var, 0, e6Var, null);
        this.f43965f2 = hd0Var;
    }

    @Override
    public final int B0() {
        return 32;
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final int S0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f43965f2.M0;
    }
}
