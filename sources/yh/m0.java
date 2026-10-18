package yh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f50410a;
    public final p1 f50411b;
    public final Utilities.Callback f50412c;

    public m0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f50410a = i10;
        this.f50411b = p1Var;
        this.f50412c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50410a) {
            case 0:
                p1 p1Var = this.f50411b;
                Utilities.Callback callback = this.f50412c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f50411b;
                Utilities.Callback callback2 = this.f50412c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f50411b;
                Utilities.Callback callback3 = this.f50412c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
