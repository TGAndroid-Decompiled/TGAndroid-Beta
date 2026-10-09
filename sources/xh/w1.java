package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rs0;
public final class w1 implements me.d, Utilities.Callback2Return {
    public final rs0 f51572a;

    public w1(rs0 rs0Var) {
        this.f51572a = rs0Var;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f51572a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        rs0 rs0Var = this.f51572a;
        rs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            rs0Var.h(null, new t1(rs0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void A(float f7, int i10) {
    }
}
