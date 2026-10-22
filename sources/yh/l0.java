package yh;

import org.telegram.messenger.Utilities;
public final class l0 implements Runnable {
    public final int f50359a;
    public final o1 f50360b;
    public final Utilities.Callback f50361c;

    public l0(o1 o1Var, Utilities.Callback callback, int i10) {
        this.f50359a = i10;
        this.f50360b = o1Var;
        this.f50361c = callback;
    }

    @Override
    public final void run() {
        switch (this.f50359a) {
            case 0:
                o1 o1Var = this.f50360b;
                Utilities.Callback callback = this.f50361c;
                if (callback != null) {
                    o1Var.getClass();
                    callback.run(Boolean.FALSE);
                }
                o1Var.dismiss();
                return;
            case 1:
                o1 o1Var2 = this.f50360b;
                Utilities.Callback callback2 = this.f50361c;
                if (callback2 != null) {
                    o1Var2.getClass();
                    callback2.run(Boolean.FALSE);
                }
                o1Var2.dismiss();
                return;
            default:
                o1 o1Var3 = this.f50360b;
                Utilities.Callback callback3 = this.f50361c;
                if (callback3 != null) {
                    o1Var3.getClass();
                    callback3.run(Boolean.FALSE);
                }
                o1Var3.dismiss();
                return;
        }
    }
}
