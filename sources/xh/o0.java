package xh;

import org.telegram.messenger.Utilities;
public final class o0 implements Runnable {
    public final int f51669a;
    public final q1 f51670b;
    public final Utilities.Callback f51671c;

    public o0(q1 q1Var, Utilities.Callback callback, int i10) {
        this.f51669a = i10;
        this.f51670b = q1Var;
        this.f51671c = callback;
    }

    @Override
    public final void run() {
        switch (this.f51669a) {
            case 0:
                q1 q1Var = this.f51670b;
                Utilities.Callback callback = this.f51671c;
                if (callback != null) {
                    q1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                q1Var.dismiss();
                return;
            case 1:
                q1 q1Var2 = this.f51670b;
                Utilities.Callback callback2 = this.f51671c;
                if (callback2 != null) {
                    q1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                q1Var2.dismiss();
                return;
            default:
                q1 q1Var3 = this.f51670b;
                Utilities.Callback callback3 = this.f51671c;
                if (callback3 != null) {
                    q1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                q1Var3.dismiss();
                return;
        }
    }
}
