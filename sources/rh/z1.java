package rh;

import android.text.TextUtils;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
public final class z1 implements r20 {
    public final int f47800a;
    public final e4 f47801b;
    public final gf.e f47802c;
    public final mg.i2 d;

    public z1(e4 e4Var, gf.e eVar, mg.i2 i2Var, int i10) {
        this.f47800a = i10;
        this.f47801b = e4Var;
        this.f47802c = eVar;
        this.d = i2Var;
    }

    @Override
    public final void a(Object obj) {
        cc k10;
        cc k11;
        String str = (String) obj;
        switch (this.f47800a) {
            case 0:
                this.f47802c.b();
                e4 e4Var = this.f47801b;
                mg.i2 i2Var = this.d;
                if (str != null) {
                    if (i2Var != null) {
                        k10 = new cc(i2Var.f21590c, e4Var.I0);
                    } else {
                        k10 = e4Var.k();
                    }
                    k10.e0(str, false);
                    return;
                }
                if (i2Var != null) {
                    i2Var.dismiss();
                }
                e4Var.dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T instanceof org.telegram.ui.Wallet.b6) {
                    ((org.telegram.ui.Wallet.b6) T).O0();
                    return;
                }
                return;
            default:
                this.f47802c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    e4 e4Var2 = this.f47801b;
                    mg.i2 i2Var2 = this.d;
                    if (i2Var2 != null) {
                        k11 = new cc(i2Var2.f21590c, e4Var2.I0);
                    } else {
                        k11 = e4Var2.k();
                    }
                    k11.e0(str, false);
                    return;
                }
                return;
        }
    }
}
