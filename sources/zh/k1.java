package zh;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o61;
import org.telegram.ui.ProfileActivity;
public final class k1 implements c20 {
    public final int f60294a;
    public final f2 f60295b;

    public k1(f2 f2Var, int i7) {
        this.f60294a = i7;
        this.f60295b = f2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60294a) {
            case 0:
                f2 f2Var = this.f60295b;
                f2Var.f(true);
                o61 o61Var = f2Var.f60192n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                o61Var.d(i7, f2Var.f60190e.f(i7) + 1);
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var.f60187a;
                if (f2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var2).U4(true);
                }
                f2Var.o();
                return;
            default:
                f2 f2Var3 = this.f60295b;
                f2Var3.f60190e.b((String) obj, new k1(f2Var3, 0));
                return;
        }
    }
}
