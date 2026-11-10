package zh;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u61;
import org.telegram.ui.ProfileActivity;
public final class j1 implements c20 {
    public final int f60412a;
    public final d2 f60413b;

    public j1(d2 d2Var, int i7) {
        this.f60412a = i7;
        this.f60413b = d2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60412a) {
            case 0:
                d2 d2Var = this.f60413b;
                d2Var.f(true);
                u61 u61Var = d2Var.f60299n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                u61Var.d(i7, d2Var.f60297e.f(i7) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = d2Var.f60294a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).X4(true);
                }
                d2Var.o();
                return;
            default:
                d2 d2Var2 = this.f60413b;
                d2Var2.f60297e.b((String) obj, new j1(d2Var2, 0));
                return;
        }
    }
}
