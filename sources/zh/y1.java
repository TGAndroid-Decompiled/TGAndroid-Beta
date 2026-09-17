package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class y1 implements org.telegram.ui.ActionBar.a2 {
    public final int f52867a;
    public final w3 f52868b;
    public final TL_stars.TL_starGiftUnique f52869c;

    public y1(w3 w3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f52867a = i10;
        this.f52868b = w3Var;
        this.f52869c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f52867a) {
            case 0:
                w3.N0(this.f52868b, this.f52869c, b2Var);
                return;
            default:
                Context context = this.f52868b.getContext();
                of.f.u(context, "https://fragment.com/gift/" + this.f52869c.slug);
                return;
        }
    }
}
