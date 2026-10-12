package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ve0 implements RequestDelegate {
    public final int f40972a;
    public final cf0 f40973b;
    public final TLRPC.TL_auth_signIn f40974c;

    public ve0(cf0 cf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f40972a = i10;
        this.f40973b = cf0Var;
        this.f40974c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40972a) {
            case 0:
                final cf0 cf0Var = this.f40973b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f40974c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                cf0 cf0Var2 = cf0Var;
                                int i11 = cf0Var2.f34925a;
                                di.g2 g2Var = cf0Var2.f34928c;
                                bh0 bh0Var = cf0Var2.f34926a0;
                                bh0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    cf0Var2.R = false;
                                    bh0Var.v1(false, true);
                                    cf0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            bh0Var.f34562p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", cf0Var2.G);
                                        bundle.putString("phoneHash", cf0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        bh0Var.u1(5, true, bundle, false);
                                    } else {
                                        bh0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ve0(cf0Var2, tL_auth_signIn2, 1), 10);
                                    cf0Var2.r();
                                } else {
                                    cf0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                cf0Var2.c(true);
                                                bh0Var.u1(0, true, null, true);
                                                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                bh0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            cf0Var2.s(false);
                                            g2Var.post(new ze0(cf0Var2, 0));
                                            return;
                                        }
                                        g2Var.setText("");
                                        g2Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                cf0 cf0Var3 = cf0Var;
                                cf0Var3.R = false;
                                bh0 bh0Var2 = cf0Var3.f34926a0;
                                bh0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", cf0Var3.G);
                                    bundle2.putString("phoneHash", cf0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    bh0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final cf0 cf0Var2 = this.f40973b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f40974c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                cf0 cf0Var22 = cf0Var2;
                                int i11 = cf0Var22.f34925a;
                                di.g2 g2Var = cf0Var22.f34928c;
                                bh0 bh0Var = cf0Var22.f34926a0;
                                bh0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    cf0Var22.R = false;
                                    bh0Var.v1(false, true);
                                    cf0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            bh0Var.f34562p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", cf0Var22.G);
                                        bundle.putString("phoneHash", cf0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        bh0Var.u1(5, true, bundle, false);
                                    } else {
                                        bh0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ve0(cf0Var22, tL_auth_signIn22, 1), 10);
                                    cf0Var22.r();
                                } else {
                                    cf0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                cf0Var22.c(true);
                                                bh0Var.u1(0, true, null, true);
                                                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                bh0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            cf0Var22.s(false);
                                            g2Var.post(new ze0(cf0Var22, 0));
                                            return;
                                        }
                                        g2Var.setText("");
                                        g2Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                cf0 cf0Var3 = cf0Var2;
                                cf0Var3.R = false;
                                bh0 bh0Var2 = cf0Var3.f34926a0;
                                bh0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(bh0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", cf0Var3.G);
                                    bundle2.putString("phoneHash", cf0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    bh0Var2.u1(6, true, bundle2, false);
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
