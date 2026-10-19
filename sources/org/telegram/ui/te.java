package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements Runnable {
    public final int f41647a = 0;
    public final qn f41648b;
    public final MessagesController f41649c;
    public final CharSequence d;
    public final boolean e;

    public te(qn qnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f41648b = qnVar;
        this.d = charSequence;
        this.f41649c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f41647a) {
            case 0:
                qn.o0(this.f41648b, this.d, this.f41649c, this.e);
                return;
            default:
                qn qnVar = this.f41648b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40675ea);
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41649c;
                alertDialog$Builder.k(string, new da.b(qnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.T = string2;
                qnVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public te(qn qnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f41648b = qnVar;
        this.f41649c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
