package wh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class p implements Runnable {
    public final int f44281a;
    public final Context f44282b;
    public final f6 f44283c;
    public final TL_stars.StarGift d;

    public p(Context context, f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.f44281a = i10;
        this.f44282b = context;
        this.f44283c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f44281a) {
            case 0:
                f6 f6Var = this.f44283c;
                w.U(this.f44282b, this.d, f6Var);
                return;
            default:
                f6 f6Var2 = this.f44283c;
                w.U(this.f44282b, this.d, f6Var2);
                return;
        }
    }
}
