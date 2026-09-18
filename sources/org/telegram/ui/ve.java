package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f38536a = 0;
    public final zn f38537b;
    public final MessagesController f38538c;
    public final CharSequence d;
    public final boolean e;

    public ve(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f38537b = znVar;
        this.d = charSequence;
        this.f38538c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f38536a) {
            case 0:
                zn.g1(this.f38537b, this.d, this.f38538c, this.e);
                return;
            default:
                zn znVar = this.f38537b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40261ea);
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38538c;
                alertDialog$Builder.k(string, new ca.b(znVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.T = string2;
                znVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ve(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f38537b = znVar;
        this.f38538c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
