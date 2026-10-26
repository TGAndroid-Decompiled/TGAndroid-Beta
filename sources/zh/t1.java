package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t91;
import org.telegram.ui.ProfileActivity;
public final class t1 implements Utilities.Callback {
    public final int f53250a;
    public final r2 f53251b;

    public t1(r2 r2Var, int i10) {
        this.f53250a = i10;
        this.f53251b = r2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53250a) {
            case 0:
                r2 r2Var = this.f53251b;
                r2Var.f(true);
                t91 t91Var = r2Var.f53234n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                t91Var.d(i10, r2Var.e.f(i10) + 1);
                org.telegram.ui.ActionBar.r2 r2Var2 = r2Var.f53230a;
                if (r2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) r2Var2).O4(true);
                }
                r2Var.o();
                return;
            default:
                r2 r2Var3 = this.f53251b;
                r2Var3.e.b((String) obj, new t1(r2Var3, 0));
                return;
        }
    }
}
