package yg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.Components.bs0;
import xh.t3;
public final class o extends r1 {
    public final t3 f47096x;

    public o(t3 t3Var, t3 t3Var2) {
        super(t3Var2);
        this.f47096x = t3Var;
    }

    @Override
    public final boolean b() {
        s sVar = (s) this.f47096x.f46058c;
        f5 parentLayout = sVar.getParentLayout();
        if (!s.U(sVar) && !AndroidUtilities.isTablet() && !s.V(sVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        s sVar = (s) this.f47096x.f46058c;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).f17497n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        s sVar = (s) this.f47096x.f46058c;
        sVar.f47140w.setVisibility(0);
        ViewPropertyAnimator animate = sVar.f47140w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new bs0(16, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
