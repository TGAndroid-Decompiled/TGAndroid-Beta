package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qw implements org.telegram.ui.Components.az {
    public final Context f49165a;
    public final zw f49166b;

    public qw(Context context, zw zwVar) {
        this.f49166b = zwVar;
        this.f49165a = context;
    }

    public final int a(int i7) {
        zw zwVar = this.f49166b;
        if (zwVar.S0 != 3) {
            if (i7 == zwVar.f52683z0.getDefaultTabId()) {
                return zwVar.getMessagesStorage().K;
            }
            ArrayList T0 = zwVar.getMessagesController().T0();
            if (i7 >= 0 && i7 < T0.size()) {
                return ((org.telegram.messenger.vo) zwVar.getMessagesController().T0().get(i7)).d;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        zw zwVar = this.f49166b;
        if (i7 != 0 || zwVar.f52577e0[1].getVisibility() == 0 || zwVar.f52609k2) {
            if (zwVar.j3) {
                yw ywVar = zwVar.f52577e0[0];
                ywVar.setTranslationX((-f10) * ywVar.getMeasuredWidth());
                yw[] ywVarArr = zwVar.f52577e0;
                ywVarArr[1].setTranslationX(ywVarArr[0].getMeasuredWidth() - (f10 * zwVar.f52577e0[0].getMeasuredWidth()));
            } else {
                yw ywVar2 = zwVar.f52577e0[0];
                ywVar2.setTranslationX(ywVar2.getMeasuredWidth() * f10);
                yw[] ywVarArr2 = zwVar.f52577e0;
                ywVarArr2[1].setTranslationX((f10 * ywVarArr2[0].getMeasuredWidth()) - zwVar.f52577e0[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                yw[] ywVarArr3 = zwVar.f52577e0;
                yw ywVar3 = ywVarArr3[0];
                ywVarArr3[0] = ywVarArr3[1];
                ywVarArr3[1] = ywVar3;
                ywVar3.setVisibility(8);
                zw.j1(zwVar, true);
                zwVar.f5(false);
                zwVar.f52683z0.O = false;
                zwVar.C3(zwVar.f52577e0[0]);
                zwVar.f52577e0[0].d.getClass();
                zwVar.f52577e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.bz bzVar, boolean z9) {
        int i7;
        int i10;
        zw zwVar = this.f49166b;
        int i11 = zwVar.f52577e0[0].h;
        int i12 = bzVar.f32381a;
        if (i11 != i12) {
            if (bzVar.f32385f) {
                zwVar.f52683z0.i(i12);
                i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                zwVar.showDialog(new ug.i0(3, i10, this.f49165a, zwVar, null));
                return;
            }
            ArrayList T0 = zwVar.getMessagesController().T0();
            if (!bzVar.f32384e && ((i7 = bzVar.f32381a) < 0 || i7 >= T0.size())) {
                return;
            }
            yw ywVar = zwVar.f52577e0[1];
            ywVar.h = bzVar.f32381a;
            ywVar.setVisibility(0);
            yw[] ywVarArr = zwVar.f52577e0;
            ywVarArr[1].setTranslationX(ywVarArr[0].getMeasuredWidth());
            zw.j1(zwVar, false);
            zwVar.d5(true);
            zwVar.j3 = z9;
        }
    }

    public final void d(org.telegram.messenger.vo voVar) {
        boolean d = voVar.d();
        zw zwVar = this.f49166b;
        if (d) {
            org.telegram.ui.Components.vz.g1(zwVar, voVar.f26074a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zwVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131750790, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new su(2, this, voVar));
        zwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, zwVar.getResourceProvider());
        }
    }
}
