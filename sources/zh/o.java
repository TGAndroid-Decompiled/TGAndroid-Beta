package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class o implements Runnable {
    public final int f60491a;
    public final Context f60492b;
    public final g6 f60493c;
    public final TL_stars.StarGift d;

    public o(Context context, g6 g6Var, TL_stars.StarGift starGift, int i7) {
        this.f60491a = i7;
        this.f60492b = context;
        this.f60493c = g6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f60491a) {
            case 0:
                g6 g6Var = this.f60493c;
                u.g1(this.f60492b, this.d, g6Var);
                return;
            default:
                g6 g6Var2 = this.f60493c;
                u.g1(this.f60492b, this.d, g6Var2);
                return;
        }
    }
}
