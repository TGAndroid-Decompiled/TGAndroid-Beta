package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tg0 implements Runnable {
    public final int f38513a;
    public final xg0 f38514b;

    public tg0(xg0 xg0Var, int i10) {
        this.f38513a = i10;
        this.f38514b = xg0Var;
    }

    @Override
    public final void run() {
        bh.b[] bVarArr;
        switch (this.f38513a) {
            case 0:
                xg0.b0(this.f38514b);
                return;
            case 1:
                xg0 xg0Var = this.f38514b;
                xg0Var.getClass();
                n9.m0(xg0Var);
                return;
            case 2:
                xg0.c0(this.f38514b);
                return;
            case 3:
                xg0.a0(this.f38514b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f38514b.N);
                return;
            case 5:
                xg0 xg0Var2 = this.f38514b;
                xg0Var2.getClass();
                new uj0(xg0Var2.getParentActivity(), xg0Var2).show();
                return;
            case 6:
                xg0 xg0Var3 = this.f38514b;
                xg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                xg0Var3.presentFragment(new n9(bundle));
                return;
            default:
                xg0 xg0Var4 = this.f38514b;
                if (xg0Var4.getParentActivity() != null && (bVarArr = xg0Var4.H) != null) {
                    bh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (xg0Var4.f37164b.getWidth() - ((bVar.getX() + xg0Var4.C.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ph.f3 f3Var = new ph.f3(xg0Var4.getParentActivity(), 3);
                    xg0Var4.N = f3Var;
                    f3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-xg0Var4.I));
                    xg0Var4.N.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    xg0Var4.N.p(false);
                    xg0Var4.N.i();
                    xg0Var4.N.s(LocaleController.getString(R.string.SwitchAccountHint));
                    xg0Var4.N.l(1.0f, (-width) + 7.33f);
                    xg0Var4.f37164b.addView(xg0Var4.N, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ph.f3 f3Var2 = xg0Var4.N;
                    f3Var2.f41662i0 = new tg0(xg0Var4, 4);
                    f3Var2.d = 8000L;
                    f3Var2.u();
                    org.telegram.ui.Components.m40.f26952r.b();
                    return;
                }
                return;
        }
    }
}
