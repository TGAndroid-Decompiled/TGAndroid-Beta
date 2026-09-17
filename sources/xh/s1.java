package xh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i81;
import org.telegram.ui.ProfileActivity;
public final class s1 implements Utilities.Callback {
    public final int f46140a;
    public final r2 f46141b;

    public s1(r2 r2Var, int i10) {
        this.f46140a = i10;
        this.f46141b = r2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46140a) {
            case 0:
                r2 r2Var = this.f46141b;
                r2Var.e.b((String) obj, new s1(r2Var, 1));
                return;
            default:
                r2 r2Var2 = this.f46141b;
                r2Var2.f(true);
                i81 i81Var = r2Var2.f46132n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i81Var.d(i10, r2Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = r2Var2.f46128a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                r2Var2.n();
                return;
        }
    }
}
