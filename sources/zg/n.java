package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.es0;
import yh.t3;
public final class n extends p1 {
    public final t3 f53473x;

    public n(t3 t3Var, t3 t3Var2) {
        super(t3Var2);
        this.f53473x = t3Var;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f53473x.f52006c;
        c5 parentLayout = qVar.getParentLayout();
        if (!q.S(qVar) && !AndroidUtilities.isTablet() && !q.T(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f53473x.f52006c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f20335n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f53473x.f52006c;
        qVar.f53517w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f53517w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new es0(17, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
