package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se implements Runnable {
    public final int f41234a = 0;
    public final xn f41235b;
    public final MessagesController f41236c;
    public final CharSequence d;
    public final boolean f41237e;

    public se(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        this.f41235b = xnVar;
        this.d = charSequence;
        this.f41236c = messagesController;
        this.f41237e = z4;
    }

    @Override
    public final void run() {
        switch (this.f41234a) {
            case 0:
                xn.k0(this.f41235b, this.d, this.f41236c, this.f41237e);
                return;
            default:
                xn xnVar = this.f41235b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43136ba);
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41236c;
                alertDialog$Builder.k(string, new o9.b(xnVar, messagesController, this.d, this.f41237e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.Q = string2;
                xnVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public se(xn xnVar, MessagesController messagesController, CharSequence charSequence, boolean z4) {
        this.f41235b = xnVar;
        this.f41236c = messagesController;
        this.d = charSequence;
        this.f41237e = z4;
    }
}
