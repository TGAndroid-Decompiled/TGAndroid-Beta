package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
public final class o implements Runnable {
    public final int f60498a;
    public final Context f60499b;
    public final h6 f60500c;
    public final TL_stars.StarGift d;

    public o(Context context, h6 h6Var, TL_stars.StarGift starGift, int i7) {
        this.f60498a = i7;
        this.f60499b = context;
        this.f60500c = h6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f60498a) {
            case 0:
                h6 h6Var = this.f60500c;
                u.g1(this.f60499b, this.d, h6Var);
                return;
            default:
                h6 h6Var2 = this.f60500c;
                u.g1(this.f60499b, this.d, h6Var2);
                return;
        }
    }
}
