package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g91;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f50245a;
    public final s2 f50246b;

    public t1(s2 s2Var, int i10) {
        this.f50245a = i10;
        this.f50246b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50245a) {
            case 0:
                s2 s2Var = this.f50246b;
                s2Var.f50235e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f50246b;
                s2Var2.f(true);
                g91 g91Var = s2Var2.f50237n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                g91Var.d(i10, s2Var2.f50235e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = s2Var2.f50232a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
