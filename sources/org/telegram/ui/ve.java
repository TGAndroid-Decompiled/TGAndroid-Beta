package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f38528a = 0;
    public final zn f38529b;
    public final MessagesController f38530c;
    public final CharSequence d;
    public final boolean e;

    public ve(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f38529b = znVar;
        this.d = charSequence;
        this.f38530c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f38528a) {
            case 0:
                zn.g1(this.f38529b, this.d, this.f38530c, this.e);
                return;
            default:
                zn znVar = this.f38529b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40303ea);
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38530c;
                alertDialog$Builder.k(string, new ca.b(znVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                b2Var.T = string2;
                znVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ve(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f38529b = znVar;
        this.f38530c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
