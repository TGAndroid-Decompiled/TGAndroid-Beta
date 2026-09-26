package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f46339a;
    public final Context f46340b;
    public final d6 f46341c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f46339a = i10;
        this.f46340b = context;
        this.f46341c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46339a) {
            case 0:
                d6 d6Var = this.f46341c;
                v.U(this.f46340b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f46341c;
                v.U(this.f46340b, this.d, d6Var2);
                return;
        }
    }
}
