package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
public final class p implements Runnable {
    public final int f53179a;
    public final Context f53180b;
    public final u6 f53181c;
    public final TL_stars.StarGift d;

    public p(Context context, u6 u6Var, TL_stars.StarGift starGift, int i10) {
        this.f53179a = i10;
        this.f53180b = context;
        this.f53181c = u6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f53179a) {
            case 0:
                u6 u6Var = this.f53181c;
                v.U(this.f53180b, this.d, u6Var);
                return;
            default:
                u6 u6Var2 = this.f53181c;
                v.U(this.f53180b, this.d, u6Var2);
                return;
        }
    }
}
