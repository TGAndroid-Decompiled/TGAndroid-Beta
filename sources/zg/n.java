package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.Components.zr0;
import yh.t3;
public final class n extends o1 {
    public final t3 f49390x;

    public n(t3 t3Var, t3 t3Var2) {
        super(t3Var2);
        this.f49390x = t3Var;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f49390x.f48053c;
        b5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f49390x.f48053c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f18630n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f49390x.f48053c;
        qVar.f49431w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f49431w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new zr0(17, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
