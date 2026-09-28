package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
public final class p implements Runnable {
    public final int f46341a;
    public final Context f46342b;
    public final d6 f46343c;
    public final TL_stars.StarGift d;

    public p(Context context, d6 d6Var, TL_stars.StarGift starGift, int i10) {
        this.f46341a = i10;
        this.f46342b = context;
        this.f46343c = d6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46341a) {
            case 0:
                d6 d6Var = this.f46343c;
                v.U(this.f46342b, this.d, d6Var);
                return;
            default:
                d6 d6Var2 = this.f46343c;
                v.U(this.f46342b, this.d, d6Var2);
                return;
        }
    }
}
