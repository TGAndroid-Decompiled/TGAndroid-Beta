package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class p implements Runnable {
    public final int f50915a;
    public final Context f50916b;
    public final g6 f50917c;
    public final TL_stars.StarGift d;

    public p(Context context, g6 g6Var, TL_stars.StarGift starGift, int i10) {
        this.f50915a = i10;
        this.f50916b = context;
        this.f50917c = g6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50915a) {
            case 0:
                g6 g6Var = this.f50917c;
                v.U(this.f50916b, this.d, g6Var);
                return;
            default:
                g6 g6Var2 = this.f50917c;
                v.U(this.f50916b, this.d, g6Var2);
                return;
        }
    }
}
