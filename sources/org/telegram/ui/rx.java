package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rx implements org.telegram.ui.Components.n00 {
    public final Context f43309a;
    public final cy f43310b;

    public rx(Context context, cy cyVar) {
        this.f43310b = cyVar;
        this.f43309a = context;
    }

    public final int a(int i10) {
        cy cyVar = this.f43310b;
        if (cyVar.R0 != 3) {
            if (i10 == cyVar.f38693z0.getDefaultTabId()) {
                return cyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = cyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return cyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        cy cyVar = this.f43310b;
        if (i10 != 0 || cyVar.f38586e0[1].getVisibility() == 0 || cyVar.f38614j2) {
            if (cyVar.f38610i3) {
                ay ayVar = cyVar.f38586e0[0];
                ayVar.setTranslationX((-f7) * ayVar.getMeasuredWidth());
                ay[] ayVarArr = cyVar.f38586e0;
                ayVarArr[1].setTranslationX(ayVarArr[0].getMeasuredWidth() - (f7 * cyVar.f38586e0[0].getMeasuredWidth()));
            } else {
                ay ayVar2 = cyVar.f38586e0[0];
                ayVar2.setTranslationX(ayVar2.getMeasuredWidth() * f7);
                ay[] ayVarArr2 = cyVar.f38586e0;
                ayVarArr2[1].setTranslationX((f7 * ayVarArr2[0].getMeasuredWidth()) - cyVar.f38586e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ay[] ayVarArr3 = cyVar.f38586e0;
                ay ayVar3 = ayVarArr3[0];
                ayVarArr3[0] = ayVarArr3[1];
                ayVarArr3[1] = ayVar3;
                ayVar3.setVisibility(8);
                cy.g1(cyVar, true);
                cyVar.b5(false);
                cyVar.f38693z0.O = false;
                cyVar.z3(cyVar.f38586e0[0]);
                cyVar.f38586e0[0].d.getClass();
                cyVar.f38586e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.p00 p00Var, boolean z10) {
        int i10;
        int i11;
        cy cyVar = this.f43310b;
        int i12 = cyVar.f38586e0[0].h;
        int i13 = p00Var.f31401a;
        if (i12 != i13) {
            if (p00Var.f31404f) {
                cyVar.f38693z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                cyVar.showDialog(new tg.j0(3, i11, this.f43309a, cyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = cyVar.getMessagesController().getDialogFilters();
            if (!p00Var.e && ((i10 = p00Var.f31401a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ay ayVar = cyVar.f38586e0[1];
            ayVar.h = p00Var.f31401a;
            ayVar.setVisibility(0);
            ay[] ayVarArr = cyVar.f38586e0;
            ayVarArr[1].setTranslationX(ayVarArr[0].getMeasuredWidth());
            cy.g1(cyVar, false);
            cyVar.Z4(true);
            cyVar.f38610i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        cy cyVar = this.f43310b;
        if (isChatlist) {
            org.telegram.ui.Components.n10.U(cyVar, dialogFilter.f19549id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(10, this, dialogFilter));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        cyVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, cyVar.getResourceProvider());
        }
    }
}
