package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.c2 {
    public final int f46347a;
    public final x3 f46348b;
    public final TL_stars.TL_starGiftUnique f46349c;

    public z1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f46347a = i10;
        this.f46348b = x3Var;
        this.f46349c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f46347a) {
            case 0:
                x3.N0(this.f46348b, this.f46349c, d2Var);
                return;
            default:
                Context context = this.f46348b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f46349c.slug);
                return;
        }
    }
}
