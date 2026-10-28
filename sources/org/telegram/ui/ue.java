package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f43995a = 0;
    public final wn f43996b;
    public final MessagesController f43997c;
    public final CharSequence d;
    public final boolean e;

    public ue(wn wnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f43996b = wnVar;
        this.d = charSequence;
        this.f43997c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f43995a) {
            case 0:
                wn.m0(this.f43996b, this.d, this.f43997c, this.e);
                return;
            default:
                wn wnVar = this.f43996b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f43997c;
                alertDialog$Builder.k(string, new ea.b(wnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.T = string2;
                wnVar.showDialog(e2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(wn wnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f43996b = wnVar;
        this.f43997c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
