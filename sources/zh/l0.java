package zh;

import org.telegram.messenger.Utilities;
public final class l0 implements Runnable {
    public final int f53154a;
    public final p1 f53155b;
    public final Utilities.Callback f53156c;

    public l0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f53154a = i10;
        this.f53155b = p1Var;
        this.f53156c = callback;
    }

    @Override
    public final void run() {
        switch (this.f53154a) {
            case 0:
                p1 p1Var = this.f53155b;
                Utilities.Callback callback = this.f53156c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f53155b;
                Utilities.Callback callback2 = this.f53156c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f53155b;
                Utilities.Callback callback3 = this.f53156c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
