package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ux implements org.telegram.ui.Components.n00 {
    public final Context f44128a;
    public final ey f44129b;

    public ux(Context context, ey eyVar) {
        this.f44129b = eyVar;
        this.f44128a = context;
    }

    public final int a(int i10) {
        ey eyVar = this.f44129b;
        if (eyVar.R0 != 3) {
            if (i10 == eyVar.f39105z0.getDefaultTabId()) {
                return eyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = eyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return eyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ey eyVar = this.f44129b;
        if (i10 != 0 || eyVar.f38998e0[1].getVisibility() == 0 || eyVar.f39026j2) {
            if (eyVar.f39022i3) {
                dy dyVar = eyVar.f38998e0[0];
                dyVar.setTranslationX((-f7) * dyVar.getMeasuredWidth());
                dy[] dyVarArr = eyVar.f38998e0;
                dyVarArr[1].setTranslationX(dyVarArr[0].getMeasuredWidth() - (f7 * eyVar.f38998e0[0].getMeasuredWidth()));
            } else {
                dy dyVar2 = eyVar.f38998e0[0];
                dyVar2.setTranslationX(dyVar2.getMeasuredWidth() * f7);
                dy[] dyVarArr2 = eyVar.f38998e0;
                dyVarArr2[1].setTranslationX((f7 * dyVarArr2[0].getMeasuredWidth()) - eyVar.f38998e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                dy[] dyVarArr3 = eyVar.f38998e0;
                dy dyVar3 = dyVarArr3[0];
                dyVarArr3[0] = dyVarArr3[1];
                dyVarArr3[1] = dyVar3;
                dyVar3.setVisibility(8);
                ey.g1(eyVar, true);
                eyVar.b5(false);
                eyVar.f39105z0.O = false;
                eyVar.z3(eyVar.f38998e0[0]);
                eyVar.f38998e0[0].d.getClass();
                eyVar.f38998e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.p00 p00Var, boolean z10) {
        int i10;
        int i11;
        ey eyVar = this.f44129b;
        int i12 = eyVar.f38998e0[0].h;
        int i13 = p00Var.f31417a;
        if (i12 != i13) {
            if (p00Var.f31420f) {
                eyVar.f39105z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                eyVar.showDialog(new tg.j0(3, i11, this.f44128a, eyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = eyVar.getMessagesController().getDialogFilters();
            if (!p00Var.e && ((i10 = p00Var.f31417a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            dy dyVar = eyVar.f38998e0[1];
            dyVar.h = p00Var.f31417a;
            dyVar.setVisibility(0);
            dy[] dyVarArr = eyVar.f38998e0;
            dyVarArr[1].setTranslationX(dyVarArr[0].getMeasuredWidth());
            ey.g1(eyVar, false);
            eyVar.Z4(true);
            eyVar.f39022i3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ey eyVar = this.f44129b;
        if (isChatlist) {
            org.telegram.ui.Components.n10.U(eyVar, dialogFilter.f19548id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(10, this, dialogFilter));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        eyVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, eyVar.getResourceProvider());
        }
    }
}
