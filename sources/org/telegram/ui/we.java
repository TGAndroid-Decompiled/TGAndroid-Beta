package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we implements Runnable {
    public final int f42092a = 0;
    public final yn f42093b;
    public final MessagesController f42094c;
    public final CharSequence d;
    public final boolean f42095e;

    public we(yn ynVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f42093b = ynVar;
        this.d = charSequence;
        this.f42094c = messagesController;
        this.f42095e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42092a) {
            case 0:
                yn.m0(this.f42093b, this.d, this.f42094c, this.f42095e);
                return;
            default:
                yn ynVar = this.f42093b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f42094c;
                alertDialog$Builder.k(string, new ca.b(ynVar, messagesController, this.d, this.f42095e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.T = string2;
                ynVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public we(yn ynVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f42093b = ynVar;
        this.f42094c = messagesController;
        this.d = charSequence;
        this.f42095e = z10;
    }
}
