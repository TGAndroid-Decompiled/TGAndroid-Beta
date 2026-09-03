package ph;

import org.telegram.messenger.Utilities;
public final class m implements Utilities.Callback {
    public final int f41985a;
    public final t9 f41986b;

    public m(t9 t9Var, int i10) {
        this.f41985a = i10;
        this.f41986b = t9Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f41985a) {
            case 0:
                int intValue = num.intValue();
                t9 t9Var = this.f41986b;
                t9Var.setPeriod(intValue);
                Utilities.Callback callback = t9Var.f42199y1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f41986b.f42200z1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
