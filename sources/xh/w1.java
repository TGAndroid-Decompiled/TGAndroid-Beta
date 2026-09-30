package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cs0;
public final class w1 implements le.e, Utilities.Callback2Return {
    public final cs0 f46579a;

    public w1(cs0 cs0Var) {
        this.f46579a = cs0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f46579a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        cs0 cs0Var = this.f46579a;
        cs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            cs0Var.h(null, new t1(cs0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
