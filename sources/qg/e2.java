package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l11;
public final class e2 implements Runnable {
    public final int f41623a;
    public final n2 f41624b;

    public e2(n2 n2Var, int i10) {
        this.f41623a = i10;
        this.f41624b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41623a) {
            case 0:
                n2 n2Var = this.f41624b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41749r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41749r);
                        FileLoader.getInstance(n2Var.f41808a).cancelFileUpload(n2Var.W.f41736b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41814d0.a();
                n2Var.f41814d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41624b;
                l11 l11Var = n2Var2.S;
                if (l11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(l11Var);
                    return;
                }
                return;
        }
    }
}
