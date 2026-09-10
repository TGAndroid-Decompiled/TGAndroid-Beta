package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we implements Runnable {
    public final int f37838a = 0;
    public final eo f37839b;
    public final MessagesController f37840c;
    public final CharSequence d;
    public final boolean e;

    public we(eo eoVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f37839b = eoVar;
        this.d = charSequence;
        this.f37840c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f37838a) {
            case 0:
                eo.k0(this.f37839b, this.d, this.f37840c, this.e);
                return;
            default:
                eo eoVar = this.f37839b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f32316ea);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f37840c;
                alertDialog$Builder.k(string, new ca.b(eoVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.T = string2;
                eoVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public we(eo eoVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f37839b = eoVar;
        this.f37840c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
