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
public final class we0 implements RequestDelegate {
    public final int f43737a;
    public final jf0 f43738b;
    public final TLRPC.TL_auth_signIn f43739c;

    public we0(jf0 jf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i9) {
        this.f43737a = i9;
        this.f43738b = jf0Var;
        this.f43739c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43737a) {
            case 0:
                final jf0 jf0Var = this.f43738b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f43739c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9;
                        int i10;
                        int i11;
                        int i12;
                        switch (r5) {
                            case 0:
                                final jf0 jf0Var2 = jf0Var;
                                int i13 = jf0Var2.f39472b0;
                                fg0 fg0Var = jf0Var2.f39488o0;
                                jf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    jf0Var2.W = false;
                                    fg0Var.v1(false, true);
                                    jf0Var2.w();
                                    jf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.f38275l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jf0Var2.d);
                                        bundle.putString("phoneHash", jf0Var2.f39473c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        jf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        jf0Var2.f39488o0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        jf0Var2.f39488o0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        jf0Var2.q(new cf0(1, jf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    jf0Var2.f39470a0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new we0(jf0Var2, tL_auth_signIn2, 1), 10);
                                        jf0Var2.w();
                                        jf0Var2.v();
                                    } else {
                                        jf0Var2.W = false;
                                        fg0Var.v1(false, true);
                                        if ((i13 == 3 && ((i11 = jf0Var2.f39474c0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i13 == 2 && ((i10 = jf0Var2.f39474c0) == 4 || i10 == 3)) || (i13 == 4 && ((i9 = jf0Var2.f39474c0) == 2 || i9 == 17 || i9 == 16)))) {
                                            jf0Var2.t();
                                        }
                                        if (i13 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i13 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i13 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(27));
                                        }
                                        jf0Var2.V = true;
                                        if (i13 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    jf0Var2.c(true);
                                                    fg0Var.u1(0, true, null, true);
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    fg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                jf0Var2.y();
                                                return;
                                            }
                                            int i14 = 0;
                                            while (true) {
                                                sr srVar = jf0Var2.f39478f;
                                                vr[] vrVarArr = srVar.f42755f;
                                                if (i14 < vrVarArr.length) {
                                                    vrVarArr[i14].setText("");
                                                    i14++;
                                                } else {
                                                    srVar.f42754e = false;
                                                    vrVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i13 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final jf0 jf0Var3 = jf0Var;
                                jf0Var3.W = false;
                                fg0 fg0Var2 = jf0Var3.f39488o0;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.h0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", jf0Var3.d);
                                    bundle2.putString("phoneHash", jf0Var3.f39473c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    jf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    jf0Var3.f39488o0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    jf0Var3.f39488o0.u1(6, true, bundle2, false);
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
                final jf0 jf0Var2 = this.f43738b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f43739c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9;
                        int i10;
                        int i11;
                        int i12;
                        switch (r5) {
                            case 0:
                                final jf0 jf0Var22 = jf0Var2;
                                int i13 = jf0Var22.f39472b0;
                                fg0 fg0Var = jf0Var22.f39488o0;
                                jf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    jf0Var22.W = false;
                                    fg0Var.v1(false, true);
                                    jf0Var22.w();
                                    jf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.f38275l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", jf0Var22.d);
                                        bundle.putString("phoneHash", jf0Var22.f39473c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        jf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        jf0Var22.f39488o0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        jf0Var22.f39488o0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        jf0Var22.q(new cf0(1, jf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    jf0Var22.f39470a0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new we0(jf0Var22, tL_auth_signIn22, 1), 10);
                                        jf0Var22.w();
                                        jf0Var22.v();
                                    } else {
                                        jf0Var22.W = false;
                                        fg0Var.v1(false, true);
                                        if ((i13 == 3 && ((i11 = jf0Var22.f39474c0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i13 == 2 && ((i10 = jf0Var22.f39474c0) == 4 || i10 == 3)) || (i13 == 4 && ((i9 = jf0Var22.f39474c0) == 2 || i9 == 17 || i9 == 16)))) {
                                            jf0Var22.t();
                                        }
                                        if (i13 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i13 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i13 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(jf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(27));
                                        }
                                        jf0Var22.V = true;
                                        if (i13 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    jf0Var22.c(true);
                                                    fg0Var.u1(0, true, null, true);
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    fg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                jf0Var22.y();
                                                return;
                                            }
                                            int i14 = 0;
                                            while (true) {
                                                sr srVar = jf0Var22.f39478f;
                                                vr[] vrVarArr = srVar.f42755f;
                                                if (i14 < vrVarArr.length) {
                                                    vrVarArr[i14].setText("");
                                                    i14++;
                                                } else {
                                                    srVar.f42754e = false;
                                                    vrVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i13 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final jf0 jf0Var3 = jf0Var2;
                                jf0Var3.W = false;
                                fg0 fg0Var2 = jf0Var3.f39488o0;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.h0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", jf0Var3.d);
                                    bundle2.putString("phoneHash", jf0Var3.f39473c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    jf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    jf0Var3.f39488o0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    jf0Var3.f39488o0.u1(6, true, bundle2, false);
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
