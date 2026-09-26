package xh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f46284a;
    public final r1 f46285b;
    public final Utilities.Callback f46286c;

    public m0(r1 r1Var, Utilities.Callback callback, int i10) {
        this.f46284a = i10;
        this.f46285b = r1Var;
        this.f46286c = callback;
    }

    @Override
    public final void run() {
        switch (this.f46284a) {
            case 0:
                r1 r1Var = this.f46285b;
                Utilities.Callback callback = this.f46286c;
                if (callback != null) {
                    r1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                r1Var.dismiss();
                return;
            case 1:
                r1 r1Var2 = this.f46285b;
                Utilities.Callback callback2 = this.f46286c;
                if (callback2 != null) {
                    r1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                r1Var2.dismiss();
                return;
            default:
                r1 r1Var3 = this.f46285b;
                Utilities.Callback callback3 = this.f46286c;
                if (callback3 != null) {
                    r1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                r1Var3.dismiss();
                return;
        }
    }
}
