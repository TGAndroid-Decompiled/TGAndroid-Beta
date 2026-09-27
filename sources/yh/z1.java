package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.b2 {
    public final int f48355a;
    public final x3 f48356b;
    public final TL_stars.TL_starGiftUnique f48357c;

    public z1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48355a = i10;
        this.f48356b = x3Var;
        this.f48357c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f48355a) {
            case 0:
                x3.N0(this.f48356b, this.f48357c, c2Var);
                return;
            default:
                Context context = this.f48356b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48357c.slug);
                return;
        }
    }
}
