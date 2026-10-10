package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements org.telegram.ui.ActionBar.a2 {
    public final int f53369a;
    public final s3 f53370b;
    public final TL_stars.TL_starGiftUnique f53371c;

    public w1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53369a = i10;
        this.f53370b = s3Var;
        this.f53371c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f53369a) {
            case 0:
                s3.O0(this.f53370b, this.f53371c, b2Var);
                return;
            default:
                Context context = this.f53370b.getContext();
                of.f.u(context, "https://fragment.com/gift/" + this.f53371c.slug);
                return;
        }
    }
}
