package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c91;
import org.telegram.ui.ProfileActivity;
public final class p1 implements Utilities.Callback {
    public final int f50454a;
    public final p2 f50455b;

    public p1(p2 p2Var, int i10) {
        this.f50454a = i10;
        this.f50455b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50454a) {
            case 0:
                p2 p2Var = this.f50455b;
                p2Var.e.b((String) obj, new p1(p2Var, 1));
                return;
            default:
                p2 p2Var2 = this.f50455b;
                p2Var2.f(true);
                c91 c91Var = p2Var2.f50460n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                c91Var.d(i10, p2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = p2Var2.f50456a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                p2Var2.n();
                return;
        }
    }
}
