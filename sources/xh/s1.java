package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.ProfileActivity;
public final class s1 implements Utilities.Callback {
    public final int f46117a;
    public final r2 f46118b;

    public s1(r2 r2Var, int i10) {
        this.f46117a = i10;
        this.f46118b = r2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46117a) {
            case 0:
                r2 r2Var = this.f46118b;
                r2Var.e.b((String) obj, new s1(r2Var, 1));
                return;
            default:
                r2 r2Var2 = this.f46118b;
                r2Var2.f(true);
                h81 h81Var = r2Var2.f46109n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                h81Var.d(i10, r2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = r2Var2.f46105a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                r2Var2.n();
                return;
        }
    }
}
