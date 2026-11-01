package ph;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w71;
import org.telegram.ui.ProfileActivity;
public final class o1 implements r20 {
    public final int f45266a;
    public final j2 f45267b;

    public o1(j2 j2Var, int i10) {
        this.f45266a = i10;
        this.f45267b = j2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45266a) {
            case 0:
                j2 j2Var = this.f45267b;
                j2Var.f(true);
                w71 w71Var = j2Var.f45143n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                w71Var.d(i10, j2Var.e.f(i10) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = j2Var.f45139a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).U4(true);
                }
                j2Var.o();
                return;
            default:
                j2 j2Var2 = this.f45267b;
                j2Var2.e.b((String) obj, new o1(j2Var2, 0));
                return;
        }
    }
}
