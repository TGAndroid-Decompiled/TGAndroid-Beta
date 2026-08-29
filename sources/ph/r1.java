package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class r1 implements l3, GenericProvider, org.telegram.ui.ActionBar.b2 {
    public final p2 f46018a;

    public r1(p2 p2Var) {
        this.f46018a = p2Var;
    }

    @Override
    public void f(boolean z10) {
        p2 p2Var = this.f46018a;
        if (p2Var.Z && z10) {
            return;
        }
        p2Var.k(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f46018a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f46018a.f45963e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
