package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f38784a = 0;
    public final zn f38785b;
    public final MessagesController f38786c;
    public final CharSequence d;
    public final boolean e;

    public ue(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        this.f38785b = znVar;
        this.d = charSequence;
        this.f38786c = messagesController;
        this.e = z4;
    }

    @Override
    public final void run() {
        switch (this.f38784a) {
            case 0:
                zn.k0(this.f38785b, this.d, this.f38786c, this.e);
                return;
            default:
                zn znVar = this.f38785b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40534ba);
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38786c;
                alertDialog$Builder.k(string, new o9.b(znVar, messagesController, this.d, this.e, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.Q = string2;
                znVar.showDialog(d2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z4) {
        this.f38785b = znVar;
        this.f38786c = messagesController;
        this.d = charSequence;
        this.e = z4;
    }
}
