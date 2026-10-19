package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f50448a;
    public final Context f50449b;
    public final d6 f50450c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f50448a = i10;
        this.f50449b = context;
        this.f50450c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50448a) {
            case 0:
                d6 d6Var = this.f50450c;
                v.V(this.f50449b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f50450c;
                v.V(this.f50449b, this.d, d6Var2);
                return;
        }
    }
}
