package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vg0 implements Runnable {
    public final int f38391a;
    public final zg0 f38392b;

    public vg0(zg0 zg0Var, int i10) {
        this.f38391a = i10;
        this.f38392b = zg0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f38391a) {
            case 0:
                zg0.b0(this.f38392b);
                return;
            case 1:
                zg0 zg0Var = this.f38392b;
                zg0Var.getClass();
                k9.m0(zg0Var);
                return;
            case 2:
                zg0.c0(this.f38392b);
                return;
            case 3:
                zg0.a0(this.f38392b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f38392b.P);
                return;
            case 5:
                zg0 zg0Var2 = this.f38392b;
                zg0Var2.getClass();
                new wj0(zg0Var2.getParentActivity(), zg0Var2).show();
                return;
            case 6:
                zg0 zg0Var3 = this.f38392b;
                zg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                zg0Var3.presentFragment(new k9(bundle));
                return;
            default:
                zg0 zg0Var4 = this.f38392b;
                if (zg0Var4.getParentActivity() != null && (bVarArr = zg0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (zg0Var4.f37685b.getWidth() - ((bVar.getX() + zg0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(zg0Var4.getParentActivity(), 3);
                    zg0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-zg0Var4.L));
                    zg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    zg0Var4.P.p(false);
                    zg0Var4.P.i();
                    zg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    zg0Var4.P.l(1.0f, (-width) + 7.33f);
                    zg0Var4.f37685b.addView(zg0Var4.P, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = zg0Var4.P;
                    e4Var2.f4615l0 = new vg0(zg0Var4, 4);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.k40.f25504r.b();
                    return;
                }
                return;
        }
    }
}
