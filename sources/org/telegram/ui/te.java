package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements Runnable {
    public final int f41646a = 0;
    public final qn f41647b;
    public final MessagesController f41648c;
    public final CharSequence d;
    public final boolean e;

    public te(qn qnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f41647b = qnVar;
        this.d = charSequence;
        this.f41648c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f41646a) {
            case 0:
                qn.o0(this.f41647b, this.d, this.f41648c, this.e);
                return;
            default:
                qn qnVar = this.f41647b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40667ea);
                alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41648c;
                alertDialog$Builder.k(string, new da.b(qnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
                b2Var.T = string2;
                qnVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public te(qn qnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f41647b = qnVar;
        this.f41648c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
