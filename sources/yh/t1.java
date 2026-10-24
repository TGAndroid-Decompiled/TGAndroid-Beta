package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ms0;
public final class t1 implements ne.d, Utilities.Callback2Return {
    public final ms0 f50984a;

    public t1(ms0 ms0Var) {
        this.f50984a = ms0Var;
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.f50984a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        ms0 ms0Var = this.f50984a;
        ms0Var.i();
        if (((Integer) obj).intValue() == -1) {
            ms0Var.h(null, new p1(ms0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
