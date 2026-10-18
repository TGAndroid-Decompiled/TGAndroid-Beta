package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b91;
import org.telegram.ui.ProfileActivity;
public final class p1 implements Utilities.Callback {
    public final int f50455a;
    public final p2 f50456b;

    public p1(p2 p2Var, int i10) {
        this.f50455a = i10;
        this.f50456b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50455a) {
            case 0:
                p2 p2Var = this.f50456b;
                p2Var.e.b((String) obj, new p1(p2Var, 1));
                return;
            default:
                p2 p2Var2 = this.f50456b;
                p2Var2.f(true);
                b91 b91Var = p2Var2.f50461n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                b91Var.d(i10, p2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = p2Var2.f50457a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                p2Var2.n();
                return;
        }
    }
}
