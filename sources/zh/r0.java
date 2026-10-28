package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;
public final class r0 extends y4 {
    public final p1 f53285z0;

    public r0(p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, l0 l0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, l0Var, z10, z11);
        this.f53285z0 = p1Var;
    }

    @Override
    public final wc X() {
        u6 u6Var;
        p1 p1Var = this.f53285z0;
        org.telegram.ui.ActionBar.h3 h3Var = p1Var.container;
        u6Var = p1Var.resourcesProvider;
        return new wc(h3Var, u6Var);
    }
}
