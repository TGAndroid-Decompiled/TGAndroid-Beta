package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xg0 implements Runnable {
    public final int f39643a;
    public final bh0 f39644b;

    public xg0(bh0 bh0Var, int i10) {
        this.f39643a = i10;
        this.f39644b = bh0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f39643a) {
            case 0:
                bh0.b0(this.f39644b);
                return;
            case 1:
                bh0 bh0Var = this.f39644b;
                bh0Var.getClass();
                n9.n0(bh0Var);
                return;
            case 2:
                bh0.c0(this.f39644b);
                return;
            case 3:
                bh0.a0(this.f39644b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f39644b.P);
                return;
            case 5:
                bh0 bh0Var2 = this.f39644b;
                bh0Var2.getClass();
                new yj0(bh0Var2.getParentActivity(), bh0Var2).show();
                return;
            case 6:
                bh0 bh0Var3 = this.f39644b;
                bh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                bh0Var3.presentFragment(new n9(bundle));
                return;
            default:
                bh0 bh0Var4 = this.f39644b;
                if (bh0Var4.getParentActivity() != null && (bVarArr = bh0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (bh0Var4.f37133b.getWidth() - ((bVar.getX() + bh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(bh0Var4.getParentActivity(), 3);
                    bh0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-bh0Var4.L));
                    bh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    bh0Var4.P.p(false);
                    bh0Var4.P.i();
                    bh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    bh0Var4.P.l(1.0f, (-width) + 7.33f);
                    bh0Var4.f37133b.addView(bh0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = bh0Var4.P;
                    e4Var2.f4625l0 = new xg0(bh0Var4, 4);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.m40.f26343r.b();
                    return;
                }
                return;
        }
    }
}
