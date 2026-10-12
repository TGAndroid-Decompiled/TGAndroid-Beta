package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class v1 implements org.telegram.ui.ActionBar.z1 {
    public final int f51230a;
    public final r3 f51231b;
    public final TL_stars.TL_starGiftUnique f51232c;

    public v1(r3 r3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.f51230a = i10;
        this.f51231b = r3Var;
        this.f51232c = tL_starGiftUnique;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f51230a) {
            case 0:
                r3.O0(this.f51231b, this.f51232c, a2Var);
                return;
            default:
                Context context = this.f51231b.getContext();
                pf.d.u(context, "https://fragment.com/gift/" + this.f51232c.slug);
                return;
        }
    }
}
