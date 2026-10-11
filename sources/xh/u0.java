package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
public final class u0 extends z4 {
    public final r1 f51655x0;

    public u0(r1 r1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, o0 o0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, o0Var, z10, z11);
        this.f51655x0 = r1Var;
    }

    @Override
    public final ad Y() {
        d6 d6Var;
        r1 r1Var = this.f51655x0;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new ad(c3Var, d6Var);
    }
}
