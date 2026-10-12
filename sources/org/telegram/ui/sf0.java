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
public final class sf0 implements RequestDelegate {
    public final int f40126a;
    public final eg0 f40127b;
    public final TLRPC.TL_auth_signIn f40128c;

    public sf0(eg0 eg0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f40126a = i10;
        this.f40127b = eg0Var;
        this.f40128c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40126a) {
            case 0:
                final eg0 eg0Var = this.f40127b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f40128c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final eg0 eg0Var2 = eg0Var;
                                int i14 = eg0Var2.f35551f0;
                                bh0 bh0Var = eg0Var2.f35566s0;
                                eg0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    eg0Var2.f35548d0 = false;
                                    bh0Var.v1(false, true);
                                    eg0Var2.w();
                                    eg0Var2.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            bh0Var.f34562p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", eg0Var2.d);
                                        bundle.putString("phoneHash", eg0Var2.f35546c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        eg0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        eg0Var2.f35566s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        eg0Var2.f35566s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        eg0Var2.q(new wc0(11, eg0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    eg0Var2.f35549e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new sf0(eg0Var2, tL_auth_signIn2, 1), 10);
                                        eg0Var2.w();
                                        eg0Var2.u();
                                    } else {
                                        eg0Var2.f35548d0 = false;
                                        bh0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = eg0Var2.f35552g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = eg0Var2.f35552g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = eg0Var2.f35552g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            eg0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(eg0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(eg0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(eg0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(25));
                                        }
                                        eg0Var2.f35547c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    eg0Var2.c(true);
                                                    bh0Var.u1(0, true, null, true);
                                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                eg0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                hs hsVar = eg0Var2.f35550f;
                                                ks[] ksVarArr = hsVar.f36949f;
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
                                final eg0 eg0Var3 = eg0Var;
                                eg0Var3.f35548d0 = false;
                                bh0 bh0Var2 = eg0Var3.f35566s0;
                                bh0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", eg0Var3.d);
                                    bundle2.putString("phoneHash", eg0Var3.f35546c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    eg0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    eg0Var3.f35566s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    eg0Var3.f35566s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final eg0 eg0Var2 = this.f40127b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f40128c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final eg0 eg0Var22 = eg0Var2;
                                int i14 = eg0Var22.f35551f0;
                                bh0 bh0Var = eg0Var22.f35566s0;
                                eg0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    eg0Var22.f35548d0 = false;
                                    bh0Var.v1(false, true);
                                    eg0Var22.w();
                                    eg0Var22.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            bh0Var.f34562p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", eg0Var22.d);
                                        bundle.putString("phoneHash", eg0Var22.f35546c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        eg0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        eg0Var22.f35566s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        eg0Var22.f35566s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        eg0Var22.q(new wc0(11, eg0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    eg0Var22.f35549e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new sf0(eg0Var22, tL_auth_signIn22, 1), 10);
                                        eg0Var22.w();
                                        eg0Var22.u();
                                    } else {
                                        eg0Var22.f35548d0 = false;
                                        bh0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = eg0Var22.f35552g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = eg0Var22.f35552g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = eg0Var22.f35552g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            eg0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(eg0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(eg0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(eg0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(25));
                                        }
                                        eg0Var22.f35547c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    eg0Var22.c(true);
                                                    bh0Var.u1(0, true, null, true);
                                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                eg0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                hs hsVar = eg0Var22.f35550f;
                                                ks[] ksVarArr = hsVar.f36949f;
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
                                final eg0 eg0Var3 = eg0Var2;
                                eg0Var3.f35548d0 = false;
                                bh0 bh0Var2 = eg0Var3.f35566s0;
                                bh0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", eg0Var3.d);
                                    bundle2.putString("phoneHash", eg0Var3.f35546c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    eg0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    eg0Var3.f35566s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    eg0Var3.f35566s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
