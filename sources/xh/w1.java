package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fs0;
public final class w1 implements le.d, Utilities.Callback2Return {
    public final fs0 f50303a;

    public w1(fs0 fs0Var) {
        this.f50303a = fs0Var;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f50303a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        fs0 fs0Var = this.f50303a;
        fs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            fs0Var.h(null, new t1(fs0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void V(float f7, int i10) {
    }
}
