package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sg0 implements Runnable {
    public final int f41236a;
    public final wg0 f41237b;

    public sg0(wg0 wg0Var, int i10) {
        this.f41236a = i10;
        this.f41237b = wg0Var;
    }

    @Override
    public final void run() {
        ch.b[] bVarArr;
        switch (this.f41236a) {
            case 0:
                wg0.b0(this.f41237b);
                return;
            case 1:
                wg0 wg0Var = this.f41237b;
                wg0Var.getClass();
                l9.m0(wg0Var);
                return;
            case 2:
                wg0.c0(this.f41237b);
                return;
            case 3:
                wg0.a0(this.f41237b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f41237b.N);
                return;
            case 5:
                wg0 wg0Var2 = this.f41237b;
                wg0Var2.getClass();
                new uj0(wg0Var2.getParentActivity(), wg0Var2).show();
                return;
            case 6:
                wg0 wg0Var3 = this.f41237b;
                wg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                wg0Var3.presentFragment(new l9(bundle));
                return;
            default:
                wg0 wg0Var4 = this.f41237b;
                if (wg0Var4.getParentActivity() != null && (bVarArr = wg0Var4.H) != null) {
                    ch.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (wg0Var4.f40021b.getWidth() - ((bVar.getX() + wg0Var4.C.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    qh.e3 e3Var = new qh.e3(wg0Var4.getParentActivity(), 3);
                    wg0Var4.N = e3Var;
                    e3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-wg0Var4.I));
                    wg0Var4.N.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    wg0Var4.N.p(false);
                    wg0Var4.N.i();
                    wg0Var4.N.s(LocaleController.getString(R.string.SwitchAccountHint));
                    wg0Var4.N.l(1.0f, (-width) + 7.33f);
                    wg0Var4.f40021b.addView(wg0Var4.N, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    qh.e3 e3Var2 = wg0Var4.N;
                    e3Var2.f45272i0 = new sg0(wg0Var4, 4);
                    e3Var2.d = 8000L;
                    e3Var2.u();
                    org.telegram.ui.Components.n40.f29378r.b();
                    return;
                }
                return;
        }
    }
}
