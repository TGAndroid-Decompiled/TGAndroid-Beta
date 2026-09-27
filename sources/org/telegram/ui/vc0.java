package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class vc0 extends org.telegram.ui.Components.lv0 {
    public final fd0 f38548f2;

    public vc0(fd0 fd0Var, Context context, org.telegram.ui.Components.dv0 dv0Var, fd0 fd0Var2, uc0 uc0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, dv0Var, 0, null, null, null, 8, 0, fd0Var2, uc0Var, 0, e6Var, null);
        this.f38548f2 = fd0Var;
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
        return this.f38548f2.M0;
    }
}
