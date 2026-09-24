package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f38421a = 0;
    public final wn f38422b;
    public final MessagesController f38423c;
    public final CharSequence d;
    public final boolean e;

    public ue(wn wnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f38422b = wnVar;
        this.d = charSequence;
        this.f38423c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f38421a) {
            case 0:
                wn.g1(this.f38422b, this.d, this.f38423c, this.e);
                return;
            default:
                wn wnVar = this.f38422b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f39454ea);
                alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38423c;
                alertDialog$Builder.k(string, new ca.b(wnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
                a2Var.T = string2;
                wnVar.showDialog(a2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(wn wnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f38422b = wnVar;
        this.f38423c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
