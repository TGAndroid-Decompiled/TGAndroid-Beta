package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d91;
import org.telegram.ui.ProfileActivity;
public final class p1 implements Utilities.Callback {
    public final int f50464a;
    public final p2 f50465b;

    public p1(p2 p2Var, int i10) {
        this.f50464a = i10;
        this.f50465b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50464a) {
            case 0:
                p2 p2Var = this.f50465b;
                p2Var.e.b((String) obj, new p1(p2Var, 1));
                return;
            default:
                p2 p2Var2 = this.f50465b;
                p2Var2.f(true);
                d91 d91Var = p2Var2.f50470n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                d91Var.d(i10, p2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = p2Var2.f50466a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                p2Var2.n();
                return;
        }
    }
}
