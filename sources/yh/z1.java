package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f48003a;
    public final y3 f48004b;
    public final TL_stars.TL_starGiftUnique f48005c;

    public z1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48003a = i10;
        this.f48004b = y3Var;
        this.f48005c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f48003a) {
            case 0:
                y3.N0(this.f48004b, this.f48005c, b2Var);
                return;
            default:
                Context context = this.f48004b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48005c.slug);
                return;
        }
    }
}
