package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xo0 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f42917a;
    public final wp0 f42918b;

    public xo0(wp0 wp0Var, int i10) {
        this.f42917a = i10;
        this.f42918b = wp0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wp0 wp0Var = this.f42918b;
        wp0Var.f42575b0 = defaultWindowInsets;
        hp0 hp0Var = wp0Var.h.f39765b;
        int i10 = defaultWindowInsets.f11525a;
        int paddingTop = hp0Var.getPaddingTop();
        i0.b bVar = wp0Var.f42575b0;
        hp0Var.setPadding(i10, paddingTop, bVar.f11527c, AndroidUtilities.dp(72.0f) + bVar.d);
        hp0 hp0Var2 = wp0Var.f42581n.f39765b;
        int i11 = wp0Var.f42575b0.f11525a;
        int paddingTop2 = hp0Var2.getPaddingTop();
        i0.b bVar2 = wp0Var.f42575b0;
        hp0Var2.setPadding(i11, paddingTop2, bVar2.f11527c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = wp0Var.P;
        i0.b bVar3 = wp0Var.f42575b0;
        frameLayout.setPadding(bVar3.f11525a, 0, bVar3.f11527c, bVar3.d);
        return r0.l1.f45609b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42917a) {
            case 1:
                this.f42918b.finishFragment();
                return;
            default:
                this.f42918b.y0();
                return;
        }
    }
}
