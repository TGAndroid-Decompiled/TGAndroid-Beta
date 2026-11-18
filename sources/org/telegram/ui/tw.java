package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tw implements org.telegram.ui.Components.lz {
    public final Context f52367a;
    public final cx f52368b;

    public tw(Context context, cx cxVar) {
        this.f52368b = cxVar;
        this.f52367a = context;
    }

    public final int a(int i7) {
        cx cxVar = this.f52368b;
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
        cx cxVar = this.f52368b;
        if (i7 != 0 || cxVar.f46683f0[1].getVisibility() == 0 || cxVar.f46713l2) {
            if (cxVar.f46710k3) {
                bx bxVar = cxVar.f46683f0[0];
                bxVar.setTranslationX((-f10) * bxVar.getMeasuredWidth());
                bx[] bxVarArr = cxVar.f46683f0;
                bxVarArr[1].setTranslationX(bxVarArr[0].getMeasuredWidth() - (f10 * cxVar.f46683f0[0].getMeasuredWidth()));
            } else {
                bx bxVar2 = cxVar.f46683f0[0];
                bxVar2.setTranslationX(bxVar2.getMeasuredWidth() * f10);
                bx[] bxVarArr2 = cxVar.f46683f0;
                bxVarArr2[1].setTranslationX((f10 * bxVarArr2[0].getMeasuredWidth()) - cxVar.f46683f0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                bx[] bxVarArr3 = cxVar.f46683f0;
                bx bxVar3 = bxVarArr3[0];
                bxVarArr3[0] = bxVarArr3[1];
                bxVarArr3[1] = bxVar3;
                bxVar3.setVisibility(8);
                cx.i1(cxVar, true);
                cxVar.n5(false);
                cxVar.C5(-1, true);
                cxVar.A0.P = false;
                cxVar.C3(cxVar.f46683f0[0]);
                cxVar.f46683f0[0].d.getClass();
                cxVar.f46683f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.mz mzVar, boolean z10) {
        int i7;
        int i10;
        cx cxVar = this.f52368b;
        int i11 = cxVar.f46683f0[0].h;
        int i12 = mzVar.f37668a;
        if (i11 != i12) {
            if (mzVar.f37672f) {
                cxVar.A0.l(i12);
                i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                cxVar.showDialog(new ug.l0(3, i10, this.f52367a, cxVar, null));
                return;
            }
            ArrayList V0 = cxVar.getMessagesController().V0();
            if (!mzVar.f37671e && ((i7 = mzVar.f37668a) < 0 || i7 >= V0.size())) {
                return;
            }
            bx bxVar = cxVar.f46683f0[1];
            bxVar.h = mzVar.f37668a;
            bxVar.setVisibility(0);
            bx[] bxVarArr = cxVar.f46683f0;
            bxVarArr[1].setTranslationX(bxVarArr[0].getMeasuredWidth());
            cx.i1(cxVar, false);
            cxVar.l5(true);
            cxVar.C5(mzVar.f37668a, true);
            cxVar.f46710k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ro roVar) {
        boolean c10 = roVar.c();
        cx cxVar = this.f52368b;
        if (c10) {
            org.telegram.ui.Components.g00.h1(cxVar, roVar.f26674a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131750779, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new at(5, this, roVar));
        cxVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, cxVar.getResourceProvider());
        }
    }
}
