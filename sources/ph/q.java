package ph;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
public final class q implements Runnable {
    public final int f45283a;
    public final Context f45284b;
    public final p6 f45285c;
    public final TL_stars.StarGift d;

    public q(Context context, p6 p6Var, TL_stars.StarGift starGift, int i10) {
        this.f45283a = i10;
        this.f45284b = context;
        this.f45285c = p6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f45283a) {
            case 0:
                p6 p6Var = this.f45285c;
                w.g1(this.f45284b, this.d, p6Var);
                return;
            default:
                p6 p6Var2 = this.f45285c;
                w.g1(this.f45284b, this.d, p6Var2);
                return;
        }
    }
}
