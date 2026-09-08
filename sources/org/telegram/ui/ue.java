package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue implements Runnable {
    public final int f41100a = 0;
    public final co f41101b;
    public final MessagesController f41102c;
    public final CharSequence d;
    public final boolean f41103e;

    public ue(co coVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f41101b = coVar;
        this.d = charSequence;
        this.f41102c = messagesController;
        this.f41103e = z10;
    }

    @Override
    public final void run() {
        switch (this.f41100a) {
            case 0:
                co.k0(this.f41101b, this.d, this.f41102c, this.f41103e);
                return;
            default:
                co coVar = this.f41101b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35274ea);
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f41102c;
                alertDialog$Builder.k(string, new ca.b(coVar, messagesController, this.d, this.f41103e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                b2Var.T = string2;
                coVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ue(co coVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f41101b = coVar;
        this.f41102c = messagesController;
        this.d = charSequence;
        this.f41103e = z10;
    }
}
