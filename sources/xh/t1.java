package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n91;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f51525a;
    public final s2 f51526b;

    public t1(s2 s2Var, int i10) {
        this.f51525a = i10;
        this.f51526b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51525a) {
            case 0:
                s2 s2Var = this.f51526b;
                s2Var.f51512e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f51526b;
                s2Var2.f(true);
                n91 n91Var = s2Var2.f51514n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                n91Var.d(i10, s2Var2.f51512e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = s2Var2.f51509a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
