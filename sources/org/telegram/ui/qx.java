package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qx {
    public final fy f41793a;

    public qx(fy fyVar) {
        this.f41793a = fyVar;
    }

    public final long a() {
        fy fyVar = this.f41793a;
        ax axVar = fyVar.B3;
        if (axVar != null && (axVar.getFragment() instanceof ze1)) {
            return -((ze1) fyVar.B3.getFragment()).f45155a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        fy fyVar = this.f41793a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity());
        org.telegram.ui.Components.mn0 mn0Var = fyVar.f38377y0.U;
        if (mn0Var.J && mn0Var.P()) {
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.mn0 mn0Var2 = fyVar.f38377y0.U;
            if (mn0Var2.J) {
                arrayList = mn0Var2.f47159r0;
            } else {
                arrayList = mn0Var2.f47157q0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                public final qx f41485b;

                {
                    this.f41485b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f41485b.f41793a.f38377y0.U.E();
                            return;
                        default:
                            fy fyVar2 = this.f41485b.f41793a;
                            if (fyVar2.f38377y0.U.P()) {
                                fyVar2.f38377y0.U.E();
                                return;
                            }
                            org.telegram.ui.Components.mn0 mn0Var3 = fyVar2.f38377y0.U;
                            mn0Var3.f47146f0.c();
                            mn0Var3.F.clear();
                            mn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) {
                public final qx f41485b;

                {
                    this.f41485b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f41485b.f41793a.f38377y0.U.E();
                            return;
                        default:
                            fy fyVar2 = this.f41485b.f41793a;
                            if (fyVar2.f38377y0.U.P()) {
                                fyVar2.f38377y0.U.E();
                                return;
                            }
                            org.telegram.ui.Components.mn0 mn0Var3 = fyVar2.f38377y0.U;
                            mn0Var3.f47146f0.c();
                            mn0Var3.F.clear();
                            mn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        fyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
        }
    }

    public final void c() {
        int i10;
        ox oxVar = this.f41793a.f38377y0;
        if (oxVar != null) {
            org.telegram.ui.Components.pk0 pk0Var = oxVar.W;
            int i11 = oxVar.O0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            pk0Var.b(i10);
            oxVar.O0 = oxVar.U.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        fy fyVar = this.f41793a;
        if (fyVar.f38377y0.S.getVisibility() == 0) {
            z11 = true;
        }
        if (fyVar.f38285f2 && fyVar.f38290g2) {
            ox oxVar = fyVar.f38377y0;
            if (oxVar.S != null) {
                if (!z10 && oxVar.U.h() == 0) {
                    fyVar.f38377y0.S.e(false, z11);
                } else {
                    fyVar.f38377y0.S.e(true, z11);
                }
            }
        }
        if (z10 && fyVar.f38377y0.U.h() == 0) {
            ox oxVar2 = fyVar.f38377y0;
            oxVar2.W.a();
            oxVar2.R.invalidate();
            oxVar2.O0 = 0;
        }
    }
}
