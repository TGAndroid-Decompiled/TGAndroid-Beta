package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements org.telegram.ui.ActionBar.z1 {
    public final int f53412a;
    public final s3 f53413b;
    public final TL_stars.TL_starGiftUnique f53414c;

    public w1(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f53412a = i10;
        this.f53413b = s3Var;
        this.f53414c = tL_starGiftUnique;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f53412a) {
            case 0:
                s3.O0(this.f53413b, this.f53414c, a2Var);
                return;
            default:
                Context context = this.f53413b.getContext();
                of.f.u(context, "https://fragment.com/gift/" + this.f53414c.slug);
                return;
        }
    }
}
