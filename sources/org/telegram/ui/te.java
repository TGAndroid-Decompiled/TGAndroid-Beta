package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements Runnable {
    public final int f41968a = 0;
    public final sn f41969b;
    public final MessagesController f41970c;
    public final CharSequence d;
    public final boolean e;

    public te(sn snVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f41969b = snVar;
        this.d = charSequence;
        this.f41970c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f41968a) {
            case 0:
                sn.o0(this.f41969b, this.d, this.f41970c, this.e);
                return;
            default:
                sn snVar = this.f41969b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41654qa);
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41970c;
                alertDialog$Builder.k(string, new da.b(snVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.T = string2;
                snVar.showDialog(c2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public te(sn snVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f41969b = snVar;
        this.f41970c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
