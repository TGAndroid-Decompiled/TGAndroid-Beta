package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yr0;
public final class w1 implements le.d, Utilities.Callback2Return {
    public final yr0 f46491a;

    public w1(yr0 yr0Var) {
        this.f46491a = yr0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.f46491a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        yr0 yr0Var = this.f46491a;
        yr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            yr0Var.h(null, new t1(yr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
