package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u61 extends org.telegram.ui.ActionBar.f3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f41822b;
    public SessionsActivity f41823c;
    public org.telegram.ui.Components.yj0 d;

    public static void n(u61 u61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(12, u61Var, str));
        alertDialog$Builder.o();
    }

    public static void o(u61 u61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = u61Var.f41822b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(u61Var.currentAccount).sendRequest(changeauthorizationsettings, new ci.e6(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
