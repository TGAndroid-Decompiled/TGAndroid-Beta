package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qw implements org.telegram.ui.Components.f00 {
    public final Context f36621a;
    public final ry f36622b;

    public qw(Context context, ry ryVar) {
        this.f36622b = ryVar;
        this.f36621a = context;
    }

    public final int a(int i10) {
        ry ryVar = this.f36622b;
        if (ryVar.R0 != 3) {
            if (i10 == ryVar.f37082z0.getDefaultTabId()) {
                return ryVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = ryVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return ryVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        ry ryVar = this.f36622b;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || ryVar.f36978e0[1].getVisibility() == 0 || ryVar.f37006j2) {
            if (ryVar.f36997h3) {
                qy qyVar = ryVar.f36978e0[0];
                qyVar.setTranslationX((-f7) * qyVar.getMeasuredWidth());
                qy[] qyVarArr = ryVar.f36978e0;
                qyVarArr[1].setTranslationX(qyVarArr[0].getMeasuredWidth() - (f7 * ryVar.f36978e0[0].getMeasuredWidth()));
            } else {
                qy qyVar2 = ryVar.f36978e0[0];
                qyVar2.setTranslationX(qyVar2.getMeasuredWidth() * f7);
                qy[] qyVarArr2 = ryVar.f36978e0;
                qyVarArr2[1].setTranslationX((f7 * qyVarArr2[0].getMeasuredWidth()) - ryVar.f36978e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                qy[] qyVarArr3 = ryVar.f36978e0;
                qy qyVar3 = qyVarArr3[0];
                qyVarArr3[0] = qyVarArr3[1];
                qyVarArr3[1] = qyVar3;
                qyVar3.setVisibility(8);
                ry.f1(ryVar, true);
                ryVar.T4(false);
                ryVar.f37082z0.O = false;
                ryVar.r3(ryVar.f36978e0[0]);
                ryVar.f36978e0[0].d.getClass();
                ryVar.f36978e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.h00 h00Var, boolean z10) {
        int i10;
        int i11;
        ry ryVar = this.f36622b;
        int i12 = ryVar.f36978e0[0].h;
        int i13 = h00Var.f24468a;
        if (i12 != i13) {
            if (h00Var.f24471f) {
                ryVar.f37082z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                ryVar.showDialog(new rg.j0(3, i11, this.f36621a, ryVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = ryVar.getMessagesController().getDialogFilters();
            if (!h00Var.e && ((i10 = h00Var.f24468a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            qy qyVar = ryVar.f36978e0[1];
            qyVar.h = h00Var.f24468a;
            qyVar.setVisibility(0);
            qy[] qyVarArr = ryVar.f36978e0;
            qyVarArr[1].setTranslationX(qyVarArr[0].getMeasuredWidth());
            ry.f1(ryVar, false);
            ryVar.R4(true);
            ryVar.f36997h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ry ryVar = this.f36622b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(ryVar, dialogFilter.f15577id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(29, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        ryVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
        }
    }
}
