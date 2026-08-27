package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class x61 extends org.telegram.ui.ActionBar.e3 {

    public static final int f44293e = 0;

    public TLRPC.TL_authorization f44294b;

    public SessionsActivity f44295c;
    public org.telegram.ui.Components.ri0 d;

    public static void m(x61 x61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new w(10, x61Var, str));
        alertDialog$Builder.o();
    }

    public static void n(x61 x61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = x61Var.f44294b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(x61Var.currentAccount).sendRequest(changeauthorizationsettings, new jh.m5(18));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
