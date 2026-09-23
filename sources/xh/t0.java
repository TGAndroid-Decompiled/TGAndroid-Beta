package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class t0 extends z4 {
    public final r1 f46079x0;

    public t0(r1 r1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, m0 m0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, m0Var, z10, z11);
        this.f46079x0 = r1Var;
    }

    @Override
    public final xc X() {
        d6 d6Var;
        r1 r1Var = this.f46079x0;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
