package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.ProfileActivity;
public final class p1 implements Utilities.Callback {
    public final int f50922a;
    public final p2 f50923b;

    public p1(p2 p2Var, int i10) {
        this.f50922a = i10;
        this.f50923b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50922a) {
            case 0:
                p2 p2Var = this.f50923b;
                p2Var.e.b((String) obj, new p1(p2Var, 1));
                return;
            default:
                p2 p2Var2 = this.f50923b;
                p2Var2.f(true);
                k91 k91Var = p2Var2.f50928n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k91Var.d(i10, p2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = p2Var2.f50924a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).I4(true);
                }
                p2Var2.n();
                return;
        }
    }
}
