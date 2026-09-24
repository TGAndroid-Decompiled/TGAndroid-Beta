package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f46326a;
    public final Context f46327b;
    public final d6 f46328c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f46326a = i10;
        this.f46327b = context;
        this.f46328c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46326a) {
            case 0:
                d6 d6Var = this.f46328c;
                v.U(this.f46327b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f46328c;
                v.U(this.f46327b, this.d, d6Var2);
                return;
        }
    }
}
