package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.ds0;
public final class n extends p1 {
    public final xh.m f54610x;

    public n(xh.m mVar, xh.m mVar2) {
        super(mVar2);
        this.f54610x = mVar;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f54610x.f51345b;
        d5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f54610x.f51345b;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f20342n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f54610x.f51345b;
        qVar.f54653w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f54653w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new ds0(19, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
