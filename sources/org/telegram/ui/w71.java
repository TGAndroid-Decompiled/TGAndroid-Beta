package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w71 extends org.telegram.ui.ActionBar.f3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f38553b;
    public SessionsActivity f38554c;
    public org.telegram.ui.Components.bj0 d;

    public static void m(w71 w71Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w71Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(11, w71Var, str));
        alertDialog$Builder.o();
    }

    public static void n(w71 w71Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = w71Var.f38553b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(w71Var.currentAccount).sendRequest(changeauthorizationsettings, new ai.u7(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
