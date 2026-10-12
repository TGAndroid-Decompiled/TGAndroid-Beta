package zg;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.Components.js0;
public final class n extends o1 {
    public final xh.m f54844x;

    public n(xh.m mVar, xh.m mVar2) {
        super(mVar2);
        this.f54844x = mVar;
    }

    @Override
    public final boolean b() {
        q qVar = (q) this.f54844x.f51585b;
        b5 parentLayout = qVar.getParentLayout();
        if (!q.U(qVar) && !AndroidUtilities.isTablet() && !q.V(qVar) && !AndroidUtilities.isInMultiwindow && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.f54844x.f51585b;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).f20110n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        q qVar = (q) this.f54844x.f51585b;
        qVar.f54887w.setVisibility(0);
        ViewPropertyAnimator animate = qVar.f54887w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new js0(20, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
