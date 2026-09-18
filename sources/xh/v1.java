package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.or0;
public final class v1 implements le.d, Utilities.Callback2Return {
    public final or0 f46205a;

    public v1(or0 or0Var) {
        this.f46205a = or0Var;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.f46205a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        or0 or0Var = this.f46205a;
        or0Var.i();
        if (((Integer) obj).intValue() == -1) {
            or0Var.h(null, new s1(or0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
