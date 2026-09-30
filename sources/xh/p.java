package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f46342a;
    public final Context f46343b;
    public final d6 f46344c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f46342a = i10;
        this.f46343b = context;
        this.f46344c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46342a) {
            case 0:
                d6 d6Var = this.f46344c;
                v.U(this.f46343b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f46344c;
                v.U(this.f46343b, this.d, d6Var2);
                return;
        }
    }
}
