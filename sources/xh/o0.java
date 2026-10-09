package xh;

import org.telegram.messenger.Utilities;
public final class o0 implements Runnable {
    public final int f51423a;
    public final r1 f51424b;
    public final Utilities.Callback f51425c;

    public o0(r1 r1Var, Utilities.Callback callback, int i10) {
        this.f51423a = i10;
        this.f51424b = r1Var;
        this.f51425c = callback;
    }

    @Override
    public final void run() {
        switch (this.f51423a) {
            case 0:
                r1 r1Var = this.f51424b;
                Utilities.Callback callback = this.f51425c;
                if (callback != null) {
                    r1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                r1Var.dismiss();
                return;
            case 1:
                r1 r1Var2 = this.f51424b;
                Utilities.Callback callback2 = this.f51425c;
                if (callback2 != null) {
                    r1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                r1Var2.dismiss();
                return;
            default:
                r1 r1Var3 = this.f51424b;
                Utilities.Callback callback3 = this.f51425c;
                if (callback3 != null) {
                    r1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                r1Var3.dismiss();
                return;
        }
    }
}
