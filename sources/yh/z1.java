package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.b2 {
    public final int f48071a;
    public final a4 f48072b;
    public final TL_stars.TL_starGiftUnique f48073c;

    public z1(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48071a = i10;
        this.f48072b = a4Var;
        this.f48073c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f48071a) {
            case 0:
                a4.N0(this.f48072b, this.f48073c, c2Var);
                return;
            default:
                Context context = this.f48072b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48073c.slug);
                return;
        }
    }
}
