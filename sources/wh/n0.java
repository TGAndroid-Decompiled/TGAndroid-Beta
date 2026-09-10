package wh;

import org.telegram.messenger.Utilities;
public final class n0 implements Runnable {
    public final int f44262a;
    public final p1 f44263b;
    public final Utilities.Callback f44264c;

    public n0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f44262a = i10;
        this.f44263b = p1Var;
        this.f44264c = callback;
    }

    @Override
    public final void run() {
        switch (this.f44262a) {
            case 0:
                p1 p1Var = this.f44263b;
                Utilities.Callback callback = this.f44264c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f44263b;
                Utilities.Callback callback2 = this.f44264c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f44263b;
                Utilities.Callback callback3 = this.f44264c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
