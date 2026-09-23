package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class tc0 extends org.telegram.ui.Components.yu0 {
    public final dd0 f37605f2;

    public tc0(dd0 dd0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, dd0 dd0Var2, sc0 sc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, dd0Var2, sc0Var, 0, d6Var, null);
        this.f37605f2 = dd0Var;
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
        return this.f37605f2.M0;
    }
}
