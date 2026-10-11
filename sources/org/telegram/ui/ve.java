package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f43018a = 0;
    public final zn f43019b;
    public final MessagesController f43020c;
    public final CharSequence d;
    public final boolean f43021e;

    public ve(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f43019b = znVar;
        this.d = charSequence;
        this.f43020c = messagesController;
        this.f43021e = z10;
    }

    @Override
    public final void run() {
        switch (this.f43018a) {
            case 0:
                zn.o0(this.f43019b, this.d, this.f43020c, this.f43021e);
                return;
            default:
                zn znVar = this.f43019b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44796ea);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f43020c;
                alertDialog$Builder.k(string, new ca.b(znVar, messagesController, this.d, this.f43021e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.T = string2;
                znVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ve(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f43019b = znVar;
        this.f43020c = messagesController;
        this.d = charSequence;
        this.f43021e = z10;
    }
}
