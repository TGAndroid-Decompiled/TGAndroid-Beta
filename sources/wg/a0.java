package wg;

import bi.ud;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import zh.d2;
import zh.g1;
public final class a0 implements Runnable {
    public final int f57689a;
    public final Object f57690b;

    public a0(Object obj, int i7) {
        this.f57689a = i7;
        this.f57690b = obj;
    }

    @Override
    public final void run() {
        switch (this.f57689a) {
            case 0:
                b0 b0Var = (b0) this.f57690b;
                b0Var.getClass();
                c0 c0Var = b0Var.f57698r;
                ug.f1 f1Var = new ug.f1(c0Var.f35905r1, c0Var.f28669a, null, null, null, c0Var.I0);
                f1Var.E2 = true;
                f1Var.X1 = true;
                c0Var.f35905r1.showDialog(f1Var);
                return;
            case 1:
                n40 n40Var = (n40) ((qt) this.f57690b).f37395b;
                n40Var.f36226q0 = true;
                a8.b("RoundVideo camera flip first frame: elapsedMs=" + n40.m(n40Var));
                n40Var.w(true);
                n40.n(n40Var);
                return;
            case 2:
                yh.l lVar = (yh.l) this.f57690b;
                lVar.f();
                lVar.e(true);
                return;
            case 3:
                zh.l lVar2 = (zh.l) this.f57690b;
                lVar2.f60435c2.setTranslationX(lVar2.f60434b2.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 4:
                ((zh.b0) this.f57690b).onBackPressed();
                return;
            case 5:
                m41 m41Var = ((g1) this.f57690b).T1;
                if (m41Var != null) {
                    m41Var.O(false);
                    return;
                }
                return;
            case 6:
                ((zh.v0) this.f57690b).c();
                return;
            case 7:
                ((zh.b1) this.f57690b).invalidateSelf();
                return;
            case 8:
                zh.d1 d1Var = (zh.d1) this.f57690b;
                ud udVar = d1Var.f60290e;
                if (udVar != null) {
                    udVar.d();
                    d1Var.invalidateSelf();
                    return;
                }
                return;
            default:
                ((d2) this.f57690b).p();
                return;
        }
    }
}
