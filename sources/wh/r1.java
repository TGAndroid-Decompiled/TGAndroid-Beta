package wh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u81;
import org.telegram.ui.ProfileActivity;
public final class r1 implements Utilities.Callback {
    public final int f44337a;
    public final q2 f44338b;

    public r1(q2 q2Var, int i10) {
        this.f44337a = i10;
        this.f44338b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44337a) {
            case 0:
                q2 q2Var = this.f44338b;
                q2Var.e.b((String) obj, new r1(q2Var, 1));
                return;
            default:
                q2 q2Var2 = this.f44338b;
                q2Var2.f(true);
                u81 u81Var = q2Var2.f44321n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                u81Var.d(i10, q2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = q2Var2.f44317a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                q2Var2.n();
                return;
        }
    }
}
