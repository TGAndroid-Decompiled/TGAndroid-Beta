package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
public final class q0 extends b4 {
    public final g1 f60515r2;

    public q0(g1 g1Var, Context context, int i7, TL_stars.StarGift starGift, long j3, l0 l0Var, boolean z9, boolean z10) {
        super(context, i7, starGift, null, j3, l0Var, z9, z10);
        this.f60515r2 = g1Var;
    }

    @Override
    public final hc e1() {
        g1 g1Var = this.f60515r2;
        return new hc(g1Var.f28627c, g1Var.I0);
    }
}
