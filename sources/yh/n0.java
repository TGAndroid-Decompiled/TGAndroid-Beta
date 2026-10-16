package yh;

import org.telegram.messenger.Utilities;
public final class n0 implements Runnable {
    public final int f49031a;
    public final p1 f49032b;
    public final Utilities.Callback f49033c;

    public n0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f49031a = i10;
        this.f49032b = p1Var;
        this.f49033c = callback;
    }

    @Override
    public final void run() {
        switch (this.f49031a) {
            case 0:
                p1 p1Var = this.f49032b;
                Utilities.Callback callback = this.f49033c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f49032b;
                Utilities.Callback callback2 = this.f49033c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f49032b;
                Utilities.Callback callback3 = this.f49033c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
