package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f38530a = 0;
    public final wn f38531b;
    public final MessagesController f38532c;
    public final CharSequence d;
    public final boolean e;

    public ue(wn wnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f38531b = wnVar;
        this.d = charSequence;
        this.f38532c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f38530a) {
            case 0:
                wn.g1(this.f38531b, this.d, this.f38532c, this.e);
                return;
            default:
                wn wnVar = this.f38531b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f39562ea);
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38532c;
                alertDialog$Builder.k(string, new ca.b(wnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                a2Var.T = string2;
                wnVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(wn wnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f38531b = wnVar;
        this.f38532c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
