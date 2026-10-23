package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class p implements Runnable {
    public final int f50916a;
    public final Context f50917b;
    public final g6 f50918c;
    public final TL_stars.StarGift d;

    public p(Context context, g6 g6Var, TL_stars.StarGift starGift, int i10) {
        this.f50916a = i10;
        this.f50917b = context;
        this.f50918c = g6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50916a) {
            case 0:
                g6 g6Var = this.f50918c;
                v.U(this.f50917b, this.d, g6Var);
                return;
            default:
                g6 g6Var2 = this.f50918c;
                v.U(this.f50917b, this.d, g6Var2);
                return;
        }
    }
}
