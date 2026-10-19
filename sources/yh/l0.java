package yh;

import org.telegram.messenger.Utilities;
public final class l0 implements Runnable {
    public final int f50351a;
    public final o1 f50352b;
    public final Utilities.Callback f50353c;

    public l0(o1 o1Var, Utilities.Callback callback, int i10) {
        this.f50351a = i10;
        this.f50352b = o1Var;
        this.f50353c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50351a) {
            case 0:
                o1 o1Var = this.f50352b;
                Utilities.Callback callback = this.f50353c;
                if (callback != null) {
                    o1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                o1Var.dismiss();
                return;
            case 1:
                o1 o1Var2 = this.f50352b;
                Utilities.Callback callback2 = this.f50353c;
                if (callback2 != null) {
                    o1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                o1Var2.dismiss();
                return;
            default:
                o1 o1Var3 = this.f50352b;
                Utilities.Callback callback3 = this.f50353c;
                if (callback3 != null) {
                    o1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                o1Var3.dismiss();
                return;
        }
    }
}
