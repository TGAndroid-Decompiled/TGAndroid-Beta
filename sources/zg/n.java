package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.as0;
import yh.u3;
public final class n extends p1 {
    public final u3 f49411x;

    public n(u3 u3Var, u3 u3Var2) {
        super(u3Var2);
        this.f49411x = u3Var;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f49411x.f48128c;
        d5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f49411x.f48128c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f18638n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f49411x.f48128c;
        qVar.f49456w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f49456w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new as0(17, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
