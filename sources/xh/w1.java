package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ss0;
public final class w1 implements me.d, Utilities.Callback2Return {
    public final ss0 f51618a;

    public w1(ss0 ss0Var) {
        this.f51618a = ss0Var;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f51618a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        ss0 ss0Var = this.f51618a;
        ss0Var.i();
        if (((Integer) obj).intValue() == -1) {
            ss0Var.h(null, new t1(ss0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void A(float f7, int i10) {
    }
}
