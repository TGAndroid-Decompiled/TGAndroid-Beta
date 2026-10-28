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
public final class ze0 implements RequestDelegate {
    public final int f46240a;
    public final lf0 f46241b;
    public final TLRPC.TL_auth_signIn f46242c;

    public ze0(lf0 lf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f46240a = i10;
        this.f46241b = lf0Var;
        this.f46242c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46240a) {
            case 0:
                final lf0 lf0Var = this.f46241b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f46242c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final lf0 lf0Var2 = lf0Var;
                                int i14 = lf0Var2.f41119h0;
                                ig0 ig0Var = lf0Var2.f41134u0;
                                lf0Var2.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    lf0Var2.f41117f0 = false;
                                    ig0Var.A1(false, true);
                                    lf0Var2.v();
                                    lf0Var2.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f40160q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", lf0Var2.d);
                                        bundle.putString("phoneHash", lf0Var2.f41112c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        lf0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        lf0Var2.f41134u0.z1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        lf0Var2.f41134u0.z1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        lf0Var2.p(new kb0(12, lf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    lf0Var2.f41118g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ze0(lf0Var2, tL_auth_signIn2, 1), 10);
                                        lf0Var2.v();
                                        lf0Var2.t();
                                    } else {
                                        lf0Var2.f41117f0 = false;
                                        ig0Var.A1(false, true);
                                        if ((i14 == 3 && ((i12 = lf0Var2.f41120i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = lf0Var2.f41120i0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = lf0Var2.f41120i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            lf0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new w90(2));
                                        }
                                        lf0Var2.f41115e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    lf0Var2.c(true);
                                                    ig0Var.z1(0, true, null, true);
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                lf0Var2.x();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                xr xrVar = lf0Var2.f41116f;
                                                zr[] zrVarArr = xrVar.f45772f;
                                                if (i15 < zrVarArr.length) {
                                                    zrVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    xrVar.e = false;
                                                    zrVarArr[0].requestFocus();
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
                                final lf0 lf0Var3 = lf0Var;
                                lf0Var3.f41117f0 = false;
                                ig0 ig0Var2 = lf0Var3.f41134u0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", lf0Var3.d);
                                    bundle2.putString("phoneHash", lf0Var3.f41112c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    lf0Var3.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    lf0Var3.f41134u0.z1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    lf0Var3.f41134u0.z1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final lf0 lf0Var2 = this.f46241b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f46242c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final lf0 lf0Var22 = lf0Var2;
                                int i14 = lf0Var22.f41119h0;
                                ig0 ig0Var = lf0Var22.f41134u0;
                                lf0Var22.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    lf0Var22.f41117f0 = false;
                                    ig0Var.A1(false, true);
                                    lf0Var22.v();
                                    lf0Var22.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f40160q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", lf0Var22.d);
                                        bundle.putString("phoneHash", lf0Var22.f41112c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        lf0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        lf0Var22.f41134u0.z1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        lf0Var22.f41134u0.z1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        lf0Var22.p(new kb0(12, lf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    lf0Var22.f41118g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ze0(lf0Var22, tL_auth_signIn22, 1), 10);
                                        lf0Var22.v();
                                        lf0Var22.t();
                                    } else {
                                        lf0Var22.f41117f0 = false;
                                        ig0Var.A1(false, true);
                                        if ((i14 == 3 && ((i12 = lf0Var22.f41120i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = lf0Var22.f41120i0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = lf0Var22.f41120i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            lf0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(lf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new w90(2));
                                        }
                                        lf0Var22.f41115e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    lf0Var22.c(true);
                                                    ig0Var.z1(0, true, null, true);
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                lf0Var22.x();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                xr xrVar = lf0Var22.f41116f;
                                                zr[] zrVarArr = xrVar.f45772f;
                                                if (i15 < zrVarArr.length) {
                                                    zrVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    xrVar.e = false;
                                                    zrVarArr[0].requestFocus();
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
                                final lf0 lf0Var3 = lf0Var2;
                                lf0Var3.f41117f0 = false;
                                ig0 ig0Var2 = lf0Var3.f41134u0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", lf0Var3.d);
                                    bundle2.putString("phoneHash", lf0Var3.f41112c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    lf0Var3.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    lf0Var3.f41134u0.z1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    lf0Var3.f41134u0.z1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
