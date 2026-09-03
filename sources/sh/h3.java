package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class h3 implements org.telegram.ui.ActionBar.c2, l3, GenericProvider {
    public final n3 f47491a;

    public h3(n3 n3Var) {
        this.f47491a = n3Var;
    }

    @Override
    public void g(boolean z4) {
        n3 n3Var = this.f47491a;
        if (!n3Var.J()) {
            n3Var.G.e(0.0f);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f47491a.f26590b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z4;
        Void r22 = (Void) obj;
        if (this.f47491a.f26590b.f29096o1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
