package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xo0 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f42986a;
    public final wp0 f42987b;

    public xo0(wp0 wp0Var, int i10) {
        this.f42986a = i10;
        this.f42987b = wp0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wp0 wp0Var = this.f42987b;
        wp0Var.f42649b0 = defaultWindowInsets;
        hp0 hp0Var = wp0Var.h.f39831b;
        int i10 = defaultWindowInsets.f11526a;
        int paddingTop = hp0Var.getPaddingTop();
        i0.b bVar = wp0Var.f42649b0;
        hp0Var.setPadding(i10, paddingTop, bVar.f11528c, AndroidUtilities.dp(72.0f) + bVar.d);
        hp0 hp0Var2 = wp0Var.f42655n.f39831b;
        int i11 = wp0Var.f42649b0.f11526a;
        int paddingTop2 = hp0Var2.getPaddingTop();
        i0.b bVar2 = wp0Var.f42649b0;
        hp0Var2.setPadding(i11, paddingTop2, bVar2.f11528c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = wp0Var.P;
        i0.b bVar3 = wp0Var.f42649b0;
        frameLayout.setPadding(bVar3.f11526a, 0, bVar3.f11528c, bVar3.d);
        return r0.l1.f45623b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42986a) {
            case 1:
                this.f42987b.finishFragment();
                return;
            default:
                this.f42987b.y0();
                return;
        }
    }
}
