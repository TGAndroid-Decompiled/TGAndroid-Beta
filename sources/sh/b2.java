package sh;

import org.telegram.messenger.R;
public final class b2 extends org.telegram.ui.ActionBar.j {
    public final p2 f47403a;

    public b2(p2 p2Var) {
        this.f47403a = p2Var;
    }

    @Override
    public final void b(int i10) {
        p2 p2Var = this.f47403a;
        if (i10 == -1) {
            if (!p2Var.f47648x.z()) {
                p2Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            p2Var.f47644u0 = true;
            p2Var.k(true);
        }
    }
}
