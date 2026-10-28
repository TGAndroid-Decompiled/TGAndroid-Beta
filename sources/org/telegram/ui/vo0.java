package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vo0 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f44389a;
    public final tp0 f44390b;

    public vo0(tp0 tp0Var, int i10) {
        this.f44389a = i10;
        this.f44390b = tp0Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        tp0 tp0Var = this.f44390b;
        tp0Var.f43714b0 = defaultWindowInsets;
        ep0 ep0Var = tp0Var.h.f41839b;
        int i10 = defaultWindowInsets.f13449a;
        int paddingTop = ep0Var.getPaddingTop();
        i0.b bVar = tp0Var.f43714b0;
        ep0Var.setPadding(i10, paddingTop, bVar.f13451c, AndroidUtilities.dp(72.0f) + bVar.d);
        ep0 ep0Var2 = tp0Var.f43719n.f41839b;
        int i11 = tp0Var.f43714b0.f13449a;
        int paddingTop2 = ep0Var2.getPaddingTop();
        i0.b bVar2 = tp0Var.f43714b0;
        ep0Var2.setPadding(i11, paddingTop2, bVar2.f13451c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = tp0Var.P;
        i0.b bVar3 = tp0Var.f43714b0;
        frameLayout.setPadding(bVar3.f13449a, 0, bVar3.f13451c, bVar3.d);
        return r0.k1.f47152b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44389a) {
            case 1:
                this.f44390b.finishFragment();
                return;
            default:
                this.f44390b.z0();
                return;
        }
    }
}
