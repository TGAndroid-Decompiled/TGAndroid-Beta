package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se implements Runnable {
    public final int f38309a = 0;
    public final xn f38310b;
    public final MessagesController f38311c;
    public final CharSequence d;
    public final boolean e;

    public se(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        this.f38310b = xnVar;
        this.d = charSequence;
        this.f38311c = messagesController;
        this.e = z4;
    }

    @Override
    public final void run() {
        switch (this.f38309a) {
            case 0:
                xn.k0(this.f38310b, this.d, this.f38311c, this.e);
                return;
            default:
                xn xnVar = this.f38310b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39968ba);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38311c;
                alertDialog$Builder.k(string, new o9.b(xnVar, messagesController, this.d, this.e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.Q = string2;
                xnVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public se(xn xnVar, MessagesController messagesController, CharSequence charSequence, boolean z4) {
        this.f38310b = xnVar;
        this.f38311c = messagesController;
        this.d = charSequence;
        this.e = z4;
    }
}
