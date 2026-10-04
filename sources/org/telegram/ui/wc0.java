package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class wc0 extends org.telegram.ui.Components.pv0 {
    public final gd0 f42062f2;

    public wc0(gd0 gd0Var, Context context, org.telegram.ui.Components.hv0 hv0Var, gd0 gd0Var2, vc0 vc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, hv0Var, 0, null, null, null, 8, 0, gd0Var2, vc0Var, 0, d6Var, null);
        this.f42062f2 = gd0Var;
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
        return this.f42062f2.M0;
    }
}
