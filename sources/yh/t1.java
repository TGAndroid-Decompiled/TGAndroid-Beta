package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ks0;
public final class t1 implements ne.d, Utilities.Callback2Return {
    public final ks0 f50527a;

    public t1(ks0 ks0Var) {
        this.f50527a = ks0Var;
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        this.f50527a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        ks0 ks0Var = this.f50527a;
        ks0Var.i();
        if (((Integer) obj).intValue() == -1) {
            ks0Var.h(null, new p1(ks0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void H(float f7, int i10) {
    }
}
