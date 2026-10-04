package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we implements Runnable {
    public final int f42081a = 0;
    public final yn f42082b;
    public final MessagesController f42083c;
    public final CharSequence d;
    public final boolean f42084e;

    public we(yn ynVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f42082b = ynVar;
        this.d = charSequence;
        this.f42083c = messagesController;
        this.f42084e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42081a) {
            case 0:
                yn.m0(this.f42082b, this.d, this.f42083c, this.f42084e);
                return;
            default:
                yn ynVar = this.f42082b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43307ca);
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f42083c;
                alertDialog$Builder.k(string, new ca.b(ynVar, messagesController, this.d, this.f42084e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                b2Var.T = string2;
                ynVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public we(yn ynVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f42082b = ynVar;
        this.f42083c = messagesController;
        this.d = charSequence;
        this.f42084e = z10;
    }
}
