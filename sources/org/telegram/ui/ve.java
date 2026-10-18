package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f42160a = 0;
    public final sn f42161b;
    public final MessagesController f42162c;
    public final CharSequence d;
    public final boolean e;

    public ve(sn snVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f42161b = snVar;
        this.d = charSequence;
        this.f42162c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42160a) {
            case 0:
                sn.o0(this.f42161b, this.d, this.f42162c, this.e);
                return;
            default:
                sn snVar = this.f42161b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41191ea);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f42162c;
                alertDialog$Builder.k(string, new da.b(snVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.T = string2;
                snVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ve(sn snVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f42161b = snVar;
        this.f42162c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
