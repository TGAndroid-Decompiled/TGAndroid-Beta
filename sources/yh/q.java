package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class q implements Runnable {
    public final int f50509a;
    public final Context f50510b;
    public final d6 f50511c;
    public final TL_stars.StarGift d;

    public q(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f50509a = i10;
        this.f50510b = context;
        this.f50511c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50509a) {
            case 0:
                d6 d6Var = this.f50511c;
                w.V(this.f50510b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f50511c;
                w.V(this.f50510b, this.d, d6Var2);
                return;
        }
    }
}
