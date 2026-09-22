package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f48377a;
    public final y3 f48378b;
    public final TL_stars.TL_starGiftUnique f48379c;

    public z1(y3 y3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48377a = i10;
        this.f48378b = y3Var;
        this.f48379c = tL_starGiftUnique;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f48377a) {
            case 0:
                y3.N0(this.f48378b, this.f48379c, b2Var);
                return;
            default:
                Context context = this.f48378b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48379c.slug);
                return;
        }
    }
}
