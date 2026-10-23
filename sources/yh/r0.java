package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;
public final class r0 extends x4 {
    public final o1 f50948z0;

    public r0(o1 o1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, l0 l0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, l0Var, z10, z11);
        this.f50948z0 = o1Var;
    }

    @Override
    public final xc X() {
        g6 g6Var;
        o1 o1Var = this.f50948z0;
        org.telegram.ui.ActionBar.e3 e3Var = o1Var.container;
        g6Var = o1Var.resourcesProvider;
        return new xc(e3Var, g6Var);
    }
}
