package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ve0 implements RequestDelegate {
    public final int f43557a;
    public final if0 f43558b;
    public final TLRPC.TL_auth_signIn f43559c;

    public ve0(if0 if0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f43557a = i10;
        this.f43558b = if0Var;
        this.f43559c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43557a) {
            case 0:
                final if0 if0Var = this.f43558b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f43559c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final if0 if0Var2 = if0Var;
                                int i14 = if0Var2.f39233b0;
                                fg0 fg0Var = if0Var2.f39249o0;
                                if0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    if0Var2.W = false;
                                    fg0Var.v1(false, true);
                                    if0Var2.w();
                                    if0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.f38167l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", if0Var2.d);
                                        bundle.putString("phoneHash", if0Var2.f39234c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        if0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        if0Var2.f39249o0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        if0Var2.f39249o0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        if0Var2.q(new x60(28, if0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    if0Var2.f39231a0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ve0(if0Var2, tL_auth_signIn2, 1), 10);
                                        if0Var2.w();
                                        if0Var2.v();
                                    } else {
                                        if0Var2.W = false;
                                        fg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = if0Var2.f39235c0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = if0Var2.f39235c0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = if0Var2.f39235c0) == 2 || i10 == 17 || i10 == 16)))) {
                                            if0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(if0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(if0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(if0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(29));
                                        }
                                        if0Var2.V = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    if0Var2.c(true);
                                                    fg0Var.u1(0, true, null, true);
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    fg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                if0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                sr srVar = if0Var2.f39239f;
                                                ur[] urVarArr = srVar.f42455f;
                                                if (i15 < urVarArr.length) {
                                                    urVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    srVar.f42454e = false;
                                                    urVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final if0 if0Var3 = if0Var;
                                if0Var3.W = false;
                                fg0 fg0Var2 = if0Var3.f39249o0;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.c5.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", if0Var3.d);
                                    bundle2.putString("phoneHash", if0Var3.f39234c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    if0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    if0Var3.f39249o0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    if0Var3.f39249o0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final if0 if0Var2 = this.f43558b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f43559c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final if0 if0Var22 = if0Var2;
                                int i14 = if0Var22.f39233b0;
                                fg0 fg0Var = if0Var22.f39249o0;
                                if0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    if0Var22.W = false;
                                    fg0Var.v1(false, true);
                                    if0Var22.w();
                                    if0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.f38167l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", if0Var22.d);
                                        bundle.putString("phoneHash", if0Var22.f39234c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        if0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        if0Var22.f39249o0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        if0Var22.f39249o0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        if0Var22.q(new x60(28, if0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    if0Var22.f39231a0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ve0(if0Var22, tL_auth_signIn22, 1), 10);
                                        if0Var22.w();
                                        if0Var22.v();
                                    } else {
                                        if0Var22.W = false;
                                        fg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = if0Var22.f39235c0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = if0Var22.f39235c0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = if0Var22.f39235c0) == 2 || i10 == 17 || i10 == 16)))) {
                                            if0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(if0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(if0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(if0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(29));
                                        }
                                        if0Var22.V = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    if0Var22.c(true);
                                                    fg0Var.u1(0, true, null, true);
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    fg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                if0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                sr srVar = if0Var22.f39239f;
                                                ur[] urVarArr = srVar.f42455f;
                                                if (i15 < urVarArr.length) {
                                                    urVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    srVar.f42454e = false;
                                                    urVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final if0 if0Var3 = if0Var2;
                                if0Var3.W = false;
                                fg0 fg0Var2 = if0Var3.f39249o0;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.c5.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", if0Var3.d);
                                    bundle2.putString("phoneHash", if0Var3.f39234c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    if0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    if0Var3.f39249o0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    if0Var3.f39249o0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
