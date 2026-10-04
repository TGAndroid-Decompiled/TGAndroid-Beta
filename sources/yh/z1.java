package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f52302a;
    public final x3 f52303b;
    public final TL_stars.TL_starGiftUnique f52304c;

    public z1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f52302a = i10;
        this.f52303b = x3Var;
        this.f52304c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f52302a) {
            case 0:
                x3.N0(this.f52303b, this.f52304c, b2Var);
                return;
            default:
                Context context = this.f52303b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f52304c.slug);
                return;
        }
    }
}
