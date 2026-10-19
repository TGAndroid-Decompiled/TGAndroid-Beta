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
public final class te0 implements RequestDelegate {
    public final int f41650a;
    public final gf0 f41651b;
    public final TLRPC.TL_auth_signIn f41652c;

    public te0(gf0 gf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f41650a = i10;
        this.f41651b = gf0Var;
        this.f41652c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41650a) {
            case 0:
                final gf0 gf0Var = this.f41651b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f41652c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final gf0 gf0Var2 = gf0Var;
                                int i14 = gf0Var2.f37320f0;
                                cg0 cg0Var = gf0Var2.f37335s0;
                                gf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    gf0Var2.f37317d0 = false;
                                    cg0Var.v1(false, true);
                                    gf0Var2.w();
                                    gf0Var2.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            cg0Var.f35983p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gf0Var2.d);
                                        bundle.putString("phoneHash", gf0Var2.f37315c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        gf0Var2.f37335s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        gf0Var2.f37335s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        gf0Var2.q(new z70(24, gf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    gf0Var2.f37318e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new te0(gf0Var2, tL_auth_signIn2, 1), 10);
                                        gf0Var2.w();
                                        gf0Var2.u();
                                    } else {
                                        gf0Var2.f37317d0 = false;
                                        cg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = gf0Var2.f37321g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = gf0Var2.f37321g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = gf0Var2.f37321g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            gf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(gf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(gf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(gf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sc(28));
                                        }
                                        gf0Var2.f37316c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    gf0Var2.c(true);
                                                    cg0Var.u1(0, true, null, true);
                                                    cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                gf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                qr qrVar = gf0Var2.f37319f;
                                                tr[] trVarArr = qrVar.f40961f;
                                                if (i15 < trVarArr.length) {
                                                    trVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    qrVar.e = false;
                                                    trVarArr[0].requestFocus();
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
                                final gf0 gf0Var3 = gf0Var;
                                gf0Var3.f37317d0 = false;
                                cg0 cg0Var2 = gf0Var3.f37335s0;
                                cg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(cg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gf0Var3.d);
                                    bundle2.putString("phoneHash", gf0Var3.f37315c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    gf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    gf0Var3.f37335s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    gf0Var3.f37335s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final gf0 gf0Var2 = this.f41651b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f41652c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final gf0 gf0Var22 = gf0Var2;
                                int i14 = gf0Var22.f37320f0;
                                cg0 cg0Var = gf0Var22.f37335s0;
                                gf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    gf0Var22.f37317d0 = false;
                                    cg0Var.v1(false, true);
                                    gf0Var22.w();
                                    gf0Var22.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            cg0Var.f35983p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gf0Var22.d);
                                        bundle.putString("phoneHash", gf0Var22.f37315c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        gf0Var22.f37335s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        gf0Var22.f37335s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        gf0Var22.q(new z70(24, gf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    gf0Var22.f37318e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.n2) cg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new te0(gf0Var22, tL_auth_signIn22, 1), 10);
                                        gf0Var22.w();
                                        gf0Var22.u();
                                    } else {
                                        gf0Var22.f37317d0 = false;
                                        cg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = gf0Var22.f37321g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = gf0Var22.f37321g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = gf0Var22.f37321g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            gf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(gf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(gf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(gf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sc(28));
                                        }
                                        gf0Var22.f37316c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    gf0Var22.c(true);
                                                    cg0Var.u1(0, true, null, true);
                                                    cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                gf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                qr qrVar = gf0Var22.f37319f;
                                                tr[] trVarArr = qrVar.f40961f;
                                                if (i15 < trVarArr.length) {
                                                    trVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    qrVar.e = false;
                                                    trVarArr[0].requestFocus();
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
                                final gf0 gf0Var3 = gf0Var2;
                                gf0Var3.f37317d0 = false;
                                cg0 cg0Var2 = gf0Var3.f37335s0;
                                cg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(cg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gf0Var3.d);
                                    bundle2.putString("phoneHash", gf0Var3.f37315c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    gf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    gf0Var3.f37335s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    gf0Var3.f37335s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
