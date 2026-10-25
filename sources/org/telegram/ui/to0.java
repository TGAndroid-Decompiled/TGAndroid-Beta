package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class to0 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f43874a;
    public final rp0 f43875b;

    public to0(rp0 rp0Var, int i10) {
        this.f43874a = i10;
        this.f43875b = rp0Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        rp0 rp0Var = this.f43875b;
        rp0Var.f43225b0 = defaultWindowInsets;
        cp0 cp0Var = rp0Var.h.f41313b;
        int i10 = defaultWindowInsets.f13450a;
        int paddingTop = cp0Var.getPaddingTop();
        i0.b bVar = rp0Var.f43225b0;
        cp0Var.setPadding(i10, paddingTop, bVar.f13452c, AndroidUtilities.dp(72.0f) + bVar.d);
        cp0 cp0Var2 = rp0Var.f43230n.f41313b;
        int i11 = rp0Var.f43225b0.f13450a;
        int paddingTop2 = cp0Var2.getPaddingTop();
        i0.b bVar2 = rp0Var.f43225b0;
        cp0Var2.setPadding(i11, paddingTop2, bVar2.f13452c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = rp0Var.P;
        i0.b bVar3 = rp0Var.f43225b0;
        frameLayout.setPadding(bVar3.f13450a, 0, bVar3.f13452c, bVar3.d);
        return r0.k1.f47114b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f43874a) {
            case 1:
                this.f43875b.finishFragment();
                return;
            default:
                this.f43875b.z0();
                return;
        }
    }
}
