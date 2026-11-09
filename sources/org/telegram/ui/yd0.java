package org.telegram.ui;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yd0 implements rs, OnSuccessListener, OnFailureListener {
    public final de0 f52091a;

    public yd0(de0 de0Var) {
        this.f52091a = de0Var;
    }

    @Override
    public void b(os osVar) {
        de0 de0Var = this.f52091a;
        de0Var.K = true;
        String str = osVar.f48512c;
        de0Var.f44924a.setText(str);
        de0Var.u(str, osVar);
        de0Var.F = osVar;
        de0Var.E = 0;
        de0Var.K = false;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putString("phone_code_last_matched_" + osVar.f48512c, osVar.d).apply();
        org.telegram.messenger.g0.i3(new sd0(de0Var, 4), 300L);
        be0 be0Var = de0Var.f44926b;
        be0Var.requestFocus();
        be0Var.setSelection(be0Var.length());
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        de0 de0Var = this.f52091a;
        ee0 ee0Var = de0Var.f44935g0;
        if (!de0Var.W) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xd0(de0Var, 1), 10);
                    return;
                } else if (message != null) {
                    boolean z9 = org.telegram.messenger.r2.f25212a;
                    new org.telegram.ui.Components.hc(ee0Var.Z, null).e0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                org.telegram.messenger.a8.g(exc, true);
            }
            if (de0Var.o()) {
                de0Var.t(false);
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        de0 de0Var = this.f52091a;
        ee0 ee0Var = de0Var.f44935g0;
        if (de0Var.W) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                ee0Var.f45389q0 = tL_help_termsOfService;
            }
            ee0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            ee0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            de0Var.t(false);
        }
    }
}
