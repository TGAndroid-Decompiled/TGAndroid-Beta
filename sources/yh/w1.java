package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements org.telegram.ui.ActionBar.a2 {
    public final int f53325a;
    public final s3 f53326b;
    public final TL_stars.TL_starGiftUnique f53327c;

    public w1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53325a = i10;
        this.f53326b = s3Var;
        this.f53327c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f53325a) {
            case 0:
                s3.O0(this.f53326b, this.f53327c, b2Var);
                return;
            default:
                Context context = this.f53326b.getContext();
                of.f.u(context, "https://fragment.com/gift/" + this.f53327c.slug);
                return;
        }
    }
}
