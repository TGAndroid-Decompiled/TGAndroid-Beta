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
public final class yd0 implements RequestDelegate {
    public final int f43376a;
    public final fe0 f43377b;
    public final TLRPC.TL_auth_signIn f43378c;

    public yd0(fe0 fe0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f43376a = i10;
        this.f43377b = fe0Var;
        this.f43378c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43376a) {
            case 0:
                final fe0 fe0Var = this.f43377b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f43378c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                fe0 fe0Var2 = fe0Var;
                                int i11 = fe0Var2.f36887a;
                                ei.e2 e2Var = fe0Var2.f36890c;
                                eg0 eg0Var = fe0Var2.f36888a0;
                                eg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    fe0Var2.R = false;
                                    eg0Var.v1(false, true);
                                    fe0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            eg0Var.f36508p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", fe0Var2.G);
                                        bundle.putString("phoneHash", fe0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        eg0Var.u1(5, true, bundle, false);
                                    } else {
                                        eg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new yd0(fe0Var2, tL_auth_signIn2, 1), 10);
                                    fe0Var2.r();
                                } else {
                                    fe0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                fe0Var2.c(true);
                                                eg0Var.u1(0, true, null, true);
                                                eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                eg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            fe0Var2.s(false);
                                            e2Var.post(new ce0(fe0Var2, 0));
                                            return;
                                        }
                                        e2Var.setText("");
                                        e2Var.requestFocus();
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
                                fe0 fe0Var3 = fe0Var;
                                fe0Var3.R = false;
                                eg0 eg0Var2 = fe0Var3.f36888a0;
                                eg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(eg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", fe0Var3.G);
                                    bundle2.putString("phoneHash", fe0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    eg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final fe0 fe0Var2 = this.f43377b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f43378c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                fe0 fe0Var22 = fe0Var2;
                                int i11 = fe0Var22.f36887a;
                                ei.e2 e2Var = fe0Var22.f36890c;
                                eg0 eg0Var = fe0Var22.f36888a0;
                                eg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    fe0Var22.R = false;
                                    eg0Var.v1(false, true);
                                    fe0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            eg0Var.f36508p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", fe0Var22.G);
                                        bundle.putString("phoneHash", fe0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        eg0Var.u1(5, true, bundle, false);
                                    } else {
                                        eg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new yd0(fe0Var22, tL_auth_signIn22, 1), 10);
                                    fe0Var22.r();
                                } else {
                                    fe0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                fe0Var22.c(true);
                                                eg0Var.u1(0, true, null, true);
                                                eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                eg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                eg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            fe0Var22.s(false);
                                            e2Var.post(new ce0(fe0Var22, 0));
                                            return;
                                        }
                                        e2Var.setText("");
                                        e2Var.requestFocus();
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
                                fe0 fe0Var3 = fe0Var2;
                                fe0Var3.R = false;
                                eg0 eg0Var2 = fe0Var3.f36888a0;
                                eg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(eg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", fe0Var3.G);
                                    bundle2.putString("phoneHash", fe0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    eg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                eg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
