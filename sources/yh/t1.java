package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.is0;
public final class t1 implements ne.d, Utilities.Callback2Return {
    public final is0 f50518a;

    public t1(is0 is0Var) {
        this.f50518a = is0Var;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        is0 is0Var = this.f50518a;
        is0Var.i();
        if (((Integer) obj).intValue() == -1) {
            is0Var.h(null, new p1(is0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void u(int i10, float f7, float f10, ne.e eVar) {
        this.f50518a.l();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
