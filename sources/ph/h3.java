package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class h3 implements org.telegram.ui.ActionBar.b2, l3, GenericProvider {
    public final n3 f45830a;

    public h3(n3 n3Var) {
        this.f45830a = n3Var;
    }

    @Override
    public void f(boolean z10) {
        n3 n3Var = this.f45830a;
        if (!n3Var.J()) {
            n3Var.F.e(0.0f);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f45830a.f28403b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f45830a.f28403b.f31029n1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
