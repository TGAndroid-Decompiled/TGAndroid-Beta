package ph;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
public final class q implements Runnable {
    public final int f45272a;
    public final Context f45273b;
    public final p6 f45274c;
    public final TL_stars.StarGift d;

    public q(Context context, p6 p6Var, TL_stars.StarGift starGift, int i10) {
        this.f45272a = i10;
        this.f45273b = context;
        this.f45274c = p6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f45272a) {
            case 0:
                p6 p6Var = this.f45274c;
                w.g1(this.f45273b, this.d, p6Var);
                return;
            default:
                p6 p6Var2 = this.f45274c;
                w.g1(this.f45273b, this.d, p6Var2);
                return;
        }
    }
}
