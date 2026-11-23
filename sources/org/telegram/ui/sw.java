package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sw implements org.telegram.ui.Components.kz {
    public final Context f52163a;
    public final bx f52164b;

    public sw(Context context, bx bxVar) {
        this.f52164b = bxVar;
        this.f52163a = context;
    }

    public final int a(int i7) {
        bx bxVar = this.f52164b;
        if (bxVar.T0 != 3) {
            if (i7 == bxVar.A0.getDefaultTabId()) {
                return bxVar.getMessagesStorage().L;
            }
            ArrayList V0 = bxVar.getMessagesController().V0();
            if (i7 >= 0 && i7 < V0.size()) {
                return ((org.telegram.messenger.ro) bxVar.getMessagesController().V0().get(i7)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        bx bxVar = this.f52164b;
        if (i7 != 0 || bxVar.f46549f0[1].getVisibility() == 0 || bxVar.f46579l2) {
            if (bxVar.f46576k3) {
                ax axVar = bxVar.f46549f0[0];
                axVar.setTranslationX((-f10) * axVar.getMeasuredWidth());
                ax[] axVarArr = bxVar.f46549f0;
                axVarArr[1].setTranslationX(axVarArr[0].getMeasuredWidth() - (f10 * bxVar.f46549f0[0].getMeasuredWidth()));
            } else {
                ax axVar2 = bxVar.f46549f0[0];
                axVar2.setTranslationX(axVar2.getMeasuredWidth() * f10);
                ax[] axVarArr2 = bxVar.f46549f0;
                axVarArr2[1].setTranslationX((f10 * axVarArr2[0].getMeasuredWidth()) - bxVar.f46549f0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                ax[] axVarArr3 = bxVar.f46549f0;
                ax axVar3 = axVarArr3[0];
                axVarArr3[0] = axVarArr3[1];
                axVarArr3[1] = axVar3;
                axVar3.setVisibility(8);
                bx.i1(bxVar, true);
                bxVar.n5(false);
                bxVar.C5(-1, true);
                bxVar.A0.P = false;
                bxVar.C3(bxVar.f46549f0[0]);
                bxVar.f46549f0[0].d.getClass();
                bxVar.f46549f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.lz lzVar, boolean z10) {
        int i7;
        int i10;
        bx bxVar = this.f52164b;
        int i11 = bxVar.f46549f0[0].h;
        int i12 = lzVar.f37261a;
        if (i11 != i12) {
            if (lzVar.f37265f) {
                bxVar.A0.l(i12);
                i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                bxVar.showDialog(new ug.k0(3, i10, this.f52163a, bxVar, null));
                return;
            }
            ArrayList V0 = bxVar.getMessagesController().V0();
            if (!lzVar.f37264e && ((i7 = lzVar.f37261a) < 0 || i7 >= V0.size())) {
                return;
            }
            ax axVar = bxVar.f46549f0[1];
            axVar.h = lzVar.f37261a;
            axVar.setVisibility(0);
            ax[] axVarArr = bxVar.f46549f0;
            axVarArr[1].setTranslationX(axVarArr[0].getMeasuredWidth());
            bx.i1(bxVar, false);
            bxVar.l5(true);
            bxVar.C5(lzVar.f37261a, true);
            bxVar.f46576k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ro roVar) {
        boolean c10 = roVar.c();
        bx bxVar = this.f52164b;
        if (c10) {
            org.telegram.ui.Components.g00.h1(bxVar, roVar.f26773a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bxVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131750778, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new zs(5, this, roVar));
        bxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, bxVar.getResourceProvider());
        }
    }
}
