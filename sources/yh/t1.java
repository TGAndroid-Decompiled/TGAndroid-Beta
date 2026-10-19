package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.js0;
public final class t1 implements ne.d, Utilities.Callback2Return {
    public final js0 f50519a;

    public t1(js0 js0Var) {
        this.f50519a = js0Var;
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        this.f50519a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        js0 js0Var = this.f50519a;
        js0Var.i();
        if (((Integer) obj).intValue() == -1) {
            js0Var.h(null, new p1(js0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
