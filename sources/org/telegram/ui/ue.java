package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f38439a = 0;
    public final wn f38440b;
    public final MessagesController f38441c;
    public final CharSequence d;
    public final boolean e;

    public ue(wn wnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f38440b = wnVar;
        this.d = charSequence;
        this.f38441c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f38439a) {
            case 0:
                wn.g1(this.f38440b, this.d, this.f38441c, this.e);
                return;
            default:
                wn wnVar = this.f38440b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f39468ea);
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38441c;
                alertDialog$Builder.k(string, new ca.b(wnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                a2Var.T = string2;
                wnVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(wn wnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f38440b = wnVar;
        this.f38441c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
