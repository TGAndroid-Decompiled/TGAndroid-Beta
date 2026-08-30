package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class s1 implements m3, GenericProvider, org.telegram.ui.ActionBar.c2 {
    public final q2 f43737a;

    public s1(q2 q2Var) {
        this.f43737a = q2Var;
    }

    @Override
    public void g(boolean z4) {
        q2 q2Var = this.f43737a;
        if (q2Var.f43679a0 && z4) {
            return;
        }
        q2Var.k(true);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f43737a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z4;
        Void r22 = (Void) obj;
        if (this.f43737a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
