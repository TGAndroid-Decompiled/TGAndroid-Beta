package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
public final class q0 extends b4 {
    public final g1 f60524u2;

    public q0(g1 g1Var, Context context, int i7, TL_stars.StarGift starGift, long j3, l0 l0Var, boolean z9, boolean z10) {
        super(context, i7, starGift, null, j3, l0Var, z9, z10);
        this.f60524u2 = g1Var;
    }

    @Override
    public final gc e1() {
        g1 g1Var = this.f60524u2;
        return new gc(g1Var.f28675c, g1Var.I0);
    }
}
