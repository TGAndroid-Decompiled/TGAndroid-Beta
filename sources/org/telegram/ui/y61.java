package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y61 extends org.telegram.ui.ActionBar.h3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f43738b;
    public SessionsActivity f43739c;
    public org.telegram.ui.Components.bk0 d;

    public static void m(y61 y61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(12, y61Var, str));
        alertDialog$Builder.p();
    }

    public static void n(y61 y61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = y61Var.f43738b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(y61Var.currentAccount).sendRequest(changeauthorizationsettings, new ci.d6(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
