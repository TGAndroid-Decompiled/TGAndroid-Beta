package rh;

import android.text.TextUtils;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
public final class z1 implements q20 {
    public final int f47788a;
    public final e4 f47789b;
    public final gf.e f47790c;
    public final mg.i2 d;

    public z1(e4 e4Var, gf.e eVar, mg.i2 i2Var, int i10) {
        this.f47788a = i10;
        this.f47789b = e4Var;
        this.f47790c = eVar;
        this.d = i2Var;
    }

    @Override
    public final void a(Object obj) {
        cc k10;
        cc k11;
        String str = (String) obj;
        switch (this.f47788a) {
            case 0:
                this.f47790c.b();
                e4 e4Var = this.f47789b;
                mg.i2 i2Var = this.d;
                if (str != null) {
                    if (i2Var != null) {
                        k10 = new cc(i2Var.f21589c, e4Var.I0);
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
                    ((org.telegram.ui.Wallet.b6) T).N0();
                    return;
                }
                return;
            default:
                this.f47790c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    e4 e4Var2 = this.f47789b;
                    mg.i2 i2Var2 = this.d;
                    if (i2Var2 != null) {
                        k11 = new cc(i2Var2.f21589c, e4Var2.I0);
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
