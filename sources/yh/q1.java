package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b91;
import org.telegram.ui.ProfileActivity;
public final class q1 implements Utilities.Callback {
    public final int f50515a;
    public final q2 f50516b;

    public q1(q2 q2Var, int i10) {
        this.f50515a = i10;
        this.f50516b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50515a) {
            case 0:
                q2 q2Var = this.f50516b;
                q2Var.e.b((String) obj, new q1(q2Var, 1));
                return;
            default:
                q2 q2Var2 = this.f50516b;
                q2Var2.f(true);
                b91 b91Var = q2Var2.f50521n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                b91Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = q2Var2.f50517a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                q2Var2.n();
                return;
        }
    }
}
