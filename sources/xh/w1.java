package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ts0;
public final class w1 implements me.d, Utilities.Callback2Return {
    public final ts0 f51661a;

    public w1(ts0 ts0Var) {
        this.f51661a = ts0Var;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f51661a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        ts0 ts0Var = this.f51661a;
        ts0Var.i();
        if (((Integer) obj).intValue() == -1) {
            ts0Var.h(null, new t1(ts0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void A(float f7, int i10) {
    }
}
