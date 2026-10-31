package ph;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v71;
import org.telegram.ui.ProfileActivity;
public final class o1 implements q20 {
    public final int f45255a;
    public final j2 f45256b;

    public o1(j2 j2Var, int i10) {
        this.f45255a = i10;
        this.f45256b = j2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45255a) {
            case 0:
                j2 j2Var = this.f45256b;
                j2Var.f(true);
                v71 v71Var = j2Var.f45132n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v71Var.d(i10, j2Var.e.f(i10) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = j2Var.f45128a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).T4(true);
                }
                j2Var.o();
                return;
            default:
                j2 j2Var2 = this.f45256b;
                j2Var2.e.b((String) obj, new o1(j2Var2, 0));
                return;
        }
    }
}
