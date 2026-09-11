package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f41073a = 0;
    public final co f41074b;
    public final MessagesController f41075c;
    public final CharSequence d;
    public final boolean f41076e;

    public ue(co coVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f41074b = coVar;
        this.d = charSequence;
        this.f41075c = messagesController;
        this.f41076e = z10;
    }

    @Override
    public final void run() {
        switch (this.f41073a) {
            case 0:
                co.k0(this.f41074b, this.d, this.f41075c, this.f41076e);
                return;
            default:
                co coVar = this.f41074b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35247ea);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41075c;
                alertDialog$Builder.k(string, new ca.b(coVar, messagesController, this.d, this.f41076e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.T = string2;
                coVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(co coVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f41074b = coVar;
        this.f41075c = messagesController;
        this.d = charSequence;
        this.f41076e = z10;
    }
}
