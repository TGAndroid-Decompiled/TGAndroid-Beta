package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.p91;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f51614a;
    public final s2 f51615b;

    public t1(s2 s2Var, int i10) {
        this.f51614a = i10;
        this.f51615b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51614a) {
            case 0:
                s2 s2Var = this.f51615b;
                s2Var.f51601e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f51615b;
                s2Var2.f(true);
                p91 p91Var = s2Var2.f51603n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                p91Var.d(i10, s2Var2.f51601e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = s2Var2.f51598a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
