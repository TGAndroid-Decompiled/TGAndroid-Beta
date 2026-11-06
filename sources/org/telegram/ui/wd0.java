package org.telegram.ui;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wd0 implements ps, OnSuccessListener, OnFailureListener {
    public final be0 f51066a;

    public wd0(be0 be0Var) {
        this.f51066a = be0Var;
    }

    @Override
    public void b(ms msVar) {
        be0 be0Var = this.f51066a;
        be0Var.K = true;
        String str = msVar.f47872c;
        be0Var.f44291a.setText(str);
        be0Var.u(str, msVar);
        be0Var.F = msVar;
        be0Var.E = 0;
        be0Var.K = false;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putString("phone_code_last_matched_" + msVar.f47872c, msVar.d).apply();
        org.telegram.messenger.g0.i3(new qd0(be0Var, 4), 300L);
        zd0 zd0Var = be0Var.f44293b;
        zd0Var.requestFocus();
        zd0Var.setSelection(zd0Var.length());
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        be0 be0Var = this.f51066a;
        ce0 ce0Var = be0Var.f44302g0;
        if (!be0Var.W) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vd0(be0Var, 1), 10);
                    return;
                } else if (message != null) {
                    boolean z9 = org.telegram.messenger.r2.f25191a;
                    new org.telegram.ui.Components.hc(ce0Var.Z, null).e0(message, false);
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
        be0 be0Var = this.f51066a;
        ce0 ce0Var = be0Var.f44302g0;
        if (be0Var.W) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                ce0Var.f44778q0 = tL_help_termsOfService;
            }
            ce0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            ce0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            be0Var.t(false);
        }
    }
}
