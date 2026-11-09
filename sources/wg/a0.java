package wg;

import bi.ud;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rt;
import zh.d2;
import zh.g1;
public final class a0 implements Runnable {
    public final int f57690a;
    public final Object f57691b;

    public a0(Object obj, int i7) {
        this.f57690a = i7;
        this.f57691b = obj;
    }

    @Override
    public final void run() {
        switch (this.f57690a) {
            case 0:
                b0 b0Var = (b0) this.f57691b;
                b0Var.getClass();
                c0 c0Var = b0Var.f57699r;
                ug.f1 f1Var = new ug.f1(c0Var.f36305o1, c0Var.f28621a, null, null, null, c0Var.I0);
                f1Var.B2 = true;
                f1Var.U1 = true;
                c0Var.f36305o1.showDialog(f1Var);
                return;
            case 1:
                o40 o40Var = (o40) ((rt) this.f57691b).f37805b;
                o40Var.f36634q0 = true;
                a8.b("RoundVideo camera flip first frame: elapsedMs=" + o40.m(o40Var));
                o40Var.w(true);
                o40.n(o40Var);
                return;
            case 2:
                yh.l lVar = (yh.l) this.f57691b;
                lVar.f();
                lVar.e(true);
                return;
            case 3:
                zh.l lVar2 = (zh.l) this.f57691b;
                lVar2.Z1.setTranslationX(lVar2.Y1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 4:
                ((zh.b0) this.f57691b).onBackPressed();
                return;
            case 5:
                m41 m41Var = ((g1) this.f57691b).Q1;
                if (m41Var != null) {
                    m41Var.O(false);
                    return;
                }
                return;
            case 6:
                ((zh.v0) this.f57691b).c();
                return;
            case 7:
                ((zh.b1) this.f57691b).invalidateSelf();
                return;
            case 8:
                zh.d1 d1Var = (zh.d1) this.f57691b;
                ud udVar = d1Var.f60288e;
                if (udVar != null) {
                    udVar.d();
                    d1Var.invalidateSelf();
                    return;
                }
                return;
            default:
                ((d2) this.f57691b).p();
                return;
        }
    }
}
