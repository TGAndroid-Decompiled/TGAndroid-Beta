package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b91;
import org.telegram.ui.ProfileActivity;
public final class q1 implements Utilities.Callback {
    public final int f50490a;
    public final q2 f50491b;

    public q1(q2 q2Var, int i10) {
        this.f50490a = i10;
        this.f50491b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50490a) {
            case 0:
                q2 q2Var = this.f50491b;
                q2Var.e.b((String) obj, new q1(q2Var, 1));
                return;
            default:
                q2 q2Var2 = this.f50491b;
                q2Var2.f(true);
                b91 b91Var = q2Var2.f50496n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                b91Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = q2Var2.f50492a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                q2Var2.n();
                return;
        }
    }
}
