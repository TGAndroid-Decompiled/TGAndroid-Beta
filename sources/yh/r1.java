package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.ProfileActivity;
public final class r1 implements Utilities.Callback {
    public final int f49104a;
    public final q2 f49105b;

    public r1(q2 q2Var, int i10) {
        this.f49104a = i10;
        this.f49105b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f49104a) {
            case 0:
                q2 q2Var = this.f49105b;
                q2Var.e.b((String) obj, new r1(q2Var, 1));
                return;
            default:
                q2 q2Var2 = this.f49105b;
                q2Var2.f(true);
                k91 k91Var = q2Var2.f49092n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k91Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = q2Var2.f49088a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                q2Var2.n();
                return;
        }
    }
}
