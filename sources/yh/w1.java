package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements org.telegram.ui.ActionBar.z1 {
    public final int f53549a;
    public final s3 f53550b;
    public final TL_stars.TL_starGiftUnique f53551c;

    public w1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53549a = i10;
        this.f53550b = s3Var;
        this.f53551c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f53549a) {
            case 0:
                s3.O0(this.f53550b, this.f53551c, a2Var);
                return;
            default:
                Context context = this.f53550b.getContext();
                of.f.u(context, "https://fragment.com/gift/" + this.f53551c.slug);
                return;
        }
    }
}
