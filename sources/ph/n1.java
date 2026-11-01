package ph;

import org.telegram.messenger.l20;
import org.telegram.ui.Components.wq0;
public final class n1 implements fe.e, l20 {
    public final wq0 f45257a;

    public n1(wq0 wq0Var) {
        this.f45257a = wq0Var;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        wq0 wq0Var = this.f45257a;
        wq0Var.i();
        if (((Integer) number).intValue() == -1) {
            wq0Var.h(null, new o1(wq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f45257a.l();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
