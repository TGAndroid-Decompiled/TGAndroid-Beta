package yh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f50459a;
    public final p1 f50460b;
    public final Utilities.Callback f50461c;

    public m0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f50459a = i10;
        this.f50460b = p1Var;
        this.f50461c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50459a) {
            case 0:
                p1 p1Var = this.f50460b;
                Utilities.Callback callback = this.f50461c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f50460b;
                Utilities.Callback callback2 = this.f50461c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f50460b;
                Utilities.Callback callback3 = this.f50461c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
