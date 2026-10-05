package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.fs0;
import yh.u3;
public final class k extends p1 {
    public final u3 f53433x;

    public k(u3 u3Var, u3 u3Var2) {
        super(u3Var2);
        this.f53433x = u3Var;
    }

    @Override
    public final boolean b() {
        o oVar = (o) this.f53433x.f52081c;
        c5 parentLayout = oVar.getParentLayout();
        if (!o.S(oVar) && !AndroidUtilities.isTablet() && !o.T(oVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        o oVar = (o) this.f53433x.f52081c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).f20345n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        o oVar = (o) this.f53433x.f52081c;
        oVar.v.setVisibility(0);
        ViewPropertyAnimator animate = oVar.v.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new fs0(17, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
