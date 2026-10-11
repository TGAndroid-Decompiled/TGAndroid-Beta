package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class r implements Runnable {
    public final int f51560a;
    public final Context f51561b;
    public final d6 f51562c;
    public final TL_stars.StarGift d;

    public r(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f51560a = i10;
        this.f51561b = context;
        this.f51562c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f51560a) {
            case 0:
                d6 d6Var = this.f51562c;
                x.V(this.f51561b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f51562c;
                x.V(this.f51561b, this.d, d6Var2);
                return;
        }
    }
}
