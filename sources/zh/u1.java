package zh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ws0;
public final class u1 implements oe.d, Utilities.Callback2Return {
    public final ws0 f53319a;

    public u1(ws0 ws0Var) {
        this.f53319a = ws0Var;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f53319a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        ws0 ws0Var = this.f53319a;
        ws0Var.i();
        if (((Integer) obj).intValue() == -1) {
            ws0Var.h(null, new t1(ws0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
