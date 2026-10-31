package ph;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
public final class t0 extends g4 {
    public final l1 f45311r2;

    public t0(l1 l1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, n0 n0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, n0Var, z10, z11);
        this.f45311r2 = l1Var;
    }

    @Override
    public final cc e1() {
        l1 l1Var = this.f45311r2;
        return new cc(l1Var.f21589c, l1Var.I0);
    }
}
