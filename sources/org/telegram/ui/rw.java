package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rw implements org.telegram.ui.Components.v00 {
    public final Context f41519a;
    public final sy f41520b;

    public rw(Context context, sy syVar) {
        this.f41520b = syVar;
        this.f41519a = context;
    }

    public final int a(int i10) {
        sy syVar = this.f41520b;
        if (syVar.R0 != 3) {
            if (i10 == syVar.f42011z0.getDefaultTabId()) {
                return syVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = syVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return syVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        sy syVar = this.f41520b;
        if (i10 != 0 || syVar.f41907e0[1].getVisibility() == 0 || syVar.f41935j2) {
            if (syVar.f41926h3) {
                ry ryVar = syVar.f41907e0[0];
                ryVar.setTranslationX((-f7) * ryVar.getMeasuredWidth());
                ry[] ryVarArr = syVar.f41907e0;
                ryVarArr[1].setTranslationX(ryVarArr[0].getMeasuredWidth() - (f7 * syVar.f41907e0[0].getMeasuredWidth()));
            } else {
                ry ryVar2 = syVar.f41907e0[0];
                ryVar2.setTranslationX(ryVar2.getMeasuredWidth() * f7);
                ry[] ryVarArr2 = syVar.f41907e0;
                ryVarArr2[1].setTranslationX((f7 * ryVarArr2[0].getMeasuredWidth()) - syVar.f41907e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                ry[] ryVarArr3 = syVar.f41907e0;
                ry ryVar3 = ryVarArr3[0];
                ryVarArr3[0] = ryVarArr3[1];
                ryVarArr3[1] = ryVar3;
                ryVar3.setVisibility(8);
                sy.c1(syVar, true);
                syVar.Q4(false);
                syVar.f42011z0.O = false;
                syVar.o3(syVar.f41907e0[0]);
                syVar.f41907e0[0].d.getClass();
                syVar.f41907e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.x00 x00Var, boolean z10) {
        int i10;
        int i11;
        sy syVar = this.f41520b;
        int i12 = syVar.f41907e0[0].h;
        int i13 = x00Var.f32784a;
        if (i12 != i13) {
            if (x00Var.f32788f) {
                syVar.f42011z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
                syVar.showDialog(new rg.j0(3, i11, this.f41519a, syVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = syVar.getMessagesController().getDialogFilters();
            if (!x00Var.f32787e && ((i10 = x00Var.f32784a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            ry ryVar = syVar.f41907e0[1];
            ryVar.h = x00Var.f32784a;
            ryVar.setVisibility(0);
            ry[] ryVarArr = syVar.f41907e0;
            ryVarArr[1].setTranslationX(ryVarArr[0].getMeasuredWidth());
            sy.c1(syVar, false);
            syVar.O4(true);
            syVar.f41926h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        sy syVar = this.f41520b;
        if (isChatlist) {
            org.telegram.ui.Components.t10.U(syVar, dialogFilter.f17251id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar.getParentActivity());
        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nw(1, this, dialogFilter));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        syVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(syVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
        }
    }
}
