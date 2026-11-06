package wg;

import bi.ud;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import zh.f2;
import zh.h1;
public final class p implements Runnable {
    public final int f57700a;
    public final Object f57701b;

    public p(Object obj, int i7) {
        this.f57700a = i7;
        this.f57701b = obj;
    }

    @Override
    public final void run() {
        switch (this.f57700a) {
            case 0:
                ((ex) this.f57701b).a(Collections.EMPTY_LIST);
                return;
            case 1:
                ((v) this.f57701b).a(null);
                return;
            case 2:
                b0 b0Var = (b0) this.f57701b;
                b0Var.getClass();
                c0 c0Var = b0Var.f57609r;
                ug.f1 f1Var = new ug.f1(c0Var.f36224o1, c0Var.f28612a, null, null, null, c0Var.I0);
                f1Var.B2 = true;
                f1Var.U1 = true;
                c0Var.f36224o1.showDialog(f1Var);
                return;
            case 3:
                n40 n40Var = (n40) ((qt) this.f57701b).f37394b;
                n40Var.f36176p0 = true;
                a8.b("RoundVideo camera flip first frame: elapsedMs=" + n40.l(n40Var));
                n40Var.v(true);
                n40.m(n40Var);
                return;
            case 4:
                yh.l lVar = (yh.l) this.f57701b;
                lVar.f();
                lVar.e(true);
                return;
            case 5:
                zh.m mVar = (zh.m) this.f57701b;
                mVar.Z1.setTranslationX(mVar.Y1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 6:
                ((zh.c0) this.f57701b).onBackPressed();
                return;
            case 7:
                k41 k41Var = ((h1) this.f57701b).Q1;
                if (k41Var != null) {
                    k41Var.O(false);
                    return;
                }
                return;
            case 8:
                ((zh.w0) this.f57701b).c();
                return;
            case 9:
                ((zh.c1) this.f57701b).invalidateSelf();
                return;
            case 10:
                zh.e1 e1Var = (zh.e1) this.f57701b;
                ud udVar = e1Var.f60202e;
                if (udVar != null) {
                    udVar.d();
                    e1Var.invalidateSelf();
                    return;
                }
                return;
            default:
                ((f2) this.f57701b).p();
                return;
        }
    }
}
