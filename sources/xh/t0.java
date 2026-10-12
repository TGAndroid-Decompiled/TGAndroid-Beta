package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class t0 extends y4 {
    public final q1 f51746x0;

    public t0(q1 q1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, o0 o0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, o0Var, z10, z11);
        this.f51746x0 = q1Var;
    }

    @Override
    public final zc Y() {
        c6 c6Var;
        q1 q1Var = this.f51746x0;
        org.telegram.ui.ActionBar.c3 c3Var = q1Var.container;
        c6Var = q1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
