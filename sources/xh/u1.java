package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x81;
import org.telegram.ui.ProfileActivity;
public final class u1 implements Utilities.Callback {
    public final int f46484a;
    public final t2 f46485b;

    public u1(t2 t2Var, int i10) {
        this.f46484a = i10;
        this.f46485b = t2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46484a) {
            case 0:
                t2 t2Var = this.f46485b;
                t2Var.e.b((String) obj, new u1(t2Var, 1));
                return;
            default:
                t2 t2Var2 = this.f46485b;
                t2Var2.f(true);
                x81 x81Var = t2Var2.f46473n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                x81Var.d(i10, t2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = t2Var2.f46469a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                t2Var2.n();
                return;
        }
    }
}
