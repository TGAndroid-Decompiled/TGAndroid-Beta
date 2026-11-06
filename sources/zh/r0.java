package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
public final class r0 extends b4 {
    public final h1 f60425r2;

    public r0(h1 h1Var, Context context, int i7, TL_stars.StarGift starGift, long j3, l0 l0Var, boolean z9, boolean z10) {
        super(context, i7, starGift, null, j3, l0Var, z9, z10);
        this.f60425r2 = h1Var;
    }

    @Override
    public final hc e1() {
        h1 h1Var = this.f60425r2;
        return new hc(h1Var.f28619c, h1Var.I0);
    }
}
