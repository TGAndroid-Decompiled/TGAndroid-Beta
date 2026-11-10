package org.telegram.ui;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zd0 implements ss, OnSuccessListener, OnFailureListener {
    public final ee0 f52441a;

    public zd0(ee0 ee0Var) {
        this.f52441a = ee0Var;
    }

    @Override
    public void b(ps psVar) {
        ee0 ee0Var = this.f52441a;
        ee0Var.K = true;
        String str = psVar.f48828c;
        ee0Var.f45244a.setText(str);
        ee0Var.u(str, psVar);
        ee0Var.F = psVar;
        ee0Var.E = 0;
        ee0Var.K = false;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putString("phone_code_last_matched_" + psVar.f48828c, psVar.d).apply();
        org.telegram.messenger.g0.i3(new td0(ee0Var, 4), 300L);
        ce0 ce0Var = ee0Var.f45246b;
        ce0Var.requestFocus();
        ce0Var.setSelection(ce0Var.length());
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        ee0 ee0Var = this.f52441a;
        fe0 fe0Var = ee0Var.f45255g0;
        if (!ee0Var.W) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new yd0(ee0Var, 1), 10);
                    return;
                } else if (message != null) {
                    boolean z9 = org.telegram.messenger.r2.f25216a;
                    new org.telegram.ui.Components.gc(fe0Var.Z, null).e0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                org.telegram.messenger.a8.g(exc, true);
            }
            if (ee0Var.o()) {
                ee0Var.t(false);
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        ee0 ee0Var = this.f52441a;
        fe0 fe0Var = ee0Var.f45255g0;
        if (ee0Var.W) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                fe0Var.f45713q0 = tL_help_termsOfService;
            }
            fe0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            fe0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            ee0Var.t(false);
        }
    }
}
