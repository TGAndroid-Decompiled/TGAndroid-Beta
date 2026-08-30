package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rg0 implements Runnable {
    public final int f38045a;
    public final vg0 f38046b;

    public rg0(vg0 vg0Var, int i10) {
        this.f38045a = i10;
        this.f38046b = vg0Var;
    }

    @Override
    public final void run() {
        bh.b[] bVarArr;
        switch (this.f38045a) {
            case 0:
                vg0.b0(this.f38046b);
                return;
            case 1:
                vg0 vg0Var = this.f38046b;
                vg0Var.getClass();
                l9.m0(vg0Var);
                return;
            case 2:
                vg0.c0(this.f38046b);
                return;
            case 3:
                vg0.a0(this.f38046b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f38046b.N);
                return;
            case 5:
                vg0 vg0Var2 = this.f38046b;
                vg0Var2.getClass();
                new sj0(vg0Var2.getParentActivity(), vg0Var2).show();
                return;
            case 6:
                vg0 vg0Var3 = this.f38046b;
                vg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                vg0Var3.presentFragment(new l9(bundle));
                return;
            default:
                vg0 vg0Var4 = this.f38046b;
                if (vg0Var4.getParentActivity() != null && (bVarArr = vg0Var4.H) != null) {
                    bh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (vg0Var4.f34874b.getWidth() - ((bVar.getX() + vg0Var4.C.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ph.f3 f3Var = new ph.f3(vg0Var4.getParentActivity(), 3);
                    vg0Var4.N = f3Var;
                    f3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-vg0Var4.I));
                    vg0Var4.N.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    vg0Var4.N.q(false);
                    vg0Var4.N.i();
                    vg0Var4.N.t(LocaleController.getString(R.string.SwitchAccountHint));
                    vg0Var4.N.m(1.0f, (-width) + 7.33f);
                    vg0Var4.f34874b.addView(vg0Var4.N, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ph.f3 f3Var2 = vg0Var4.N;
                    f3Var2.f41617i0 = new rg0(vg0Var4, 4);
                    f3Var2.d = 8000L;
                    f3Var2.v();
                    org.telegram.ui.Components.l40.f26547r.b();
                    return;
                }
                return;
        }
    }
}
