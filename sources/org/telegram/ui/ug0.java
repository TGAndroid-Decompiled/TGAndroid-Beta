package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ug0 implements Runnable {
    public final int f38472a;
    public final yg0 f38473b;

    public ug0(yg0 yg0Var, int i10) {
        this.f38472a = i10;
        this.f38473b = yg0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f38472a) {
            case 0:
                yg0.b0(this.f38473b);
                return;
            case 1:
                yg0 yg0Var = this.f38473b;
                yg0Var.getClass();
                k9.m0(yg0Var);
                return;
            case 2:
                yg0.c0(this.f38473b);
                return;
            case 3:
                yg0.a0(this.f38473b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f38473b.P);
                return;
            case 5:
                yg0 yg0Var2 = this.f38473b;
                yg0Var2.getClass();
                new wj0(yg0Var2.getParentActivity(), yg0Var2).show();
                return;
            case 6:
                yg0 yg0Var3 = this.f38473b;
                yg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                yg0Var3.presentFragment(new k9(bundle));
                return;
            default:
                yg0 yg0Var4 = this.f38473b;
                if (yg0Var4.getParentActivity() != null && (bVarArr = yg0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (yg0Var4.f38124b.getWidth() - ((bVar.getX() + yg0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(yg0Var4.getParentActivity(), 3);
                    yg0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-yg0Var4.L));
                    yg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    yg0Var4.P.p(false);
                    yg0Var4.P.i();
                    yg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    yg0Var4.P.l(1.0f, (-width) + 7.33f);
                    yg0Var4.f38124b.addView(yg0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = yg0Var4.P;
                    e4Var2.f4615l0 = new ug0(yg0Var4, 4);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.l40.f25958r.b();
                    return;
                }
                return;
        }
    }
}
