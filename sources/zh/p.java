package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class p implements Runnable {
    public final int f60374a;
    public final Context f60375b;
    public final f6 f60376c;
    public final TL_stars.StarGift d;

    public p(Context context, f6 f6Var, TL_stars.StarGift starGift, int i7) {
        this.f60374a = i7;
        this.f60375b = context;
        this.f60376c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f60374a) {
            case 0:
                f6 f6Var = this.f60376c;
                v.g1(this.f60375b, this.d, f6Var);
                return;
            default:
                f6 f6Var2 = this.f60376c;
                v.g1(this.f60375b, this.d, f6Var2);
                return;
        }
    }
}
