package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.es0;
import yh.u3;
public final class n extends p1 {
    public final u3 f49372x;

    public n(u3 u3Var, u3 u3Var2) {
        super(u3Var2);
        this.f49372x = u3Var;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f49372x.f48085c;
        d5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f49372x.f48085c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f18591n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f49372x.f48085c;
        qVar.f49413w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f49413w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new es0(16, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
