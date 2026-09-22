package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f46449a;
    public final s2 f46450b;

    public t1(s2 s2Var, int i10) {
        this.f46449a = i10;
        this.f46450b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46449a) {
            case 0:
                s2 s2Var = this.f46450b;
                s2Var.e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f46450b;
                s2Var2.f(true);
                y81 y81Var = s2Var2.f46441n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                y81Var.d(i10, s2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = s2Var2.f46437a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
