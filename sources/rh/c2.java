package rh;

import org.telegram.messenger.R;
public final class c2 extends org.telegram.ui.ActionBar.j {
    public final q2 f43485a;

    public c2(q2 q2Var) {
        this.f43485a = q2Var;
    }

    @Override
    public final void b(int i10) {
        q2 q2Var = this.f43485a;
        if (i10 == -1) {
            if (!q2Var.f43708x.z()) {
                q2Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            q2Var.f43704u0 = true;
            q2Var.k(true);
        }
    }
}
