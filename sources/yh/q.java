package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
public final class q implements Runnable {
    public final int f49080a;
    public final Context f49081b;
    public final c6 f49082c;
    public final TL_stars.StarGift d;

    public q(Context context, c6 c6Var, TL_stars.StarGift starGift, int i10) {
        this.f49080a = i10;
        this.f49081b = context;
        this.f49082c = c6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f49080a) {
            case 0:
                c6 c6Var = this.f49082c;
                w.V(this.f49081b, this.d, c6Var);
                return;
            default:
                c6 c6Var2 = this.f49082c;
                w.V(this.f49081b, this.d, c6Var2);
                return;
        }
    }
}
