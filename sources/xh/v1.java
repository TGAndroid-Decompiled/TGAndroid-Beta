package xh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xs0;
public final class v1 implements me.d, Utilities.Callback2Return {
    public final xs0 f51783a;

    public v1(xs0 xs0Var) {
        this.f51783a = xs0Var;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f51783a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        xs0 xs0Var = this.f51783a;
        xs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            xs0Var.h(null, new s1(xs0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
