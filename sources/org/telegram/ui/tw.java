package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tw implements org.telegram.ui.Components.nz {
    public final Context f52400a;
    public final cx f52401b;

    public tw(Context context, cx cxVar) {
        this.f52401b = cxVar;
        this.f52400a = context;
    }

    public final int a(int i7) {
        cx cxVar = this.f52401b;
        if (cxVar.T0 != 3) {
            if (i7 == cxVar.A0.getDefaultTabId()) {
                return cxVar.getMessagesStorage().L;
            }
            ArrayList V0 = cxVar.getMessagesController().V0();
            if (i7 >= 0 && i7 < V0.size()) {
                return ((org.telegram.messenger.ro) cxVar.getMessagesController().V0().get(i7)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        cx cxVar = this.f52401b;
        if (i7 != 0 || cxVar.f46719f0[1].getVisibility() == 0 || cxVar.f46749l2) {
            if (cxVar.f46746k3) {
                bx bxVar = cxVar.f46719f0[0];
                bxVar.setTranslationX((-f10) * bxVar.getMeasuredWidth());
                bx[] bxVarArr = cxVar.f46719f0;
                bxVarArr[1].setTranslationX(bxVarArr[0].getMeasuredWidth() - (f10 * cxVar.f46719f0[0].getMeasuredWidth()));
            } else {
                bx bxVar2 = cxVar.f46719f0[0];
                bxVar2.setTranslationX(bxVar2.getMeasuredWidth() * f10);
                bx[] bxVarArr2 = cxVar.f46719f0;
                bxVarArr2[1].setTranslationX((f10 * bxVarArr2[0].getMeasuredWidth()) - cxVar.f46719f0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                bx[] bxVarArr3 = cxVar.f46719f0;
                bx bxVar3 = bxVarArr3[0];
                bxVarArr3[0] = bxVarArr3[1];
                bxVarArr3[1] = bxVar3;
                bxVar3.setVisibility(8);
                cx.i1(cxVar, true);
                cxVar.n5(false);
                cxVar.C5(-1, true);
                cxVar.A0.P = false;
                cxVar.C3(cxVar.f46719f0[0]);
                cxVar.f46719f0[0].d.getClass();
                cxVar.f46719f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.oz ozVar, boolean z10) {
        int i7;
        int i10;
        cx cxVar = this.f52401b;
        int i11 = cxVar.f46719f0[0].h;
        int i12 = ozVar.f38422a;
        if (i11 != i12) {
            if (ozVar.f38426f) {
                cxVar.A0.l(i12);
                i10 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                cxVar.showDialog(new ug.k0(3, i10, this.f52400a, cxVar, null));
                return;
            }
            ArrayList V0 = cxVar.getMessagesController().V0();
            if (!ozVar.f38425e && ((i7 = ozVar.f38422a) < 0 || i7 >= V0.size())) {
                return;
            }
            bx bxVar = cxVar.f46719f0[1];
            bxVar.h = ozVar.f38422a;
            bxVar.setVisibility(0);
            bx[] bxVarArr = cxVar.f46719f0;
            bxVarArr[1].setTranslationX(bxVarArr[0].getMeasuredWidth());
            cx.i1(cxVar, false);
            cxVar.l5(true);
            cxVar.C5(ozVar.f38422a, true);
            cxVar.f46746k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ro roVar) {
        boolean c10 = roVar.c();
        cx cxVar = this.f52401b;
        if (c10) {
            org.telegram.ui.Components.i00.h1(cxVar, roVar.f26700a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131750778, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new at(5, this, roVar));
        cxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, cxVar.getResourceProvider());
        }
    }
}
