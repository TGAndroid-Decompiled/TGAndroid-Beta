package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class yc0 extends org.telegram.ui.Components.hw0 {
    public final id0 f44454f2;

    public yc0(id0 id0Var, Context context, org.telegram.ui.Components.zv0 zv0Var, id0 id0Var2, xc0 xc0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, zv0Var, 0, null, null, null, 8, 0, id0Var2, xc0Var, 0, c6Var, null);
        this.f44454f2 = id0Var;
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
        return this.f44454f2.M0;
    }
}
