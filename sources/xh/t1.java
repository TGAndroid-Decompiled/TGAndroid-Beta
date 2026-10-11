package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o91;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f51648a;
    public final s2 f51649b;

    public t1(s2 s2Var, int i10) {
        this.f51648a = i10;
        this.f51649b = s2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51648a) {
            case 0:
                s2 s2Var = this.f51649b;
                s2Var.f51635e.b((String) obj, new t1(s2Var, 1));
                return;
            default:
                s2 s2Var2 = this.f51649b;
                s2Var2.f(true);
                o91 o91Var = s2Var2.f51637n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                o91Var.d(i10, s2Var2.f51635e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = s2Var2.f51632a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                s2Var2.n();
                return;
        }
    }
}
