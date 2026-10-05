package xh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f50116a;
    public final q1 f50117b;
    public final Utilities.Callback f50118c;

    public m0(q1 q1Var, Utilities.Callback callback, int i10) {
        this.f50116a = i10;
        this.f50117b = q1Var;
        this.f50118c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50116a) {
            case 0:
                q1 q1Var = this.f50117b;
                Utilities.Callback callback = this.f50118c;
                if (callback != null) {
                    q1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                q1Var.dismiss();
                return;
            case 1:
                q1 q1Var2 = this.f50117b;
                Utilities.Callback callback2 = this.f50118c;
                if (callback2 != null) {
                    q1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                q1Var2.dismiss();
                return;
            default:
                q1 q1Var3 = this.f50117b;
                Utilities.Callback callback3 = this.f50118c;
                if (callback3 != null) {
                    q1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                q1Var3.dismiss();
                return;
        }
    }
}
