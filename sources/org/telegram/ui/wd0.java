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
public final class wd0 implements RequestDelegate {
    public final int f42544a;
    public final de0 f42545b;
    public final TLRPC.TL_auth_signIn f42546c;

    public wd0(de0 de0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f42544a = i10;
        this.f42545b = de0Var;
        this.f42546c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42544a) {
            case 0:
                final de0 de0Var = this.f42545b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f42546c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                de0 de0Var2 = de0Var;
                                int i11 = de0Var2.f36348a;
                                ei.e2 e2Var = de0Var2.f36351c;
                                dg0 dg0Var = de0Var2.f36349a0;
                                dg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    de0Var2.R = false;
                                    dg0Var.v1(false, true);
                                    de0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            dg0Var.f36390p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", de0Var2.G);
                                        bundle.putString("phoneHash", de0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        dg0Var.u1(5, true, bundle, false);
                                    } else {
                                        dg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wd0(de0Var2, tL_auth_signIn2, 1), 10);
                                    de0Var2.r();
                                } else {
                                    de0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                de0Var2.c(true);
                                                dg0Var.u1(0, true, null, true);
                                                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                dg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            de0Var2.s(false);
                                            e2Var.post(new ae0(de0Var2, 0));
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
                                de0 de0Var3 = de0Var;
                                de0Var3.R = false;
                                dg0 dg0Var2 = de0Var3.f36349a0;
                                dg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", de0Var3.G);
                                    bundle2.putString("phoneHash", de0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    dg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final de0 de0Var2 = this.f42545b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f42546c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                de0 de0Var22 = de0Var2;
                                int i11 = de0Var22.f36348a;
                                ei.e2 e2Var = de0Var22.f36351c;
                                dg0 dg0Var = de0Var22.f36349a0;
                                dg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    de0Var22.R = false;
                                    dg0Var.v1(false, true);
                                    de0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            dg0Var.f36390p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", de0Var22.G);
                                        bundle.putString("phoneHash", de0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        dg0Var.u1(5, true, bundle, false);
                                    } else {
                                        dg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wd0(de0Var22, tL_auth_signIn22, 1), 10);
                                    de0Var22.r();
                                } else {
                                    de0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                de0Var22.c(true);
                                                dg0Var.u1(0, true, null, true);
                                                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                dg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            de0Var22.s(false);
                                            e2Var.post(new ae0(de0Var22, 0));
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
                                de0 de0Var3 = de0Var2;
                                de0Var3.R = false;
                                dg0 dg0Var2 = de0Var3.f36349a0;
                                dg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", de0Var3.G);
                                    bundle2.putString("phoneHash", de0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    dg0Var2.u1(6, true, bundle2, false);
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
