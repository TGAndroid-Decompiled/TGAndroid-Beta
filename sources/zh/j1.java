package zh;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.up0;
public final class j1 implements te.b, w10 {
    public final up0 f60311a;

    public j1(up0 up0Var) {
        this.f60311a = up0Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f60311a.l();
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        up0 up0Var = this.f60311a;
        up0Var.i();
        if (((Integer) number).intValue() == -1) {
            up0Var.h(null, new k1(up0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
