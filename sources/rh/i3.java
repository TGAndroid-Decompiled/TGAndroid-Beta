package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i3 implements org.telegram.ui.ActionBar.c2, m3, GenericProvider {
    public final o3 f43562a;

    public i3(o3 o3Var) {
        this.f43562a = o3Var;
    }

    @Override
    public void g(boolean z4) {
        o3 o3Var = this.f43562a;
        if (!o3Var.J()) {
            o3Var.G.e(0.0f);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f43562a.f24278b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z4;
        Void r22 = (Void) obj;
        if (this.f43562a.f24278b.f26726o1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
