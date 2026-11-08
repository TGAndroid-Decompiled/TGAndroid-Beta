package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class o implements Runnable {
    public final int f60481a;
    public final Context f60482b;
    public final f6 f60483c;
    public final TL_stars.StarGift d;

    public o(Context context, f6 f6Var, TL_stars.StarGift starGift, int i7) {
        this.f60481a = i7;
        this.f60482b = context;
        this.f60483c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f60481a) {
            case 0:
                f6 f6Var = this.f60483c;
                u.g1(this.f60482b, this.d, f6Var);
                return;
            default:
                f6 f6Var2 = this.f60483c;
                u.g1(this.f60482b, this.d, f6Var2);
                return;
        }
    }
}
