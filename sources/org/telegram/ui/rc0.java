package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class rc0 extends org.telegram.ui.Components.zu0 {
    public final bd0 f40928c2;

    public rc0(bd0 bd0Var, Context context, org.telegram.ui.Components.ru0 ru0Var, bd0 bd0Var2, qc0 qc0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, ru0Var, 0, null, null, null, 8, 0, bd0Var2, qc0Var, 0, g6Var, null);
        this.f40928c2 = bd0Var;
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
        return this.f40928c2.J0;
    }
}
