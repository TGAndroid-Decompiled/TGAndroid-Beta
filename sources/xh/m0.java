package xh;

import org.telegram.messenger.Utilities;
public final class m0 implements Runnable {
    public final int f46258a;
    public final r1 f46259b;
    public final Utilities.Callback f46260c;

    public m0(r1 r1Var, Utilities.Callback callback, int i10) {
        this.f46258a = i10;
        this.f46259b = r1Var;
        this.f46260c = callback;
    }

    @Override
    public final void run() {
        switch (this.f46258a) {
            case 0:
                r1 r1Var = this.f46259b;
                Utilities.Callback callback = this.f46260c;
                if (callback != null) {
                    r1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                r1Var.dismiss();
                return;
            case 1:
                r1 r1Var2 = this.f46259b;
                Utilities.Callback callback2 = this.f46260c;
                if (callback2 != null) {
                    r1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                r1Var2.dismiss();
                return;
            default:
                r1 r1Var3 = this.f46259b;
                Utilities.Callback callback3 = this.f46260c;
                if (callback3 != null) {
                    r1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                r1Var3.dismiss();
                return;
        }
    }
}
