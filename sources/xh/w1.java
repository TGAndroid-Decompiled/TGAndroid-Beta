package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.as0;
public final class w1 implements le.e, Utilities.Callback2Return {
    public final as0 f46470a;

    public w1(as0 as0Var) {
        this.f46470a = as0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f46470a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        as0 as0Var = this.f46470a;
        as0Var.i();
        if (((Integer) obj).intValue() == -1) {
            as0Var.h(null, new t1(as0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
