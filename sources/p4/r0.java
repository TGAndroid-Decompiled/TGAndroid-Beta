package p4;

import android.view.WindowInsets;
import c8.s9;
import java.util.List;
public final class r0 implements a1, h2.j, z0, q2.l, androidx.car.app.utils.b, g9.k {
    public final int f53347a;

    public static WindowInsets b() {
        return WindowInsets.CONSUMED;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.f53347a) {
            case 2:
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
        switch (this.f53347a) {
            case 1:
                g1Var.L();
                return;
            case 2:
            case 3:
            case 4:
            case 8:
            default:
                g1Var.v();
                return;
            case 5:
                g1Var.stop();
                return;
            case 6:
                g1Var.c0();
                return;
            case 7:
                g1Var.G();
                return;
            case 9:
                g1Var.a();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        r2.q qVar = (r2.q) obj;
        qVar.l();
        return h9.i0.q(h9.o.y(qVar.Y.f58355b, new v0.j(24)));
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public Object i(d0 d0Var, v vVar, int i7) {
        switch (this.f53347a) {
            case 0:
                pb.b bVar = d0Var.f53112e;
                d0Var.s(vVar);
                bVar.getClass();
                return s9.b(new m1(-6));
            case 4:
                d0Var.getClass();
                throw new ClassCastException();
            case 8:
                d0Var.getClass();
                throw new ClassCastException();
            case 10:
                d0Var.getClass();
                throw new ClassCastException();
            case 12:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                pb.b bVar2 = d0Var.f53112e;
                d0Var.s(vVar);
                bVar2.getClass();
                return s9.b(new m1(-6));
        }
    }

    @Override
    public void release() {
    }
}
