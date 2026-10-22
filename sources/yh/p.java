package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f50458a;
    public final Context f50459b;
    public final d6 f50460c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f50458a = i10;
        this.f50459b = context;
        this.f50460c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50458a) {
            case 0:
                d6 d6Var = this.f50460c;
                v.V(this.f50459b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f50460c;
                v.V(this.f50459b, this.d, d6Var2);
                return;
        }
    }
}
