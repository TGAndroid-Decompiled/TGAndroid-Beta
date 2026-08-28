package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y61 extends org.telegram.ui.ActionBar.f3 {
    public static final int f44758e = 0;
    public TLRPC.TL_authorization f44759b;
    public SessionsActivity f44760c;
    public org.telegram.ui.Components.pi0 d;

    public static void m(y61 y61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new v(10, y61Var, str));
        alertDialog$Builder.o();
    }

    public static void n(y61 y61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = y61Var.f44759b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(y61Var.currentAccount).sendRequest(changeauthorizationsettings, new ih.q5(18));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
