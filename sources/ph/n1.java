package ph;

import org.telegram.messenger.k20;
import org.telegram.ui.Components.vq0;
public final class n1 implements fe.e, k20 {
    public final vq0 f45246a;

    public n1(vq0 vq0Var) {
        this.f45246a = vq0Var;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        vq0 vq0Var = this.f45246a;
        vq0Var.i();
        if (((Integer) number).intValue() == -1) {
            vq0Var.h(null, new o1(vq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f45246a.l();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
