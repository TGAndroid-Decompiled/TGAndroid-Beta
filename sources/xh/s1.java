package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t91;
import org.telegram.ui.ProfileActivity;
public final class s1 implements Utilities.Callback {
    public final int f51747a;
    public final r2 f51748b;

    public s1(r2 r2Var, int i10) {
        this.f51747a = i10;
        this.f51748b = r2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51747a) {
            case 0:
                r2 r2Var = this.f51748b;
                r2Var.f51732e.b((String) obj, new s1(r2Var, 1));
                return;
            default:
                r2 r2Var2 = this.f51748b;
                r2Var2.f(true);
                t91 t91Var = r2Var2.f51734n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                t91Var.d(i10, r2Var2.f51732e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = r2Var2.f51729a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                r2Var2.n();
                return;
        }
    }
}
