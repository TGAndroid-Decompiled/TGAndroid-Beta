package wg;

import bi.ud;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.rt;
import zh.d2;
import zh.g1;
public final class p implements Runnable {
    public final int f57792a;
    public final Object f57793b;

    public p(Object obj, int i7) {
        this.f57792a = i7;
        this.f57793b = obj;
    }

    @Override
    public final void run() {
        switch (this.f57792a) {
            case 0:
                ((fx) this.f57793b).a(Collections.EMPTY_LIST);
                return;
            case 1:
                ((v) this.f57793b).a(null);
                return;
            case 2:
                b0 b0Var = (b0) this.f57793b;
                b0Var.getClass();
                c0 c0Var = b0Var.f57701r;
                ug.f1 f1Var = new ug.f1(c0Var.f36279o1, c0Var.f28616a, null, null, null, c0Var.I0);
                f1Var.B2 = true;
                f1Var.U1 = true;
                c0Var.f36279o1.showDialog(f1Var);
                return;
            case 3:
                n40 n40Var = (n40) ((rt) this.f57793b).f37758b;
                n40Var.f36228q0 = true;
                a8.b("RoundVideo camera flip first frame: elapsedMs=" + n40.m(n40Var));
                n40Var.w(true);
                n40.n(n40Var);
                return;
            case 4:
                yh.l lVar = (yh.l) this.f57793b;
                lVar.f();
                lVar.e(true);
                return;
            case 5:
                zh.l lVar2 = (zh.l) this.f57793b;
                lVar2.Z1.setTranslationX(lVar2.Y1.getAnimatedWidth() + org.telegram.messenger.g0.L(28.0f));
                return;
            case 6:
                ((zh.b0) this.f57793b).onBackPressed();
                return;
            case 7:
                l41 l41Var = ((g1) this.f57793b).Q1;
                if (l41Var != null) {
                    l41Var.O(false);
                    return;
                }
                return;
            case 8:
                ((zh.v0) this.f57793b).c();
                return;
            case 9:
                ((zh.b1) this.f57793b).invalidateSelf();
                return;
            case 10:
                zh.d1 d1Var = (zh.d1) this.f57793b;
                ud udVar = d1Var.f60279e;
                if (udVar != null) {
                    udVar.d();
                    d1Var.invalidateSelf();
                    return;
                }
                return;
            default:
                ((d2) this.f57793b).p();
                return;
        }
    }
}
