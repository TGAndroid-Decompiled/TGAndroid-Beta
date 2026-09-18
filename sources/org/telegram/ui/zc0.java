package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class zc0 extends org.telegram.ui.Components.kv0 {
    public final jd0 f40083f2;

    public zc0(jd0 jd0Var, Context context, org.telegram.ui.Components.cv0 cv0Var, jd0 jd0Var2, yc0 yc0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, cv0Var, 0, null, null, null, 8, 0, jd0Var2, yc0Var, 0, e6Var, null);
        this.f40083f2 = jd0Var;
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
        return this.f40083f2.M0;
    }
}
