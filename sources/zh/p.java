package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
public final class p implements Runnable {
    public final int f53240a;
    public final Context f53241b;
    public final u6 f53242c;
    public final TL_stars.StarGift d;

    public p(Context context, u6 u6Var, TL_stars.StarGift starGift, int i10) {
        this.f53240a = i10;
        this.f53241b = context;
        this.f53242c = u6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f53240a) {
            case 0:
                u6 u6Var = this.f53242c;
                v.U(this.f53241b, this.d, u6Var);
                return;
            default:
                u6 u6Var2 = this.f53242c;
                v.U(this.f53241b, this.d, u6Var2);
                return;
        }
    }
}
