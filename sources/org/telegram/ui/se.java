package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se implements Runnable {
    public final int f41135a = 0;
    public final xn f41136b;
    public final MessagesController f41137c;
    public final CharSequence d;
    public final boolean f41138e;

    public se(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        this.f41136b = xnVar;
        this.d = charSequence;
        this.f41137c = messagesController;
        this.f41138e = z4;
    }

    @Override
    public final void run() {
        switch (this.f41135a) {
            case 0:
                xn.k0(this.f41136b, this.d, this.f41137c, this.f41138e);
                return;
            default:
                xn xnVar = this.f41136b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43114ba);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41137c;
                alertDialog$Builder.k(string, new o9.b(xnVar, messagesController, this.d, this.f41138e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.Q = string2;
                xnVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public se(xn xnVar, MessagesController messagesController, CharSequence charSequence, boolean z4) {
        this.f41136b = xnVar;
        this.f41137c = messagesController;
        this.d = charSequence;
        this.f41138e = z4;
    }
}
