package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
public final class r implements Runnable {
    public final int f51473a;
    public final Context f51474b;
    public final e6 f51475c;
    public final TL_stars.StarGift d;

    public r(Context context, e6 e6Var, TL_stars.StarGift starGift, int i10) {
        this.f51473a = i10;
        this.f51474b = context;
        this.f51475c = e6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f51473a) {
            case 0:
                e6 e6Var = this.f51475c;
                x.V(this.f51474b, this.d, e6Var);
                return;
            default:
                e6 e6Var2 = this.f51475c;
                x.V(this.f51474b, this.d, e6Var2);
                return;
        }
    }
}
