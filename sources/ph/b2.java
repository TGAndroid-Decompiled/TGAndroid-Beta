package ph;

import org.telegram.messenger.R;
public final class b2 extends org.telegram.ui.ActionBar.k {
    public final p2 f45744a;

    public b2(p2 p2Var) {
        this.f45744a = p2Var;
    }

    @Override
    public final void b(int i10) {
        p2 p2Var = this.f45744a;
        if (i10 == -1) {
            if (!p2Var.f45987x.z()) {
                p2Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            p2Var.f45982t0 = true;
            p2Var.k(true);
        }
    }
}
