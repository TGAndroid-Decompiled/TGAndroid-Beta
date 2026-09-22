package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs0;
public final class w1 implements le.d, Utilities.Callback2Return {
    public final bs0 f46512a;

    public w1(bs0 bs0Var) {
        this.f46512a = bs0Var;
    }

    @Override
    public void H(int i10, float f7, float f10, le.e eVar) {
        this.f46512a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        bs0 bs0Var = this.f46512a;
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
