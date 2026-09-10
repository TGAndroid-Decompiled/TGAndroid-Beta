package wh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;
public final class s0 extends y4 {
    public final p1 f44342x0;

    public s0(p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, long j3, n0 n0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j3, n0Var, z10, z11);
        this.f44342x0 = p1Var;
    }

    @Override
    public final wc X() {
        f6 f6Var;
        p1 p1Var = this.f44342x0;
        org.telegram.ui.ActionBar.f3 f3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new wc(f3Var, f6Var);
    }
}
