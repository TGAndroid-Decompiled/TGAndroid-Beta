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
public final class rf0 implements RequestDelegate {
    public final int f39505a;
    public final dg0 f39506b;
    public final TLRPC.TL_auth_signIn f39507c;

    public rf0(dg0 dg0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f39505a = i10;
        this.f39506b = dg0Var;
        this.f39507c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39505a) {
            case 0:
                final dg0 dg0Var = this.f39506b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f39507c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final dg0 dg0Var2 = dg0Var;
                                int i14 = dg0Var2.f34995f0;
                                ah0 ah0Var = dg0Var2.f35010s0;
                                dg0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    dg0Var2.f34992d0 = false;
                                    ah0Var.v1(false, true);
                                    dg0Var2.w();
                                    dg0Var2.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ah0Var.f33924p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dg0Var2.d);
                                        bundle.putString("phoneHash", dg0Var2.f34990c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        dg0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        dg0Var2.f35010s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        dg0Var2.f35010s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        dg0Var2.q(new se0(6, dg0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    dg0Var2.f34993e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new rf0(dg0Var2, tL_auth_signIn2, 1), 10);
                                        dg0Var2.w();
                                        dg0Var2.u();
                                    } else {
                                        dg0Var2.f34992d0 = false;
                                        ah0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = dg0Var2.f34996g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = dg0Var2.f34996g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = dg0Var2.f34996g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            dg0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(dg0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(dg0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(dg0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(25));
                                        }
                                        dg0Var2.f34991c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    dg0Var2.c(true);
                                                    ah0Var.u1(0, true, null, true);
                                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                dg0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                hs hsVar = dg0Var2.f34994f;
                                                ks[] ksVarArr = hsVar.f36645f;
                                                if (i15 < ksVarArr.length) {
                                                    ksVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    hsVar.e = false;
                                                    ksVarArr[0].requestFocus();
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
                                final dg0 dg0Var3 = dg0Var;
                                dg0Var3.f34992d0 = false;
                                ah0 ah0Var2 = dg0Var3.f35010s0;
                                ah0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", dg0Var3.d);
                                    bundle2.putString("phoneHash", dg0Var3.f34990c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    dg0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    dg0Var3.f35010s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    dg0Var3.f35010s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final dg0 dg0Var2 = this.f39506b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f39507c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final dg0 dg0Var22 = dg0Var2;
                                int i14 = dg0Var22.f34995f0;
                                ah0 ah0Var = dg0Var22.f35010s0;
                                dg0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    dg0Var22.f34992d0 = false;
                                    ah0Var.v1(false, true);
                                    dg0Var22.w();
                                    dg0Var22.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ah0Var.f33924p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dg0Var22.d);
                                        bundle.putString("phoneHash", dg0Var22.f34990c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        dg0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        dg0Var22.f35010s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        dg0Var22.f35010s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        dg0Var22.q(new se0(6, dg0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    dg0Var22.f34993e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new rf0(dg0Var22, tL_auth_signIn22, 1), 10);
                                        dg0Var22.w();
                                        dg0Var22.u();
                                    } else {
                                        dg0Var22.f34992d0 = false;
                                        ah0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = dg0Var22.f34996g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = dg0Var22.f34996g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = dg0Var22.f34996g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            dg0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(dg0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(dg0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(dg0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(25));
                                        }
                                        dg0Var22.f34991c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    dg0Var22.c(true);
                                                    ah0Var.u1(0, true, null, true);
                                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                dg0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                hs hsVar = dg0Var22.f34994f;
                                                ks[] ksVarArr = hsVar.f36645f;
                                                if (i15 < ksVarArr.length) {
                                                    ksVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    hsVar.e = false;
                                                    ksVarArr[0].requestFocus();
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
                                final dg0 dg0Var3 = dg0Var2;
                                dg0Var3.f34992d0 = false;
                                ah0 ah0Var2 = dg0Var3.f35010s0;
                                ah0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", dg0Var3.d);
                                    bundle2.putString("phoneHash", dg0Var3.f34990c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    dg0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    dg0Var3.f35010s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    dg0Var3.f35010s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
