package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Components.as0;
import yh.t3;
public final class o extends q1 {
    public final t3 f49439x;

    public o(t3 t3Var, t3 t3Var2) {
        super(t3Var2);
        this.f49439x = t3Var;
    }

    @Override
    public final boolean b() {
        r rVar = (r) this.f49439x.f48102c;
        d5 parentLayout = rVar.getParentLayout();
        if (!r.U(rVar) && !AndroidUtilities.isTablet() && !r.V(rVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        r rVar = (r) this.f49439x.f48102c;
        if (rVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) rVar.getParentLayout()).f18624n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        r rVar = (r) this.f49439x.f48102c;
        rVar.f49480w.setVisibility(0);
        ViewPropertyAnimator animate = rVar.f49480w.animate();
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
