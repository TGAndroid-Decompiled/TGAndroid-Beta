package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f50173a;
    public final Context f50174b;
    public final d6 f50175c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f50173a = i10;
        this.f50174b = context;
        this.f50175c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50173a) {
            case 0:
                d6 d6Var = this.f50175c;
                v.S(this.f50174b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f50175c;
                v.S(this.f50174b, this.d, d6Var2);
                return;
        }
    }
}
