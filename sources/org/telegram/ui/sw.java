package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sw implements org.telegram.ui.Components.v00 {
    public final Context f41823a;
    public final ty f41824b;

    public sw(Context context, ty tyVar) {
        this.f41824b = tyVar;
        this.f41823a = context;
    }

    public final int a(int i10) {
        ty tyVar = this.f41824b;
        if (tyVar.R0 != 3) {
            if (i10 == tyVar.f42322z0.getDefaultTabId()) {
                return tyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = tyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return tyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ty tyVar = this.f41824b;
        if (i10 != 0 || tyVar.f42218e0[1].getVisibility() == 0 || tyVar.f42246j2) {
            if (tyVar.f42237h3) {
                sy syVar = tyVar.f42218e0[0];
                syVar.setTranslationX((-f7) * syVar.getMeasuredWidth());
                sy[] syVarArr = tyVar.f42218e0;
                syVarArr[1].setTranslationX(syVarArr[0].getMeasuredWidth() - (f7 * tyVar.f42218e0[0].getMeasuredWidth()));
            } else {
                sy syVar2 = tyVar.f42218e0[0];
                syVar2.setTranslationX(syVar2.getMeasuredWidth() * f7);
                sy[] syVarArr2 = tyVar.f42218e0;
                syVarArr2[1].setTranslationX((f7 * syVarArr2[0].getMeasuredWidth()) - tyVar.f42218e0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                sy[] syVarArr3 = tyVar.f42218e0;
                sy syVar3 = syVarArr3[0];
                syVarArr3[0] = syVarArr3[1];
                syVarArr3[1] = syVar3;
                syVar3.setVisibility(8);
                ty.c1(tyVar, true);
                tyVar.Q4(false);
                tyVar.f42322z0.O = false;
                tyVar.o3(tyVar.f42218e0[0]);
                tyVar.f42218e0[0].d.getClass();
                tyVar.f42218e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.x00 x00Var, boolean z10) {
        int i10;
        int i11;
        ty tyVar = this.f41824b;
        int i12 = tyVar.f42218e0[0].h;
        int i13 = x00Var.f32794a;
        if (i12 != i13) {
            if (x00Var.f32798f) {
                tyVar.f42322z0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                tyVar.showDialog(new rg.j0(3, i11, this.f41823a, tyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = tyVar.getMessagesController().getDialogFilters();
            if (!x00Var.f32797e && ((i10 = x00Var.f32794a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            sy syVar = tyVar.f42218e0[1];
            syVar.h = x00Var.f32794a;
            syVar.setVisibility(0);
            sy[] syVarArr = tyVar.f42218e0;
            syVarArr[1].setTranslationX(syVarArr[0].getMeasuredWidth());
            ty.c1(tyVar, false);
            tyVar.O4(true);
            tyVar.f42237h3 = z10;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        ty tyVar = this.f41824b;
        if (isChatlist) {
            org.telegram.ui.Components.t10.U(tyVar, dialogFilter.f17256id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rw(0, this, dialogFilter));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        tyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7));
        }
    }
}
