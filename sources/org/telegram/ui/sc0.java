package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class sc0 extends org.telegram.ui.Components.jv0 {
    public final cd0 f37708f2;

    public sc0(cd0 cd0Var, Context context, org.telegram.ui.Components.bv0 bv0Var, cd0 cd0Var2, rc0 rc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, bv0Var, 0, null, null, null, 8, 0, cd0Var2, rc0Var, 0, d6Var, null);
        this.f37708f2 = cd0Var;
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
        return this.f37708f2.M0;
    }
}
