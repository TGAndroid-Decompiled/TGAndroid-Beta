package yh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class p implements Runnable {
    public final int f50477a;
    public final Context f50478b;
    public final f6 f50479c;
    public final TL_stars.StarGift d;

    public p(Context context, f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.f50477a = i10;
        this.f50478b = context;
        this.f50479c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f50477a) {
            case 0:
                f6 f6Var = this.f50479c;
                v.U(this.f50478b, this.d, f6Var);
                return;
            default:
                f6 f6Var2 = this.f50479c;
                v.U(this.f50478b, this.d, f6Var2);
                return;
        }
    }
}
