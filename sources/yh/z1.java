package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f52308a;
    public final x3 f52309b;
    public final TL_stars.TL_starGiftUnique f52310c;

    public z1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f52308a = i10;
        this.f52309b = x3Var;
        this.f52310c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f52308a) {
            case 0:
                x3.N0(this.f52309b, this.f52310c, b2Var);
                return;
            default:
                Context context = this.f52309b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f52310c.slug);
                return;
        }
    }
}
