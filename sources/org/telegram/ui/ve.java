package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve implements Runnable {
    public final int f38402a = 0;
    public final bo f38403b;
    public final MessagesController f38404c;
    public final CharSequence d;
    public final boolean e;

    public ve(bo boVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f38403b = boVar;
        this.d = charSequence;
        this.f38404c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f38402a) {
            case 0:
                bo.k0(this.f38403b, this.d, this.f38404c, this.e);
                return;
            default:
                bo boVar = this.f38403b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32279ea);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f38404c;
                alertDialog$Builder.k(string, new ca.b(boVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.T = string2;
                boVar.showDialog(c2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public ve(bo boVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f38403b = boVar;
        this.f38404c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
