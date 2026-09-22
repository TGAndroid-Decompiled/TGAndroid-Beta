package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f47985a;
    public final z3 f47986b;
    public final TL_stars.TL_starGiftUnique f47987c;

    public z1(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f47985a = i10;
        this.f47986b = z3Var;
        this.f47987c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f47985a) {
            case 0:
                z3.N0(this.f47986b, this.f47987c, b2Var);
                return;
            default:
                Context context = this.f47986b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f47987c.slug);
                return;
        }
    }
}
