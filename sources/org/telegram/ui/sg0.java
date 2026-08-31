package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sg0 implements Runnable {
    public final int f41283a;
    public final wg0 f41284b;

    public sg0(wg0 wg0Var, int i10) {
        this.f41283a = i10;
        this.f41284b = wg0Var;
    }

    @Override
    public final void run() {
        ch.b[] bVarArr;
        switch (this.f41283a) {
            case 0:
                wg0.b0(this.f41284b);
                return;
            case 1:
                wg0 wg0Var = this.f41284b;
                wg0Var.getClass();
                l9.m0(wg0Var);
                return;
            case 2:
                wg0.c0(this.f41284b);
                return;
            case 3:
                wg0.a0(this.f41284b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f41284b.N);
                return;
            case 5:
                wg0 wg0Var2 = this.f41284b;
                wg0Var2.getClass();
                new uj0(wg0Var2.getParentActivity(), wg0Var2).show();
                return;
            case 6:
                wg0 wg0Var3 = this.f41284b;
                wg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                wg0Var3.presentFragment(new l9(bundle));
                return;
            default:
                wg0 wg0Var4 = this.f41284b;
                if (wg0Var4.getParentActivity() != null && (bVarArr = wg0Var4.H) != null) {
                    ch.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (wg0Var4.f38157b.getWidth() - ((bVar.getX() + wg0Var4.C.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    qh.f3 f3Var = new qh.f3(wg0Var4.getParentActivity(), 3);
                    wg0Var4.N = f3Var;
                    f3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-wg0Var4.I));
                    wg0Var4.N.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    wg0Var4.N.q(false);
                    wg0Var4.N.i();
                    wg0Var4.N.t(LocaleController.getString(R.string.SwitchAccountHint));
                    wg0Var4.N.m(1.0f, (-width) + 7.33f);
                    wg0Var4.f38157b.addView(wg0Var4.N, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    qh.f3 f3Var2 = wg0Var4.N;
                    f3Var2.f45298i0 = new sg0(wg0Var4, 4);
                    f3Var2.d = 8000L;
                    f3Var2.v();
                    org.telegram.ui.Components.n40.f29390r.b();
                    return;
                }
                return;
        }
    }
}
