package wg;

import bi.ud;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import zh.f2;
import zh.h1;
public final class p implements Runnable {
    public final int f57699a;
    public final Object f57700b;

    public p(Object obj, int i7) {
        this.f57699a = i7;
        this.f57700b = obj;
    }

    @Override
    public final void run() {
        switch (this.f57699a) {
            case 0:
                ((ex) this.f57700b).a(Collections.EMPTY_LIST);
                return;
            case 1:
                ((v) this.f57700b).a(null);
                return;
            case 2:
                b0 b0Var = (b0) this.f57700b;
                b0Var.getClass();
                c0 c0Var = b0Var.f57608r;
                ug.f1 f1Var = new ug.f1(c0Var.f36263o1, c0Var.f28613a, null, null, null, c0Var.I0);
                f1Var.B2 = true;
                f1Var.U1 = true;
                c0Var.f36263o1.showDialog(f1Var);
                return;
            case 3:
                n40 n40Var = (n40) ((qt) this.f57700b).f37389b;
                n40Var.f36211p0 = true;
                a8.b("RoundVideo camera flip first frame: elapsedMs=" + n40.l(n40Var));
                n40Var.v(true);
                n40.m(n40Var);
                return;
            case 4:
                yh.l lVar = (yh.l) this.f57700b;
                lVar.f();
                lVar.e(true);
                return;
            case 5:
                zh.m mVar = (zh.m) this.f57700b;
                mVar.Z1.setTranslationX(mVar.Y1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 6:
                ((zh.c0) this.f57700b).onBackPressed();
                return;
            case 7:
                l41 l41Var = ((h1) this.f57700b).Q1;
                if (l41Var != null) {
                    l41Var.O(false);
                    return;
                }
                return;
            case 8:
                ((zh.w0) this.f57700b).c();
                return;
            case 9:
                ((zh.c1) this.f57700b).invalidateSelf();
                return;
            case 10:
                zh.e1 e1Var = (zh.e1) this.f57700b;
                ud udVar = e1Var.f60201e;
                if (udVar != null) {
                    udVar.d();
                    e1Var.invalidateSelf();
                    return;
                }
                return;
            default:
                ((f2) this.f57700b).p();
                return;
        }
    }
}
