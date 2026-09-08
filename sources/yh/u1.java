package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr0;
public final class u1 implements le.d, Utilities.Callback2Return {
    public final nr0 f50607a;

    public u1(nr0 nr0Var) {
        this.f50607a = nr0Var;
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.f50607a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        nr0 nr0Var = this.f50607a;
        nr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            nr0Var.h(null, new r1(nr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
