package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements Runnable {
    public final int f41656a = 0;
    public final qn f41657b;
    public final MessagesController f41658c;
    public final CharSequence d;
    public final boolean e;

    public te(qn qnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f41657b = qnVar;
        this.d = charSequence;
        this.f41658c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f41656a) {
            case 0:
                qn.o0(this.f41657b, this.d, this.f41658c, this.e);
                return;
            default:
                qn qnVar = this.f41657b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40677ea);
                alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41658c;
                alertDialog$Builder.k(string, new da.b(qnVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.T = string2;
                qnVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public te(qn qnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f41657b = qnVar;
        this.f41658c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
