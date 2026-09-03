package rh;

import org.telegram.messenger.R;
public final class b2 extends org.telegram.ui.ActionBar.j {
    public final p2 f43536a;

    public b2(p2 p2Var) {
        this.f43536a = p2Var;
    }

    @Override
    public final void b(int i10) {
        p2 p2Var = this.f43536a;
        if (i10 == -1) {
            if (!p2Var.f43760x.D()) {
                p2Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            p2Var.f43756u0 = true;
            p2Var.k(true);
        }
    }
}
