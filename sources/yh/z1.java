package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f48310a;
    public final y3 f48311b;
    public final TL_stars.TL_starGiftUnique f48312c;

    public z1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48310a = i10;
        this.f48311b = y3Var;
        this.f48312c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f48310a) {
            case 0:
                y3.N0(this.f48311b, this.f48312c, b2Var);
                return;
            default:
                Context context = this.f48311b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48312c.slug);
                return;
        }
    }
}
