package yh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f50458a;
    public final p1 f50459b;
    public final Utilities.Callback f50460c;

    public m0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f50458a = i10;
        this.f50459b = p1Var;
        this.f50460c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50458a) {
            case 0:
                p1 p1Var = this.f50459b;
                Utilities.Callback callback = this.f50460c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f50459b;
                Utilities.Callback callback2 = this.f50460c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f50459b;
                Utilities.Callback callback3 = this.f50460c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
