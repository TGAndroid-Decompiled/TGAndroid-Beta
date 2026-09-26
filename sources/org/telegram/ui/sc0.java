package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class sc0 extends org.telegram.ui.Components.kv0 {
    public final cd0 f37706f2;

    public sc0(cd0 cd0Var, Context context, org.telegram.ui.Components.cv0 cv0Var, cd0 cd0Var2, rc0 rc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, cv0Var, 0, null, null, null, 8, 0, cd0Var2, rc0Var, 0, d6Var, null);
        this.f37706f2 = cd0Var;
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
        return this.f37706f2.M0;
    }
}
