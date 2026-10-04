package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we implements Runnable {
    public final int f42074a = 0;
    public final yn f42075b;
    public final MessagesController f42076c;
    public final CharSequence d;
    public final boolean f42077e;

    public we(yn ynVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f42075b = ynVar;
        this.d = charSequence;
        this.f42076c = messagesController;
        this.f42077e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42074a) {
            case 0:
                yn.m0(this.f42075b, this.d, this.f42076c, this.f42077e);
                return;
            default:
                yn ynVar = this.f42075b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f42076c;
                alertDialog$Builder.k(string, new ca.b(ynVar, messagesController, this.d, this.f42077e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
                b2Var.T = string2;
                ynVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public we(yn ynVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f42075b = ynVar;
        this.f42076c = messagesController;
        this.d = charSequence;
        this.f42077e = z10;
    }
}
