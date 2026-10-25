package zh;

import org.telegram.messenger.Utilities;
public final class l0 implements Runnable {
    public final int f53093a;
    public final p1 f53094b;
    public final Utilities.Callback f53095c;

    public l0(p1 p1Var, Utilities.Callback callback, int i10) {
        this.f53093a = i10;
        this.f53094b = p1Var;
        this.f53095c = callback;
    }

    @Override
    public final void run() {
        switch (this.f53093a) {
            case 0:
                p1 p1Var = this.f53094b;
                Utilities.Callback callback = this.f53095c;
                if (callback != null) {
                    p1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                p1Var.dismiss();
                return;
            case 1:
                p1 p1Var2 = this.f53094b;
                Utilities.Callback callback2 = this.f53095c;
                if (callback2 != null) {
                    p1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                p1Var2.dismiss();
                return;
            default:
                p1 p1Var3 = this.f53094b;
                Utilities.Callback callback3 = this.f53095c;
                if (callback3 != null) {
                    p1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                p1Var3.dismiss();
                return;
        }
    }
}
