package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te implements Runnable {
    public final int f37642a = 0;
    public final bo f37643b;
    public final MessagesController f37644c;
    public final CharSequence d;
    public final boolean e;

    public te(bo boVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.f37643b = boVar;
        this.d = charSequence;
        this.f37644c = messagesController;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f37642a) {
            case 0:
                bo.k0(this.f37643b, this.d, this.f37644c, this.e);
                return;
            default:
                bo boVar = this.f37643b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32293ea);
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.f37644c;
                alertDialog$Builder.k(string, new ca.b(boVar, messagesController, this.d, this.e, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                b2Var.T = string2;
                boVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                return;
        }
    }

    public te(bo boVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.f37643b = boVar;
        this.f37644c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
