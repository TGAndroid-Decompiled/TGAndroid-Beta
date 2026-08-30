package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zx {
    public final oy f40873a;

    public zx(oy oyVar) {
        this.f40873a = oyVar;
    }

    public final long a() {
        oy oyVar = this.f40873a;
        jx jxVar = oyVar.C3;
        if (jxVar != null && (jxVar.getFragment() instanceof kf1)) {
            return -((kf1) oyVar.C3.getFragment()).f35668a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        oy oyVar = this.f40873a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
        org.telegram.ui.Components.wn0 wn0Var = oyVar.f37129z0.V;
        if (wn0Var.K && wn0Var.P()) {
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.wn0 wn0Var2 = oyVar.f37129z0.V;
            if (wn0Var2.K) {
                arrayList = wn0Var2.f44913s0;
            } else {
                arrayList = wn0Var2.f44911r0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f19503a.Q = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                public final zx f40597b;

                {
                    this.f40597b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f40597b.f40873a.f37129z0.V.E();
                            return;
                        default:
                            oy oyVar2 = this.f40597b.f40873a;
                            if (oyVar2.f37129z0.V.P()) {
                                oyVar2.f37129z0.V.E();
                                return;
                            }
                            org.telegram.ui.Components.wn0 wn0Var3 = oyVar2.f37129z0.V;
                            wn0Var3.f44899g0.c();
                            wn0Var3.G.clear();
                            wn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) {
                public final zx f40597b;

                {
                    this.f40597b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f40597b.f40873a.f37129z0.V.E();
                            return;
                        default:
                            oy oyVar2 = this.f40597b.f40873a;
                            if (oyVar2.f37129z0.V.P()) {
                                oyVar2.f37129z0.V.E();
                                return;
                            }
                            org.telegram.ui.Components.wn0 wn0Var3 = oyVar2.f37129z0.V;
                            wn0Var3.f44899g0.c();
                            wn0Var3.G.clear();
                            wn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        oyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
        }
    }

    public final void c() {
        int i10;
        xx xxVar = this.f40873a.f37129z0;
        if (xxVar != null) {
            org.telegram.ui.Components.zk0 zk0Var = xxVar.f24317a0;
            int i11 = xxVar.P0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            zk0Var.b(i10);
            xxVar.P0 = xxVar.V.h();
        }
    }

    public final void d(boolean z4, boolean z10) {
        oy oyVar = this.f40873a;
        if (oyVar.f37129z0.T.getVisibility() == 0) {
            z10 = true;
        }
        if (oyVar.f37037g2 && oyVar.f37042h2) {
            xx xxVar = oyVar.f37129z0;
            if (xxVar.T != null) {
                if (!z4 && xxVar.V.h() == 0) {
                    oyVar.f37129z0.T.e(false, z10);
                } else {
                    oyVar.f37129z0.T.e(true, z10);
                }
            }
        }
        if (z4 && oyVar.f37129z0.V.h() == 0) {
            xx xxVar2 = oyVar.f37129z0;
            xxVar2.f24317a0.a();
            xxVar2.S.invalidate();
            xxVar2.P0 = 0;
        }
    }
}
