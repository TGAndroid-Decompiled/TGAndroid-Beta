package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we implements Runnable {
    public final int f43193a = 0;
    public final zn f43194b;
    public final MessagesController f43195c;
    public final CharSequence d;
    public final boolean f43196e;

    public we(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f43194b = znVar;
        this.d = charSequence;
        this.f43195c = messagesController;
        this.f43196e = z10;
    }

    @Override
    public final void run() {
        switch (this.f43193a) {
            case 0:
                zn.o0(this.f43194b, this.d, this.f43195c, this.f43196e);
                return;
            default:
                zn znVar = this.f43194b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44761ea);
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f43195c;
                alertDialog$Builder.k(string, new ca.b(znVar, messagesController, this.d, this.f43196e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.T = string2;
                znVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public we(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f43194b = znVar;
        this.f43195c = messagesController;
        this.d = charSequence;
        this.f43196e = z10;
    }
}
