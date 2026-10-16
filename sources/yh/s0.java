package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class s0 extends x4 {
    public final p1 f49111x0;

    public s0(p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, n0 n0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, n0Var, z10, z11);
        this.f49111x0 = p1Var;
    }

    @Override
    public final zc Y() {
        c6 c6Var;
        p1 p1Var = this.f49111x0;
        org.telegram.ui.ActionBar.c3 c3Var = p1Var.container;
        c6Var = p1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
