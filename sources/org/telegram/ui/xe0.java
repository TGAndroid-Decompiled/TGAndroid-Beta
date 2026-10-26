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
public final class xe0 implements RequestDelegate {
    public final int f45746a;
    public final jf0 f45747b;
    public final TLRPC.TL_auth_signIn f45748c;

    public xe0(jf0 jf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f45746a = i10;
        this.f45747b = jf0Var;
        this.f45748c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45746a) {
            case 0:
                final jf0 jf0Var = this.f45747b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f45748c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final jf0 jf0Var2 = jf0Var;
                                int i14 = jf0Var2.f40604h0;
                                gg0 gg0Var = jf0Var2.f40619u0;
                                jf0Var2.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    jf0Var2.f40602f0 = false;
                                    gg0Var.A1(false, true);
                                    jf0Var2.v();
                                    jf0Var2.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gg0Var.f39670p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jf0Var2.d);
                                        bundle.putString("phoneHash", jf0Var2.f40597c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        jf0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        jf0Var2.f40619u0.z1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        jf0Var2.f40619u0.z1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        jf0Var2.p(new wb0(11, jf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    jf0Var2.f40603g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new xe0(jf0Var2, tL_auth_signIn2, 1), 10);
                                        jf0Var2.v();
                                        jf0Var2.t();
                                    } else {
                                        jf0Var2.f40602f0 = false;
                                        gg0Var.A1(false, true);
                                        if ((i14 == 3 && ((i12 = jf0Var2.f40605i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = jf0Var2.f40605i0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = jf0Var2.f40605i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            jf0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new u90(2));
                                        }
                                        jf0Var2.f40600e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    jf0Var2.c(true);
                                                    gg0Var.z1(0, true, null, true);
                                                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                jf0Var2.x();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                vr vrVar = jf0Var2.f40601f;
                                                xr[] xrVarArr = vrVar.f44897f;
                                                if (i15 < xrVarArr.length) {
                                                    xrVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    vrVar.e = false;
                                                    xrVarArr[0].requestFocus();
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
                                final jf0 jf0Var3 = jf0Var;
                                jf0Var3.f40602f0 = false;
                                gg0 gg0Var2 = jf0Var3.f40619u0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", jf0Var3.d);
                                    bundle2.putString("phoneHash", jf0Var3.f40597c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    jf0Var3.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    jf0Var3.f40619u0.z1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    jf0Var3.f40619u0.z1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final jf0 jf0Var2 = this.f45747b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f45748c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final jf0 jf0Var22 = jf0Var2;
                                int i14 = jf0Var22.f40604h0;
                                gg0 gg0Var = jf0Var22.f40619u0;
                                jf0Var22.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    jf0Var22.f40602f0 = false;
                                    gg0Var.A1(false, true);
                                    jf0Var22.v();
                                    jf0Var22.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gg0Var.f39670p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jf0Var22.d);
                                        bundle.putString("phoneHash", jf0Var22.f40597c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        jf0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        jf0Var22.f40619u0.z1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        jf0Var22.f40619u0.z1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        jf0Var22.p(new wb0(11, jf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    jf0Var22.f40603g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new xe0(jf0Var22, tL_auth_signIn22, 1), 10);
                                        jf0Var22.v();
                                        jf0Var22.t();
                                    } else {
                                        jf0Var22.f40602f0 = false;
                                        gg0Var.A1(false, true);
                                        if ((i14 == 3 && ((i12 = jf0Var22.f40605i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = jf0Var22.f40605i0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = jf0Var22.f40605i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            jf0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new u90(2));
                                        }
                                        jf0Var22.f40600e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    jf0Var22.c(true);
                                                    gg0Var.z1(0, true, null, true);
                                                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                jf0Var22.x();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                vr vrVar = jf0Var22.f40601f;
                                                xr[] xrVarArr = vrVar.f44897f;
                                                if (i15 < xrVarArr.length) {
                                                    xrVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    vrVar.e = false;
                                                    xrVarArr[0].requestFocus();
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
                                final jf0 jf0Var3 = jf0Var2;
                                jf0Var3.f40602f0 = false;
                                gg0 gg0Var2 = jf0Var3.f40619u0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", jf0Var3.d);
                                    bundle2.putString("phoneHash", jf0Var3.f40597c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    jf0Var3.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    jf0Var3.f40619u0.z1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    jf0Var3.f40619u0.z1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
