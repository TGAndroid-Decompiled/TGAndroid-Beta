package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements Runnable {
    public final int f37622a = 0;
    public final xn f37623b;
    public final MessagesController f37624c;
    public final CharSequence d;
    public final boolean e;

    public te(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f37623b = xnVar;
        this.d = charSequence;
        this.f37624c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f37622a) {
            case 0:
                xn.l0(this.f37623b, this.d, this.f37624c, this.e);
                return;
            default:
                xn xnVar = this.f37623b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39370ea);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f37624c;
                alertDialog$Builder.k(string, new ca.b(xnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.T = string2;
                xnVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public te(xn xnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f37623b = xnVar;
        this.f37624c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
