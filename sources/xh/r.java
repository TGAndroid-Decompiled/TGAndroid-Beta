package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
public final class r implements Runnable {
    public final int f51721a;
    public final Context f51722b;
    public final c6 f51723c;
    public final TL_stars.StarGift d;

    public r(Context context, c6 c6Var, TL_stars.StarGift starGift, int i10) {
        this.f51721a = i10;
        this.f51722b = context;
        this.f51723c = c6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f51721a) {
            case 0:
                c6 c6Var = this.f51723c;
                x.V(this.f51722b, this.d, c6Var);
                return;
            default:
                c6 c6Var2 = this.f51723c;
                x.V(this.f51722b, this.d, c6Var2);
                return;
        }
    }
}
