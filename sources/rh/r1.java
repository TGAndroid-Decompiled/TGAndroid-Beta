package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class r1 implements l3, GenericProvider, org.telegram.ui.ActionBar.c2 {
    public final p2 f43789a;

    public r1(p2 p2Var) {
        this.f43789a = p2Var;
    }

    @Override
    public void i(boolean z4) {
        p2 p2Var = this.f43789a;
        if (p2Var.f43731a0 && z4) {
            return;
        }
        p2Var.k(true);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f43789a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z4;
        Void r22 = (Void) obj;
        if (this.f43789a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
