package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rb0 implements Runnable {
    public final int f49398a = 1;
    public final wb0 f49399b;
    public final TLRPC.TL_error f49400c;
    public final String d;
    public final String f49401e;
    public final TLObject f49402f;

    public rb0(wb0 wb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f49399b = wb0Var;
        this.f49400c = tL_error;
        this.d = str;
        this.f49401e = str2;
        this.f49402f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i7;
        int i10 = this.f49398a;
        TLObject tLObject = this.f49402f;
        String str = this.f49401e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f49400c;
        wb0 wb0Var = this.f49399b;
        switch (i10) {
            case 0:
                wb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    wb0Var.f51021s = password;
                    TwoStepVerificationActivity.r0(password);
                    wb0Var.n(str2, str);
                    return;
                }
                return;
            default:
                ee0 ee0Var = wb0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new ub0(wb0Var, str2, str, 1), 8);
                    return;
                }
                ee0Var.C1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new ru(19, wb0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    if (isEmpty) {
                        u1Var.T = org.telegram.messenger.id.M0(2131742799, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131742804, null);
                    }
                    u1Var.R = org.telegram.messenger.id.M0(2131743931, null);
                    Dialog showDialog = ee0Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    wb0Var.f51023x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                        return;
                    }
                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public rb0(wb0 wb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f49399b = wb0Var;
        this.f49400c = tL_error;
        this.f49402f = tLObject;
        this.d = str;
        this.f49401e = str2;
    }
}
