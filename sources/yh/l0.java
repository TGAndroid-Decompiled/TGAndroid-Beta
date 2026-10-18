package yh;

import org.telegram.messenger.Utilities;
public final class l0 implements Runnable {
    public final int f50350a;
    public final o1 f50351b;
    public final Utilities.Callback f50352c;

    public l0(o1 o1Var, Utilities.Callback callback, int i10) {
        this.f50350a = i10;
        this.f50351b = o1Var;
        this.f50352c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50350a) {
            case 0:
                o1 o1Var = this.f50351b;
                Utilities.Callback callback = this.f50352c;
                if (callback != null) {
                    o1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                o1Var.dismiss();
                return;
            case 1:
                o1 o1Var2 = this.f50351b;
                Utilities.Callback callback2 = this.f50352c;
                if (callback2 != null) {
                    o1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                o1Var2.dismiss();
                return;
            default:
                o1 o1Var3 = this.f50351b;
                Utilities.Callback callback3 = this.f50352c;
                if (callback3 != null) {
                    o1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                o1Var3.dismiss();
                return;
        }
    }
}
