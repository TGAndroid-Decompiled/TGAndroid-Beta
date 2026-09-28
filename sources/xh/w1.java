package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs0;
public final class w1 implements le.e, Utilities.Callback2Return {
    public final bs0 f46471a;

    public w1(bs0 bs0Var) {
        this.f46471a = bs0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f46471a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        bs0 bs0Var = this.f46471a;
        bs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            bs0Var.h(null, new t1(bs0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
