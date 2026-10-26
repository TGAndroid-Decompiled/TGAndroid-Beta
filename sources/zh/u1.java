package zh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vs0;
public final class u1 implements oe.d, Utilities.Callback2Return {
    public final vs0 f53261a;

    public u1(vs0 vs0Var) {
        this.f53261a = vs0Var;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f53261a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        vs0 vs0Var = this.f53261a;
        vs0Var.i();
        if (((Integer) obj).intValue() == -1) {
            vs0Var.h(null, new t1(vs0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
