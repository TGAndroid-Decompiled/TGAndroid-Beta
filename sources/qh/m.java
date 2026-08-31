package qh;

import org.telegram.messenger.Utilities;
public final class m implements Utilities.Callback {
    public final int f45644a;
    public final r9 f45645b;

    public m(r9 r9Var, int i10) {
        this.f45644a = i10;
        this.f45645b = r9Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f45644a) {
            case 0:
                int intValue = num.intValue();
                r9 r9Var = this.f45645b;
                r9Var.setPeriod(intValue);
                Utilities.Callback callback = r9Var.f45869y1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f45645b.f45870z1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
