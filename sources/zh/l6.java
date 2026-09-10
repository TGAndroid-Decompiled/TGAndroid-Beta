package zh;

import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import j$.util.Objects;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.n90;
public final class l6 implements Runnable {
    public final int f48647a;
    public final Object f48648b;
    public final Object f48649c;

    public l6(int i10, Object obj, Object obj2) {
        this.f48647a = i10;
        this.f48648b = obj;
        this.f48649c = obj2;
    }

    @Override
    public final void run() {
        h2 h2Var;
        k2.v vVar;
        switch (this.f48647a) {
            case 0:
                n6 n6Var = (n6) this.f48648b;
                n90 n90Var = (n90) this.f48649c;
                n90 n90Var2 = n6Var.f48712a;
                if (n90Var == n90Var2 && n90Var2 != null) {
                    CharacterStyle characterStyle = n90Var2.f25465i;
                    if (characterStyle instanceof URLSpan) {
                        o6 o6Var = n6Var.v;
                        j90 j90Var = n6Var.f48714c;
                        Objects.requireNonNull(j90Var);
                        o6Var.J.H((URLSpan) characterStyle, o6Var, new k5(j90Var, 4));
                        n6Var.f48712a = null;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y6 y6Var = (y6) this.f48648b;
                bi.x4 x4Var = (bi.x4) this.f48649c;
                y6Var.d.removeView(x4Var);
                if (x4Var == y6Var.f49117c) {
                    y6Var.f49116b = null;
                    y6Var.invalidate();
                    y6Var.b(false);
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f48649c;
                u7 u7Var = ((l7) this.f48648b).d;
                a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
                if (currentPeerView != null && (h2Var = currentPeerView.f48160c1) != null && (vVar = u7Var.G0) != null && ((t7) vVar.f12226c) == t7Var) {
                    h2Var.invalidate();
                    return;
                }
                return;
        }
    }
}
