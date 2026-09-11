package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tw implements org.telegram.ui.Components.e00 {
    public final Context f40840a;
    public final uy f40841b;

    public tw(Context context, uy uyVar) {
        this.f40841b = uyVar;
        this.f40840a = context;
    }

    public final int a(int i10) {
        uy uyVar = this.f40841b;
        if (uyVar.R0 != 3) {
            if (i10 == uyVar.f41364z0.getDefaultTabId()) {
                return uyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return uyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        uy uyVar = this.f40841b;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || uyVar.f41259e0[1].getVisibility() == 0 || uyVar.f41287j2) {
            if (uyVar.f41278h3) {
                ty tyVar = uyVar.f41259e0[0];
                tyVar.setTranslationX((-f7) * tyVar.getMeasuredWidth());
                ty[] tyVarArr = uyVar.f41259e0;
                tyVarArr[1].setTranslationX(tyVarArr[0].getMeasuredWidth() - (f7 * uyVar.f41259e0[0].getMeasuredWidth()));
            } else {
                ty tyVar2 = uyVar.f41259e0[0];
                tyVar2.setTranslationX(tyVar2.getMeasuredWidth() * f7);
                ty[] tyVarArr2 = uyVar.f41259e0;
                tyVarArr2[1].setTranslationX((f7 * tyVarArr2[0].getMeasuredWidth()) - uyVar.f41259e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ty[] tyVarArr3 = uyVar.f41259e0;
                ty tyVar3 = tyVarArr3[0];
                tyVarArr3[0] = tyVarArr3[1];
                tyVarArr3[1] = tyVar3;
                tyVar3.setVisibility(8);
                uy.f1(uyVar, true);
                uyVar.T4(false);
                uyVar.f41364z0.O = false;
                uyVar.r3(uyVar.f41259e0[0]);
                uyVar.f41259e0[0].d.getClass();
                uyVar.f41259e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.g00 g00Var, boolean z10) {
        int i10;
        int i11;
        uy uyVar = this.f40841b;
        int i12 = uyVar.f41259e0[0].h;
        int i13 = g00Var.f26217a;
        if (i12 != i13) {
            if (g00Var.f26221f) {
                uyVar.f41364z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                uyVar.showDialog(new sg.k0(3, i11, this.f40840a, uyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
            if (!g00Var.f26220e && ((i10 = g00Var.f26217a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ty tyVar = uyVar.f41259e0[1];
            tyVar.h = g00Var.f26217a;
            tyVar.setVisibility(0);
            ty[] tyVarArr = uyVar.f41259e0;
            tyVarArr[1].setTranslationX(tyVarArr[0].getMeasuredWidth());
            uy.f1(uyVar, false);
            uyVar.R4(true);
            uyVar.f41278h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        uy uyVar = this.f40841b;
        if (isChatlist) {
            org.telegram.ui.Components.c10.T(uyVar, dialogFilter.f17080id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(29, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20898q7));
        }
    }
}
