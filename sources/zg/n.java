package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.sr0;
import yh.w3;
public final class n extends p1 {
    public final w3 f49091x;

    public n(w3 w3Var, w3 w3Var2) {
        super(w3Var2);
        this.f49091x = w3Var;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f49091x.f47936c;
        d5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f49091x.f47936c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f18406n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f49091x.f47936c;
        qVar.f49136w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f49136w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new sr0(16, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
