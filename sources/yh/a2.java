package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class a2 implements org.telegram.ui.ActionBar.a2 {
    public final int f51076a;
    public final y3 f51077b;
    public final TL_stars.TL_starGiftUnique f51078c;

    public a2(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51076a = i10;
        this.f51077b = y3Var;
        this.f51078c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f51076a) {
            case 0:
                y3.N0(this.f51077b, this.f51078c, b2Var);
                return;
            default:
                Context context = this.f51077b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f51078c.slug);
                return;
        }
    }
}
