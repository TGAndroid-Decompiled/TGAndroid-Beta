package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.ProfileActivity;
public final class r1 implements Utilities.Callback {
    public final int f50560a;
    public final q2 f50561b;

    public r1(q2 q2Var, int i10) {
        this.f50560a = i10;
        this.f50561b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50560a) {
            case 0:
                q2 q2Var = this.f50561b;
                q2Var.f50547e.b((String) obj, new r1(q2Var, 1));
                return;
            default:
                q2 q2Var2 = this.f50561b;
                q2Var2.f(true);
                h81 h81Var = q2Var2.f50549n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                h81Var.d(i10, q2Var2.f50547e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = q2Var2.f50544a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                q2Var2.n();
                return;
        }
    }
}
