package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f42984a = 0;
    public final zn f42985b;
    public final MessagesController f42986c;
    public final CharSequence d;
    public final boolean f42987e;

    public ve(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f42985b = znVar;
        this.d = charSequence;
        this.f42986c = messagesController;
        this.f42987e = z10;
    }

    @Override
    public final void run() {
        switch (this.f42984a) {
            case 0:
                zn.o0(this.f42985b, this.d, this.f42986c, this.f42987e);
                return;
            default:
                zn znVar = this.f42985b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f42986c;
                alertDialog$Builder.k(string, new ca.b(znVar, messagesController, this.d, this.f42987e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.T = string2;
                znVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ve(zn znVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f42985b = znVar;
        this.f42986c = messagesController;
        this.d = charSequence;
        this.f42987e = z10;
    }
}
