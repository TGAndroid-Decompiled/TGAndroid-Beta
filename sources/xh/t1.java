package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v81;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f46409a;
    public final s2 f46410b;

    public t1(s2 s2Var, int i10) {
        this.f46409a = i10;
        this.f46410b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46409a) {
            case 0:
                s2 s2Var = this.f46410b;
                s2Var.e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f46410b;
                s2Var2.f(true);
                v81 v81Var = s2Var2.f46401n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v81Var.d(i10, s2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = s2Var2.f46397a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
