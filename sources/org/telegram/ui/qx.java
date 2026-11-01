package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qx implements org.telegram.ui.Components.oz {
    public final Context f40918a;
    public final zx f40919b;

    public qx(Context context, zx zxVar) {
        this.f40919b = zxVar;
        this.f40918a = context;
    }

    public final int a(int i10) {
        zx zxVar = this.f40919b;
        if (zxVar.R0 != 3) {
            if (i10 == zxVar.f44243z0.getDefaultTabId()) {
                return zxVar.getMessagesStorage().K;
            }
            ArrayList S0 = zxVar.getMessagesController().S0();
            if (i10 >= 0 && i10 < S0.size()) {
                return ((org.telegram.messenger.bp) zxVar.getMessagesController().S0().get(i10)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        zx zxVar = this.f40919b;
        if (i10 != 0 || zxVar.f44137e0[1].getVisibility() == 0 || zxVar.f44165j2) {
            if (zxVar.f44161i3) {
                yx yxVar = zxVar.f44137e0[0];
                yxVar.setTranslationX((-f7) * yxVar.getMeasuredWidth());
                yx[] yxVarArr = zxVar.f44137e0;
                yxVarArr[1].setTranslationX(yxVarArr[0].getMeasuredWidth() - (f7 * zxVar.f44137e0[0].getMeasuredWidth()));
            } else {
                yx yxVar2 = zxVar.f44137e0[0];
                yxVar2.setTranslationX(yxVar2.getMeasuredWidth() * f7);
                yx[] yxVarArr2 = zxVar.f44137e0;
                yxVarArr2[1].setTranslationX((f7 * yxVarArr2[0].getMeasuredWidth()) - zxVar.f44137e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                yx[] yxVarArr3 = zxVar.f44137e0;
                yx yxVar3 = yxVarArr3[0];
                yxVarArr3[0] = yxVarArr3[1];
                yxVarArr3[1] = yxVar3;
                yxVar3.setVisibility(8);
                zx.j1(zxVar, true);
                zxVar.f5(false);
                zxVar.f44243z0.O = false;
                zxVar.C3(zxVar.f44137e0[0]);
                zxVar.f44137e0[0].d.getClass();
                zxVar.f44137e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.pz pzVar, boolean z10) {
        int i10;
        int i11;
        zx zxVar = this.f40919b;
        int i12 = zxVar.f44137e0[0].h;
        int i13 = pzVar.f29572a;
        if (i12 != i13) {
            if (pzVar.f29575f) {
                zxVar.f44243z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                zxVar.showDialog(new kg.q0(3, i11, this.f40918a, zxVar, null));
                return;
            }
            ArrayList S0 = zxVar.getMessagesController().S0();
            if (!pzVar.e && ((i10 = pzVar.f29572a) < 0 || i10 >= S0.size())) {
                return;
            }
            yx yxVar = zxVar.f44137e0[1];
            yxVar.h = pzVar.f29572a;
            yxVar.setVisibility(0);
            yx[] yxVarArr = zxVar.f44137e0;
            yxVarArr[1].setTranslationX(yxVarArr[0].getMeasuredWidth());
            zx.j1(zxVar, false);
            zxVar.d5(true);
            zxVar.f44161i3 = z10;
        }
    }

    public final void d(org.telegram.messenger.bp bpVar) {
        boolean d = bpVar.d();
        zx zxVar = this.f40919b;
        if (d) {
            org.telegram.ui.Components.j00.g1(zxVar, bpVar.f15000a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxVar.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131750791, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(3, this, bpVar));
        zxVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, zxVar.getResourceProvider());
        }
    }
}
