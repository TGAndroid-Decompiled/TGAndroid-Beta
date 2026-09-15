package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
public final class p implements Runnable {
    public final int f46057a;
    public final Context f46058b;
    public final e6 f46059c;
    public final TL_stars.StarGift d;

    public p(Context context, e6 e6Var, TL_stars.StarGift starGift, int i10) {
        this.f46057a = i10;
        this.f46058b = context;
        this.f46059c = e6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46057a) {
            case 0:
                e6 e6Var = this.f46059c;
                v.U(this.f46058b, this.d, e6Var);
                return;
            default:
                e6 e6Var2 = this.f46059c;
                v.U(this.f46058b, this.d, e6Var2);
                return;
        }
    }
}
