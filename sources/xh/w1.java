package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr0;
public final class w1 implements le.e, Utilities.Callback2Return {
    public final nr0 f46143a;

    public w1(nr0 nr0Var) {
        this.f46143a = nr0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f46143a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        nr0 nr0Var = this.f46143a;
        nr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            nr0Var.h(null, new t1(nr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
