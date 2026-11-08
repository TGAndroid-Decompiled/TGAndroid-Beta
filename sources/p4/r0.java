package p4;

import android.view.WindowInsets;
import c8.s9;
import java.util.List;
public final class r0 implements h2.j, a1, z0, q2.l, androidx.car.app.utils.b, g9.k {
    public final int f53438a;

    public static WindowInsets b() {
        return WindowInsets.CONSUMED;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.f53438a) {
            case 3:
                g1Var.x0(list);
                return;
            default:
                g1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.f53438a) {
            case 0:
                g1Var.H0();
                return;
            case 1:
            case 3:
            case 4:
            case 5:
            case 9:
            default:
                g1Var.v();
                return;
            case 2:
                g1Var.L();
                return;
            case 6:
                g1Var.stop();
                return;
            case 7:
                g1Var.c0();
                return;
            case 8:
                g1Var.G();
                return;
            case 10:
                g1Var.a();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        r2.p pVar = (r2.p) obj;
        pVar.l();
        return h9.i0.q(h9.o.y(pVar.Y.f58449b, new v0.j(25)));
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public Object l(d0 d0Var, v vVar, int i7) {
        switch (this.f53438a) {
            case 1:
                pb.b bVar = d0Var.f53203e;
                d0Var.s(vVar);
                bVar.getClass();
                return s9.b(new m1(-6));
            case 5:
                d0Var.getClass();
                throw new ClassCastException();
            case 9:
                d0Var.getClass();
                throw new ClassCastException();
            case 11:
                d0Var.getClass();
                throw new ClassCastException();
            case 13:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                pb.b bVar2 = d0Var.f53203e;
                d0Var.s(vVar);
                bVar2.getClass();
                return s9.b(new m1(-6));
        }
    }

    @Override
    public void release() {
    }
}
