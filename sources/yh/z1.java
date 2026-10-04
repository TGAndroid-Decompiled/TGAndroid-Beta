package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f52303a;
    public final x3 f52304b;
    public final TL_stars.TL_starGiftUnique f52305c;

    public z1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f52303a = i10;
        this.f52304b = x3Var;
        this.f52305c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f52303a) {
            case 0:
                x3.N0(this.f52304b, this.f52305c, b2Var);
                return;
            default:
                Context context = this.f52304b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f52305c.slug);
                return;
        }
    }
}
