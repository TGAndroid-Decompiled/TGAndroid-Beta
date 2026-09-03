package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qw implements org.telegram.ui.Components.f00 {
    public final Context f37509a;
    public final qy f37510b;

    public qw(Context context, qy qyVar) {
        this.f37510b = qyVar;
        this.f37509a = context;
    }

    public final int a(int i10) {
        qy qyVar = this.f37510b;
        if (qyVar.O0 != 3) {
            if (i10 == qyVar.f37633w0.getDefaultTabId()) {
                return qyVar.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
            if (i10 >= 0 && i10 < dialogFilters.size()) {
                return qyVar.getMessagesController().getDialogFilters().get(i10).unreadCount;
            }
            return 0;
        }
        return 0;
    }

    public final void b(float f10) {
        qy qyVar = this.f37510b;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 != 0 || qyVar.f37527b0[1].getVisibility() == 0 || qyVar.f37555g2) {
            if (qyVar.f37545e3) {
                py pyVar = qyVar.f37527b0[0];
                pyVar.setTranslationX((-f10) * pyVar.getMeasuredWidth());
                py[] pyVarArr = qyVar.f37527b0;
                pyVarArr[1].setTranslationX(pyVarArr[0].getMeasuredWidth() - (f10 * qyVar.f37527b0[0].getMeasuredWidth()));
            } else {
                py pyVar2 = qyVar.f37527b0[0];
                pyVar2.setTranslationX(pyVar2.getMeasuredWidth() * f10);
                py[] pyVarArr2 = qyVar.f37527b0;
                pyVarArr2[1].setTranslationX((f10 * pyVarArr2[0].getMeasuredWidth()) - qyVar.f37527b0[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                py[] pyVarArr3 = qyVar.f37527b0;
                py pyVar3 = pyVarArr3[0];
                pyVarArr3[0] = pyVarArr3[1];
                pyVarArr3[1] = pyVar3;
                pyVar3.setVisibility(8);
                qy.f1(qyVar, true);
                qyVar.T4(false);
                qyVar.f37633w0.L = false;
                qyVar.r3(qyVar.f37527b0[0]);
                qyVar.f37527b0[0].d.getClass();
                qyVar.f37527b0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.h00 h00Var, boolean z4) {
        int i10;
        int i11;
        qy qyVar = this.f37510b;
        int i12 = qyVar.f37527b0[0].h;
        int i13 = h00Var.f25280a;
        if (i12 != i13) {
            if (h00Var.f25283f) {
                qyVar.f37633w0.i(i13);
                i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                qyVar.showDialog(new eg.v0(3, i11, this.f37509a, qyVar, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
            if (!h00Var.e && ((i10 = h00Var.f25280a) < 0 || i10 >= dialogFilters.size())) {
                return;
            }
            py pyVar = qyVar.f37527b0[1];
            pyVar.h = h00Var.f25280a;
            pyVar.setVisibility(0);
            py[] pyVarArr = qyVar.f37527b0;
            pyVarArr[1].setTranslationX(pyVarArr[0].getMeasuredWidth());
            qy.f1(qyVar, false);
            qyVar.R4(true);
            qyVar.f37545e3 = z4;
        }
    }

    public final void d(MessagesController.DialogFilter dialogFilter) {
        boolean isChatlist = dialogFilter.isChatlist();
        qy qyVar = this.f37510b;
        if (isChatlist) {
            org.telegram.ui.Components.d10.T(qyVar, dialogFilter.f16649id, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.FilterDelete);
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ss(7, this, dialogFilter));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        qyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
        }
    }
}
