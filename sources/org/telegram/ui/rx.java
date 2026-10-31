package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rx implements org.telegram.ui.Components.oz {
    public final Context f41306a;
    public final ay f41307b;

    public rx(Context context, ay ayVar) {
        this.f41307b = ayVar;
        this.f41306a = context;
    }

    public final int a(int i10) {
        ay ayVar = this.f41307b;
        if (ayVar.R0 != 3) {
            if (i10 == ayVar.f35900z0.getDefaultTabId()) {
                return ayVar.getMessagesStorage().K;
            }
            ArrayList S0 = ayVar.getMessagesController().S0();
            if (i10 >= 0 && i10 < S0.size()) {
                return ((org.telegram.messenger.ap) ayVar.getMessagesController().S0().get(i10)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ay ayVar = this.f41307b;
        if (i10 != 0 || ayVar.f35794e0[1].getVisibility() == 0 || ayVar.f35822j2) {
            if (ayVar.f35818i3) {
                zx zxVar = ayVar.f35794e0[0];
                zxVar.setTranslationX((-f7) * zxVar.getMeasuredWidth());
                zx[] zxVarArr = ayVar.f35794e0;
                zxVarArr[1].setTranslationX(zxVarArr[0].getMeasuredWidth() - (f7 * ayVar.f35794e0[0].getMeasuredWidth()));
            } else {
                zx zxVar2 = ayVar.f35794e0[0];
                zxVar2.setTranslationX(zxVar2.getMeasuredWidth() * f7);
                zx[] zxVarArr2 = ayVar.f35794e0;
                zxVarArr2[1].setTranslationX((f7 * zxVarArr2[0].getMeasuredWidth()) - ayVar.f35794e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                zx[] zxVarArr3 = ayVar.f35794e0;
                zx zxVar3 = zxVarArr3[0];
                zxVarArr3[0] = zxVarArr3[1];
                zxVarArr3[1] = zxVar3;
                zxVar3.setVisibility(8);
                ay.i1(ayVar, true);
                ayVar.e5(false);
                ayVar.f35900z0.O = false;
                ayVar.B3(ayVar.f35794e0[0]);
                ayVar.f35794e0[0].d.getClass();
                ayVar.f35794e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.pz pzVar, boolean z10) {
        int i10;
        int i11;
        ay ayVar = this.f41307b;
        int i12 = ayVar.f35794e0[0].h;
        int i13 = pzVar.f29471a;
        if (i12 != i13) {
            if (pzVar.f29474f) {
                ayVar.f35900z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                ayVar.showDialog(new kg.q0(3, i11, this.f41306a, ayVar, null));
                return;
            }
            ArrayList S0 = ayVar.getMessagesController().S0();
            if (!pzVar.e && ((i10 = pzVar.f29471a) < 0 || i10 >= S0.size())) {
                return;
            }
            zx zxVar = ayVar.f35794e0[1];
            zxVar.h = pzVar.f29471a;
            zxVar.setVisibility(0);
            zx[] zxVarArr = ayVar.f35794e0;
            zxVarArr[1].setTranslationX(zxVarArr[0].getMeasuredWidth());
            ay.i1(ayVar, false);
            ayVar.c5(true);
            ayVar.f35818i3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ap apVar) {
        boolean d = apVar.d();
        ay ayVar = this.f41307b;
        if (d) {
            org.telegram.ui.Components.j00.g1(ayVar, apVar.f14645a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ayVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131750791, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new rv(3, this, apVar));
        ayVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, ayVar.getResourceProvider());
        }
    }
}
