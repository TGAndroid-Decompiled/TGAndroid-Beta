package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xw implements org.telegram.ui.Components.q00 {
    public final Context f41670a;
    public final yy f41671b;

    public xw(Context context, yy yyVar) {
        this.f41671b = yyVar;
        this.f41670a = context;
    }

    public final int a(int i10) {
        yy yyVar = this.f41671b;
        if (yyVar.R0 != 3) {
            if (i10 == yyVar.f42110z0.getDefaultTabId()) {
                return yyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = yyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return yyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        yy yyVar = this.f41671b;
        if (i10 != 0 || yyVar.f42004e0[1].getVisibility() == 0 || yyVar.f42032j2) {
            if (yyVar.f42028i3) {
                xy xyVar = yyVar.f42004e0[0];
                xyVar.setTranslationX((-f7) * xyVar.getMeasuredWidth());
                xy[] xyVarArr = yyVar.f42004e0;
                xyVarArr[1].setTranslationX(xyVarArr[0].getMeasuredWidth() - (f7 * yyVar.f42004e0[0].getMeasuredWidth()));
            } else {
                xy xyVar2 = yyVar.f42004e0[0];
                xyVar2.setTranslationX(xyVar2.getMeasuredWidth() * f7);
                xy[] xyVarArr2 = yyVar.f42004e0;
                xyVarArr2[1].setTranslationX((f7 * xyVarArr2[0].getMeasuredWidth()) - yyVar.f42004e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                xy[] xyVarArr3 = yyVar.f42004e0;
                xy xyVar3 = xyVarArr3[0];
                xyVarArr3[0] = xyVarArr3[1];
                xyVarArr3[1] = xyVar3;
                xyVar3.setVisibility(8);
                yy.c1(yyVar, true);
                yyVar.R4(false);
                yyVar.f42110z0.O = false;
                yyVar.p3(yyVar.f42004e0[0]);
                yyVar.f42004e0[0].d.getClass();
                yyVar.f42004e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.s00 s00Var, boolean z10) {
        int i10;
        int i11;
        yy yyVar = this.f41671b;
        int i12 = yyVar.f42004e0[0].h;
        int i13 = s00Var.f28686a;
        if (i12 != i13) {
            if (s00Var.f28689f) {
                yyVar.f42110z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                yyVar.showDialog(new sg.j0(3, i11, this.f41670a, yyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = yyVar.getMessagesController().getDialogFilters();
            if (!s00Var.e && ((i10 = s00Var.f28686a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            xy xyVar = yyVar.f42004e0[1];
            xyVar.h = s00Var.f28686a;
            xyVar.setVisibility(0);
            xy[] xyVarArr = yyVar.f42004e0;
            xyVarArr[1].setTranslationX(xyVarArr[0].getMeasuredWidth());
            yy.c1(yyVar, false);
            yyVar.P4(true);
            yyVar.f42028i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        yy yyVar = this.f41671b;
        if (isChatlist) {
            org.telegram.ui.Components.o10.U(yyVar, dialogFilter.f16400id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qw(2, this, dialogFilter));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        yyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
        }
    }
}
