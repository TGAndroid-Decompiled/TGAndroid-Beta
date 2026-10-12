package yh;

import org.telegram.messenger.Utilities;
public final class n0 implements Runnable {
    public final int f49032a;
    public final p1 f49033b;
    public final Utilities.Callback f49034c;

    public n0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f49032a = i10;
        this.f49033b = p1Var;
        this.f49034c = callback;
    }

    @Override
    public final void run() {
        switch (this.f49032a) {
            case 0:
                p1 p1Var = this.f49033b;
                Utilities.Callback callback = this.f49034c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f49033b;
                Utilities.Callback callback2 = this.f49034c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f49033b;
                Utilities.Callback callback3 = this.f49034c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
