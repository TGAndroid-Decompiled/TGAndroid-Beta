package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Components.tr0;
import yh.w3;
public final class n extends q1 {
    public final w3 f49119x;

    public n(w3 w3Var, w3 w3Var2) {
        super(w3Var2);
        this.f49119x = w3Var;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f49119x.f47964c;
        e5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f49119x.f47964c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f18416n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f49119x.f47964c;
        qVar.f49164w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f49164w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new tr0(16, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
