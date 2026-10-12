package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uw implements org.telegram.ui.Components.x00 {
    public final Context f42602a;
    public final vy f42603b;

    public uw(Context context, vy vyVar) {
        this.f42603b = vyVar;
        this.f42602a = context;
    }

    public final int a(int i10) {
        vy vyVar = this.f42603b;
        if (vyVar.R0 != 3) {
            if (i10 == vyVar.f43009z0.getDefaultTabId()) {
                return vyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = vyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return vyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        vy vyVar = this.f42603b;
        if (i10 != 0 || vyVar.f42905e0[1].getVisibility() == 0 || vyVar.f42933j2) {
            if (vyVar.f42924h3) {
                uy uyVar = vyVar.f42905e0[0];
                uyVar.setTranslationX((-f7) * uyVar.getMeasuredWidth());
                uy[] uyVarArr = vyVar.f42905e0;
                uyVarArr[1].setTranslationX(uyVarArr[0].getMeasuredWidth() - (f7 * vyVar.f42905e0[0].getMeasuredWidth()));
            } else {
                uy uyVar2 = vyVar.f42905e0[0];
                uyVar2.setTranslationX(uyVar2.getMeasuredWidth() * f7);
                uy[] uyVarArr2 = vyVar.f42905e0;
                uyVarArr2[1].setTranslationX((f7 * uyVarArr2[0].getMeasuredWidth()) - vyVar.f42905e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                uy[] uyVarArr3 = vyVar.f42905e0;
                uy uyVar3 = uyVarArr3[0];
                uyVarArr3[0] = uyVarArr3[1];
                uyVarArr3[1] = uyVar3;
                uyVar3.setVisibility(8);
                vy.c1(vyVar, true);
                vyVar.Q4(false);
                vyVar.f43009z0.O = false;
                vyVar.o3(vyVar.f42905e0[0]);
                vyVar.f42905e0[0].d.getClass();
                vyVar.f42905e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.z00 z00Var, boolean z10) {
        int i10;
        int i11;
        vy vyVar = this.f42603b;
        int i12 = vyVar.f42905e0[0].h;
        int i13 = z00Var.f33240a;
        if (i12 != i13) {
            if (z00Var.f33244f) {
                vyVar.f43009z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                vyVar.showDialog(new rg.j0(3, i11, this.f42602a, vyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = vyVar.getMessagesController().getDialogFilters();
            if (!z00Var.f33243e && ((i10 = z00Var.f33240a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            uy uyVar = vyVar.f42905e0[1];
            uyVar.h = z00Var.f33240a;
            uyVar.setVisibility(0);
            uy[] uyVarArr = vyVar.f42905e0;
            uyVarArr[1].setTranslationX(uyVarArr[0].getMeasuredWidth());
            vy.c1(vyVar, false);
            vyVar.O4(true);
            vyVar.f42924h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        vy vyVar = this.f42603b;
        if (isChatlist) {
            org.telegram.ui.Components.v10.U(vyVar, dialogFilter.f17004id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vyVar.getParentActivity());
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tw(0, this, dialogFilter));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        vyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(vyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
        }
    }
}
