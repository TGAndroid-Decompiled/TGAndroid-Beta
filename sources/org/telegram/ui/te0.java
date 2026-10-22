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
    public final int f41658a;
    public final hf0 f41659b;
    public final TLRPC.TL_auth_signIn f41660c;

    public te0(hf0 hf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f41658a = i10;
        this.f41659b = hf0Var;
        this.f41660c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41658a) {
            case 0:
                final hf0 hf0Var = this.f41659b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f41660c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final hf0 hf0Var2 = hf0Var;
                                int i14 = hf0Var2.f37605f0;
                                dg0 dg0Var = hf0Var2.f37620s0;
                                hf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    hf0Var2.f37602d0 = false;
                                    dg0Var.v1(false, true);
                                    hf0Var2.w();
                                    hf0Var2.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            dg0Var.f36389p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hf0Var2.d);
                                        bundle.putString("phoneHash", hf0Var2.f37600c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        hf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        hf0Var2.f37620s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        hf0Var2.f37620s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        hf0Var2.q(new z70(24, hf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    hf0Var2.f37603e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new te0(hf0Var2, tL_auth_signIn2, 1), 10);
                                        hf0Var2.w();
                                        hf0Var2.u();
                                    } else {
                                        hf0Var2.f37602d0 = false;
                                        dg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = hf0Var2.f37606g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = hf0Var2.f37606g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = hf0Var2.f37606g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            hf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(hf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(hf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(hf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(29));
                                        }
                                        hf0Var2.f37601c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    hf0Var2.c(true);
                                                    dg0Var.u1(0, true, null, true);
                                                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                hf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                qr qrVar = hf0Var2.f37604f;
                                                tr[] trVarArr = qrVar.f40962f;
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
                                final hf0 hf0Var3 = hf0Var;
                                hf0Var3.f37602d0 = false;
                                dg0 dg0Var2 = hf0Var3.f37620s0;
                                dg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", hf0Var3.d);
                                    bundle2.putString("phoneHash", hf0Var3.f37600c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    hf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    hf0Var3.f37620s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    hf0Var3.f37620s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final hf0 hf0Var2 = this.f41659b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f41660c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final hf0 hf0Var22 = hf0Var2;
                                int i14 = hf0Var22.f37605f0;
                                dg0 dg0Var = hf0Var22.f37620s0;
                                hf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    hf0Var22.f37602d0 = false;
                                    dg0Var.v1(false, true);
                                    hf0Var22.w();
                                    hf0Var22.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            dg0Var.f36389p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hf0Var22.d);
                                        bundle.putString("phoneHash", hf0Var22.f37600c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        hf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        hf0Var22.f37620s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        hf0Var22.f37620s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        hf0Var22.q(new z70(24, hf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    hf0Var22.f37603e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new te0(hf0Var22, tL_auth_signIn22, 1), 10);
                                        hf0Var22.w();
                                        hf0Var22.u();
                                    } else {
                                        hf0Var22.f37602d0 = false;
                                        dg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = hf0Var22.f37606g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = hf0Var22.f37606g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = hf0Var22.f37606g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            hf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(hf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(hf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(hf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(29));
                                        }
                                        hf0Var22.f37601c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    hf0Var22.c(true);
                                                    dg0Var.u1(0, true, null, true);
                                                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                hf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                qr qrVar = hf0Var22.f37604f;
                                                tr[] trVarArr = qrVar.f40962f;
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
                                final hf0 hf0Var3 = hf0Var2;
                                hf0Var3.f37602d0 = false;
                                dg0 dg0Var2 = hf0Var3.f37620s0;
                                dg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", hf0Var3.d);
                                    bundle2.putString("phoneHash", hf0Var3.f37600c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    hf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    hf0Var3.f37620s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    hf0Var3.f37620s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
