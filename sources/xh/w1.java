package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gs0;
public final class w1 implements le.d, Utilities.Callback2Return {
    public final gs0 f50310a;

    public w1(gs0 gs0Var) {
        this.f50310a = gs0Var;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f50310a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        gs0 gs0Var = this.f50310a;
        gs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            gs0Var.h(null, new t1(gs0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void V(float f7, int i10) {
    }
}
