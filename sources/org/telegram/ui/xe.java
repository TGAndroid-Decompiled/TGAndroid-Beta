package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xe implements Runnable {
    public final int f39615a = 0;
    public final xn f39616b;
    public final MessagesController f39617c;
    public final CharSequence d;
    public final boolean e;

    public xe(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f39616b = xnVar;
        this.d = charSequence;
        this.f39617c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f39615a) {
            case 0:
                xn.g1(this.f39616b, this.d, this.f39617c, this.e);
                return;
            default:
                xn xnVar = this.f39616b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39750ea);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f39617c;
                alertDialog$Builder.k(string, new ca.b(xnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.T = string2;
                xnVar.showDialog(c2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public xe(xn xnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f39616b = xnVar;
        this.f39617c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
