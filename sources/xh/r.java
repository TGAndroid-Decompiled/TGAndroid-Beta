package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class r implements Runnable {
    public final int f51594a;
    public final Context f51595b;
    public final d6 f51596c;
    public final TL_stars.StarGift d;

    public r(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f51594a = i10;
        this.f51595b = context;
        this.f51596c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f51594a) {
            case 0:
                d6 d6Var = this.f51596c;
                x.V(this.f51595b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f51596c;
                x.V(this.f51595b, this.d, d6Var2);
                return;
        }
    }
}
