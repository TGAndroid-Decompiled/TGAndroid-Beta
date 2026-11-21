package org.telegram.ui;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xd0 implements ts, OnSuccessListener, OnFailureListener {
    public final ce0 f53860a;

    public xd0(ce0 ce0Var) {
        this.f53860a = ce0Var;
    }

    @Override
    public void b(ps psVar) {
        ce0 ce0Var = this.f53860a;
        ce0Var.L = true;
        String str = psVar.f50967c;
        ce0Var.f46527a.setText(str);
        ce0Var.u(str, psVar);
        ce0Var.G = psVar;
        ce0Var.F = 0;
        ce0Var.L = false;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putString("phone_code_last_matched_" + psVar.f50967c, psVar.d).apply();
        org.telegram.messenger.g0.h3(new rd0(ce0Var, 4), 300L);
        ae0 ae0Var = ce0Var.f46529b;
        ae0Var.requestFocus();
        ae0Var.setSelection(ae0Var.length());
    }

    @Override
    public void onFailure(Exception exc) {
        int i7;
        ce0 ce0Var = this.f53860a;
        de0 de0Var = ce0Var.f46539h0;
        if (!ce0Var.f46528a0) {
            if (exc instanceof ConnectionsManager.RequestException) {
                String message = exc.getMessage();
                if (message != null && message.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new wd0(ce0Var, 1), 10);
                    return;
                } else if (message != null) {
                    boolean z10 = org.telegram.messenger.s2.f26749a;
                    new org.telegram.ui.Components.lc(de0Var.f46924a0, null).f0(message, false);
                }
            } else if (!(exc instanceof CancellationException)) {
                org.telegram.messenger.a8.g(exc, true);
            }
            if (ce0Var.o()) {
                ce0Var.t(false);
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        ce0 ce0Var = this.f53860a;
        de0 de0Var = ce0Var.f46539h0;
        if (ce0Var.f46528a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                de0Var.f46948s0 = tL_help_termsOfService;
            }
            de0Var.M1(5, true, a8.p0.k("fromFirebasePhoneNumberVerification", true), false);
        } else if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            de0Var.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            ce0Var.t(false);
        }
    }
}
