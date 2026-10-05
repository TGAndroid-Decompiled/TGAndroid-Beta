package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yg0 implements Runnable {
    public final int f43224a;
    public final ch0 f43225b;

    public yg0(ch0 ch0Var, int i10) {
        this.f43224a = i10;
        this.f43225b = ch0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f43224a) {
            case 0:
                ch0.Z(this.f43225b);
                return;
            case 1:
                ch0 ch0Var = this.f43225b;
                ch0Var.getClass();
                m9.g0(ch0Var);
                return;
            case 2:
                ch0.c0(this.f43225b);
                return;
            case 3:
                ch0.Y(this.f43225b);
                return;
            case 4:
                ch0 ch0Var2 = this.f43225b;
                ch0Var2.getClass();
                new ak0(ch0Var2.getParentActivity(), ch0Var2).show();
                return;
            case 5:
                ch0 ch0Var3 = this.f43225b;
                ch0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ch0Var3.presentFragment(new m9(bundle));
                return;
            case 6:
                ch0 ch0Var4 = this.f43225b;
                if (ch0Var4.getParentActivity() != null && (bVarArr = ch0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (ch0Var4.f40107b.getWidth() - ((bVar.getX() + ch0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(ch0Var4.getParentActivity(), 3);
                    ch0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ch0Var4.L));
                    ch0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ch0Var4.P.p(false);
                    ch0Var4.P.i();
                    ch0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    ch0Var4.P.l(1.0f, (-width) + 7.33f);
                    ch0Var4.f40107b.addView(ch0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = ch0Var4.P;
                    e4Var2.f4998l0 = new yg0(ch0Var4, 7);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.n40.f28964r.b();
                    return;
                }
                return;
            default:
                AndroidUtilities.removeFromParent(this.f43225b.P);
                return;
        }
    }
}
