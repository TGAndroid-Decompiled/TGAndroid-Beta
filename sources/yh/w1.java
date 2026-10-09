package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements org.telegram.ui.ActionBar.a2 {
    public final int f53323a;
    public final s3 f53324b;
    public final TL_stars.TL_starGiftUnique f53325c;

    public w1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53323a = i10;
        this.f53324b = s3Var;
        this.f53325c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f53323a) {
            case 0:
                s3.O0(this.f53324b, this.f53325c, b2Var);
                return;
            default:
                Context context = this.f53324b.getContext();
                of.f.u(context, "https://fragment.com/gift/" + this.f53325c.slug);
                return;
        }
    }
}
