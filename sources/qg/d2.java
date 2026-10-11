package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.e21;
public final class d2 implements Runnable {
    public final int f46302a;
    public final n2 f46303b;

    public d2(n2 n2Var, int i10) {
        this.f46302a = i10;
        this.f46303b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f46302a) {
            case 0:
                n2 n2Var = this.f46303b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f46449r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f46449r);
                        FileLoader.getInstance(n2Var.f46509a).cancelFileUpload(n2Var.W.f46435b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f46515d0.a();
                n2Var.f46515d0 = null;
                return;
            default:
                n2 n2Var2 = this.f46303b;
                e21 e21Var = n2Var2.S;
                if (e21Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(e21Var);
                    return;
                }
                return;
        }
    }
}
