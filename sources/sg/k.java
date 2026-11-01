package sg;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.xv0;
public final class k extends m1 {
    public final ph.k f48375x;

    public k(ph.k kVar, ph.k kVar2) {
        super(kVar2);
        this.f48375x = kVar;
    }

    @Override
    public final boolean b() {
        o oVar = (o) this.f48375x.f45154c;
        z4 parentLayout = oVar.getParentLayout();
        if (!o.Z(oVar) && !org.telegram.messenger.i0.Q1() && !o.a0(oVar) && !org.telegram.messenger.i0.E && parentLayout != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        o oVar = (o) this.f48375x.f45154c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).f20098n;
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        float f7;
        o oVar = (o) this.f48375x.f45154c;
        oVar.f48439w.setVisibility(0);
        ViewPropertyAnimator animate = oVar.f48439w.animate();
        if (!z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).withEndAction(new xv0(8, this, z10)).start();
    }

    @Override
    public final void f() {
    }
}
