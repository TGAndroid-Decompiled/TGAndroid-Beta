package xh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f50109a;
    public final q1 f50110b;
    public final Utilities.Callback f50111c;

    public m0(q1 q1Var, Utilities.Callback callback, int i10) {
        this.f50109a = i10;
        this.f50110b = q1Var;
        this.f50111c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50109a) {
            case 0:
                q1 q1Var = this.f50110b;
                Utilities.Callback callback = this.f50111c;
                if (callback != null) {
                    q1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                q1Var.dismiss();
                return;
            case 1:
                q1 q1Var2 = this.f50110b;
                Utilities.Callback callback2 = this.f50111c;
                if (callback2 != null) {
                    q1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                q1Var2.dismiss();
                return;
            default:
                q1 q1Var3 = this.f50110b;
                Utilities.Callback callback3 = this.f50111c;
                if (callback3 != null) {
                    q1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                q1Var3.dismiss();
                return;
        }
    }
}
