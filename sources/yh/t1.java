package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ns0;
public final class t1 implements ne.d, Utilities.Callback2Return {
    public final ns0 f50985a;

    public t1(ns0 ns0Var) {
        this.f50985a = ns0Var;
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.f50985a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        ns0 ns0Var = this.f50985a;
        ns0Var.i();
        if (((Integer) obj).intValue() == -1) {
            ns0Var.h(null, new p1(ns0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
