package xh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class p implements Runnable {
    public final int f46085a;
    public final Context f46086b;
    public final f6 f46087c;
    public final TL_stars.StarGift d;

    public p(Context context, f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.f46085a = i10;
        this.f46086b = context;
        this.f46087c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f46085a) {
            case 0:
                f6 f6Var = this.f46087c;
                v.U(this.f46086b, this.d, f6Var);
                return;
            default:
                f6 f6Var2 = this.f46087c;
                v.U(this.f46086b, this.d, f6Var2);
                return;
        }
    }
}
