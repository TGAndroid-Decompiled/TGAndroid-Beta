package zf;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.f01;

public final class e2 implements Runnable {

    public final int f50401a;

    public final n2 f50402b;

    public e2(n2 n2Var, int i10) {
        this.f50401a = i10;
        this.f50402b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f50401a) {
            case 0:
                n2 n2Var = this.f50402b;
                l2 l2Var = n2Var.S;
                if (l2Var != null) {
                    if (l2Var.f50561r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.S.f50561r);
                        FileLoader.getInstance(n2Var.f50608a).cancelFileUpload(n2Var.S.f50547b, false);
                        n2Var.S.getClass();
                    }
                    n2Var.S.a();
                    n2Var.S = null;
                }
                n2Var.W.a();
                n2Var.W = null;
                break;
            default:
                n2 n2Var2 = this.f50402b;
                f01 f01Var = n2Var2.O;
                if (f01Var != null) {
                    n2Var2.O = null;
                    n2Var2.removeView(f01Var);
                }
                break;
        }
    }
}
