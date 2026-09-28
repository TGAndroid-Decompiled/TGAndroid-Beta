package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.z1 {
    public final int f48311a;
    public final x3 f48312b;
    public final TL_stars.TL_starGiftUnique f48313c;

    public z1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48311a = i10;
        this.f48312b = x3Var;
        this.f48313c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f48311a) {
            case 0:
                x3.N0(this.f48312b, this.f48313c, a2Var);
                return;
            default:
                Context context = this.f48312b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48313c.slug);
                return;
        }
    }
}
