package org.telegram.ui;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wd0 implements ss, OnSuccessListener, OnFailureListener {
    public final be0 f52553a;

    public wd0(be0 be0Var) {
        this.f52553a = be0Var;
    }

    @Override
    public void e(ps psVar) {
        be0 be0Var = this.f52553a;
        be0Var.L = true;
        String str = psVar.f50360c;
        be0Var.f45687a.setText(str);
        be0Var.u(str, psVar);
        be0Var.G = psVar;
        be0Var.F = 0;
        be0Var.L = false;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
        edit.putString("phone_code_last_matched_" + psVar.f50360c, psVar.d).apply();
        org.telegram.messenger.g0.i3(new qd0(be0Var, 4), 300L);
        zd0 zd0Var = be0Var.f45689b;
        zd0Var.requestFocus();
        zd0Var.setSelection(zd0Var.length());
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        be0 be0Var = this.f52553a;
        ce0 ce0Var = be0Var.f45699h0;
        if (!be0Var.f45688a0) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vd0(be0Var, 1), 10);
                    return;
                } else if (message != null) {
                    boolean z10 = org.telegram.messenger.r2.f26198a;
                    new org.telegram.ui.Components.cc(ce0Var.f46086a0, null).e0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                org.telegram.messenger.a8.g(exc, true);
            }
            if (be0Var.o()) {
                be0Var.t(false);
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        be0 be0Var = this.f52553a;
        ce0 ce0Var = be0Var.f45699h0;
        if (be0Var.f45688a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                ce0Var.f46110s0 = tL_help_termsOfService;
            }
            ce0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            ce0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            be0Var.t(false);
        }
    }
}
