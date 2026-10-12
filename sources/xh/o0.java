package xh;

import org.telegram.messenger.Utilities;
public final class o0 implements Runnable {
    public final int f51661a;
    public final q1 f51662b;
    public final Utilities.Callback f51663c;

    public o0(q1 q1Var, Utilities.Callback callback, int i10) {
        this.f51661a = i10;
        this.f51662b = q1Var;
        this.f51663c = callback;
    }

    @Override
    public final void run() {
        switch (this.f51661a) {
            case 0:
                q1 q1Var = this.f51662b;
                Utilities.Callback callback = this.f51663c;
                if (callback != null) {
                    q1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                q1Var.dismiss();
                return;
            case 1:
                q1 q1Var2 = this.f51662b;
                Utilities.Callback callback2 = this.f51663c;
                if (callback2 != null) {
                    q1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                q1Var2.dismiss();
                return;
            default:
                q1 q1Var3 = this.f51662b;
                Utilities.Callback callback3 = this.f51663c;
                if (callback3 != null) {
                    q1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                q1Var3.dismiss();
                return;
        }
    }
}
