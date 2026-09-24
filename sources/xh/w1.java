package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zr0;
public final class w1 implements le.e, Utilities.Callback2Return {
    public final zr0 f46457a;

    public w1(zr0 zr0Var) {
        this.f46457a = zr0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f46457a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        zr0 zr0Var = this.f46457a;
        zr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            zr0Var.h(null, new t1(zr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
