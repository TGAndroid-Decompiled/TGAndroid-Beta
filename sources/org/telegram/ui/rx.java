package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class rx {

    public final gy f42355a;

    public rx(gy gyVar) {
        this.f42355a = gyVar;
    }

    public final long a() {
        gy gyVar = this.f42355a;
        bx bxVar = gyVar.B3;
        if (bxVar == null || !(bxVar.getFragment() instanceof we1)) {
            return 0L;
        }
        return -((we1) gyVar.B3.getFragment()).f43719a;
    }

    public final void b() {
        gy gyVar = this.f42355a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity());
        org.telegram.ui.Components.cn0 cn0Var = gyVar.f38619y0.U;
        if (cn0Var.J && cn0Var.P()) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.cn0 cn0Var2 = gyVar.f38619y0.U;
            ArrayList arrayList = cn0Var2.J ? cn0Var2.f46000r0 : cn0Var2.f45998q0;
            alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {

                public final rx f41763b;

                {
                    this.f41763b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.f41763b.f42355a.f38619y0.U.E();
                            break;
                        default:
                            gy gyVar2 = this.f41763b.f42355a;
                            if (!gyVar2.f38619y0.U.P()) {
                                org.telegram.ui.Components.cn0 cn0Var3 = gyVar2.f38619y0.U;
                                cn0Var3.f45987f0.c();
                                cn0Var3.F.clear();
                                cn0Var3.l();
                            } else {
                                gyVar2.f38619y0.U.E();
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {

                public final rx f41763b;

                {
                    this.f41763b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                    switch (i11) {
                        case 0:
                            this.f41763b.f42355a.f38619y0.U.E();
                            break;
                        default:
                            gy gyVar2 = this.f41763b.f42355a;
                            if (!gyVar2.f38619y0.U.P()) {
                                org.telegram.ui.Components.cn0 cn0Var3 = gyVar2.f38619y0.U;
                                cn0Var3.f45987f0.c();
                                cn0Var3.F.clear();
                                cn0Var3.l();
                            } else {
                                gyVar2.f38619y0.U.E();
                            }
                            break;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        gyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
        }
    }

    public final void c() {
        px pxVar = this.f42355a.f38619y0;
        if (pxVar != null) {
            org.telegram.ui.Components.gk0 gk0Var = pxVar.W;
            int i10 = pxVar.O0;
            gk0Var.b(i10 > 0 ? i10 + 1 : 0);
            pxVar.O0 = pxVar.U.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        gy gyVar = this.f42355a;
        if (gyVar.f38619y0.S.getVisibility() == 0) {
            z11 = true;
        }
        if (gyVar.f38527f2 && gyVar.f38532g2) {
            px pxVar = gyVar.f38619y0;
            if (pxVar.S != null) {
                if (z10 || pxVar.U.h() != 0) {
                    gyVar.f38619y0.S.e(true, z11);
                } else {
                    gyVar.f38619y0.S.e(false, z11);
                }
            }
        }
        if (z10 && gyVar.f38619y0.U.h() == 0) {
            px pxVar2 = gyVar.f38619y0;
            pxVar2.W.a();
            pxVar2.R.invalidate();
            pxVar2.O0 = 0;
        }
    }
}
