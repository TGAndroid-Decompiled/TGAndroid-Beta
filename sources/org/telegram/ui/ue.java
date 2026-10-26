package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f44115a = 0;
    public final un f44116b;
    public final MessagesController f44117c;
    public final CharSequence d;
    public final boolean e;

    public ue(un unVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f44116b = unVar;
        this.d = charSequence;
        this.f44117c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f44115a) {
            case 0:
                un.k1(this.f44116b, this.d, this.f44117c, this.e);
                return;
            default:
                un unVar = this.f44116b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44388qa);
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f44117c;
                alertDialog$Builder.k(string, new ea.b(unVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.T = string2;
                unVar.showDialog(e2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(un unVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f44116b = unVar;
        this.f44117c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
