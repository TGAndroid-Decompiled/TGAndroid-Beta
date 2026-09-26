package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w81;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f46407a;
    public final s2 f46408b;

    public t1(s2 s2Var, int i10) {
        this.f46407a = i10;
        this.f46408b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46407a) {
            case 0:
                s2 s2Var = this.f46408b;
                s2Var.e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f46408b;
                s2Var2.f(true);
                w81 w81Var = s2Var2.f46399n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                w81Var.d(i10, s2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = s2Var2.f46395a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
