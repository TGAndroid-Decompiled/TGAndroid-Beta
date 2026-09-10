package wh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wr0;
public final class u1 implements le.d, Utilities.Callback2Return {
    public final wr0 f44364a;

    public u1(wr0 wr0Var) {
        this.f44364a = wr0Var;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        this.f44364a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        wr0 wr0Var = this.f44364a;
        wr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            wr0Var.h(null, new r1(wr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void B(float f7, int i10) {
    }
}
