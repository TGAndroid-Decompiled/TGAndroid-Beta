package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z61 extends org.telegram.ui.ActionBar.k3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f46191b;
    public SessionsActivity f46192c;
    public org.telegram.ui.Components.ak0 d;

    public static void m(z61 z61Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z61Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ng.j(12, z61Var, str));
        alertDialog$Builder.p();
    }

    public static void n(z61 z61Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = z61Var.f46191b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(z61Var.currentAccount).sendRequest(changeauthorizationsettings, new di.d6(22));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
