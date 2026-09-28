package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f46340a;
    public final Context f46341b;
    public final d6 f46342c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f46340a = i10;
        this.f46341b = context;
        this.f46342c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46340a) {
            case 0:
                d6 d6Var = this.f46342c;
                v.U(this.f46341b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f46342c;
                v.U(this.f46341b, this.d, d6Var2);
                return;
        }
    }
}
