package zh;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.vp0;
public final class i1 implements te.b, w10 {
    public final vp0 f60398a;

    public i1(vp0 vp0Var) {
        this.f60398a = vp0Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f60398a.l();
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        vp0 vp0Var = this.f60398a;
        vp0Var.i();
        if (((Integer) number).intValue() == -1) {
            vp0Var.h(null, new j1(vp0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
