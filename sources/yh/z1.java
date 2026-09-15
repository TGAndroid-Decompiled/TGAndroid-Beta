package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f48043a;
    public final a4 f48044b;
    public final TL_stars.TL_starGiftUnique f48045c;

    public z1(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f48043a = i10;
        this.f48044b = a4Var;
        this.f48045c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f48043a) {
            case 0:
                a4.N0(this.f48044b, this.f48045c, b2Var);
                return;
            default:
                Context context = this.f48044b.getContext();
                nf.f.u(context, "https://fragment.com/gift/" + this.f48045c.slug);
                return;
        }
    }
}
