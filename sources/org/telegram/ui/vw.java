package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vw implements org.telegram.ui.Components.l00 {
    public final Context f37633a;
    public final wy f37634b;

    public vw(Context context, wy wyVar) {
        this.f37634b = wyVar;
        this.f37633a = context;
    }

    public final int a(int i10) {
        wy wyVar = this.f37634b;
        if (wyVar.R0 != 3) {
            if (i10 == wyVar.f38536z0.getDefaultTabId()) {
                return wyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = wyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return wyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        wy wyVar = this.f37634b;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || wyVar.f38431e0[1].getVisibility() == 0 || wyVar.f38459j2) {
            if (wyVar.f38450h3) {
                vy vyVar = wyVar.f38431e0[0];
                vyVar.setTranslationX((-f7) * vyVar.getMeasuredWidth());
                vy[] vyVarArr = wyVar.f38431e0;
                vyVarArr[1].setTranslationX(vyVarArr[0].getMeasuredWidth() - (f7 * wyVar.f38431e0[0].getMeasuredWidth()));
            } else {
                vy vyVar2 = wyVar.f38431e0[0];
                vyVar2.setTranslationX(vyVar2.getMeasuredWidth() * f7);
                vy[] vyVarArr2 = wyVar.f38431e0;
                vyVarArr2[1].setTranslationX((f7 * vyVarArr2[0].getMeasuredWidth()) - wyVar.f38431e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                vy[] vyVarArr3 = wyVar.f38431e0;
                vy vyVar3 = vyVarArr3[0];
                vyVarArr3[0] = vyVarArr3[1];
                vyVarArr3[1] = vyVar3;
                vyVar3.setVisibility(8);
                wy.f1(wyVar, true);
                wyVar.T4(false);
                wyVar.f38536z0.O = false;
                wyVar.r3(wyVar.f38431e0[0]);
                wyVar.f38431e0[0].d.getClass();
                wyVar.f38431e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.n00 n00Var, boolean z10) {
        int i10;
        int i11;
        wy wyVar = this.f37634b;
        int i12 = wyVar.f38431e0[0].h;
        int i13 = n00Var.f25349a;
        if (i12 != i13) {
            if (n00Var.f25352f) {
                wyVar.f38536z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                wyVar.showDialog(new qg.k0(3, i11, this.f37633a, wyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = wyVar.getMessagesController().getDialogFilters();
            if (!n00Var.e && ((i10 = n00Var.f25349a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            vy vyVar = wyVar.f38431e0[1];
            vyVar.h = n00Var.f25349a;
            vyVar.setVisibility(0);
            vy[] vyVarArr = wyVar.f38431e0;
            vyVarArr[1].setTranslationX(vyVarArr[0].getMeasuredWidth());
            wy.f1(wyVar, false);
            wyVar.R4(true);
            wyVar.f38450h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        wy wyVar = this.f37634b;
        if (isChatlist) {
            org.telegram.ui.Components.k10.T(wyVar, dialogFilter.f14645id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(24, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        wyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
        }
    }
}
