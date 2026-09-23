package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f46012a;
    public final Context f46013b;
    public final d6 f46014c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f46012a = i10;
        this.f46013b = context;
        this.f46014c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46012a) {
            case 0:
                d6 d6Var = this.f46014c;
                v.U(this.f46013b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f46014c;
                v.U(this.f46013b, this.d, d6Var2);
                return;
        }
    }
}
