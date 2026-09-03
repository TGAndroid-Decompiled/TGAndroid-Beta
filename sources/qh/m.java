package qh;

import org.telegram.messenger.Utilities;
public final class m implements Utilities.Callback {
    public final int f45719a;
    public final q9 f45720b;

    public m(q9 q9Var, int i10) {
        this.f45719a = i10;
        this.f45720b = q9Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f45719a) {
            case 0:
                int intValue = num.intValue();
                q9 q9Var = this.f45720b;
                q9Var.setPeriod(intValue);
                Utilities.Callback callback = q9Var.f45874y1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f45720b.f45875z1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
