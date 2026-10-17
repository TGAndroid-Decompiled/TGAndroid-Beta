package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w61 extends org.telegram.ui.ActionBar.f3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f42375b;
    public SessionsActivity f42376c;
    public org.telegram.ui.Components.xj0 d;

    public static void n(w61 w61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(12, w61Var, str));
        alertDialog$Builder.o();
    }

    public static void o(w61 w61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = w61Var.f42375b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(w61Var.currentAccount).sendRequest(changeauthorizationsettings, new ci.e6(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
