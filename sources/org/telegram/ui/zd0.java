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
public final class zd0 implements RequestDelegate {
    public final int f46267a;
    public final ge0 f46268b;
    public final TLRPC.TL_auth_signIn f46269c;

    public zd0(ge0 ge0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f46267a = i10;
        this.f46268b = ge0Var;
        this.f46269c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46267a) {
            case 0:
                final ge0 ge0Var = this.f46268b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f46269c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ge0 ge0Var2 = ge0Var;
                                int i11 = ge0Var2.f39627a;
                                fi.c2 c2Var = ge0Var2.f39630c;
                                gg0 gg0Var = ge0Var2.f39628a0;
                                gg0Var.p1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    ge0Var2.R = false;
                                    gg0Var.A1(false, true);
                                    ge0Var2.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gg0Var.f39670p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ge0Var2.G);
                                        bundle.putString("phoneHash", ge0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gg0Var.z1(5, true, bundle, false);
                                    } else {
                                        gg0Var.t1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zd0(ge0Var2, tL_auth_signIn2, 1), 10);
                                    ge0Var2.q();
                                } else {
                                    ge0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ge0Var2.c(true);
                                                gg0Var.z1(0, true, null, true);
                                                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                gg0Var.q1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ge0Var2.r(false);
                                            c2Var.post(new de0(ge0Var2, 0));
                                            return;
                                        }
                                        c2Var.setText("");
                                        c2Var.requestFocus();
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
                                ge0 ge0Var3 = ge0Var;
                                ge0Var3.R = false;
                                gg0 gg0Var2 = ge0Var3.f39628a0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ge0Var3.G);
                                    bundle2.putString("phoneHash", ge0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    gg0Var2.z1(6, true, bundle2, false);
                                    return;
                                }
                                gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ge0 ge0Var2 = this.f46268b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f46269c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ge0 ge0Var22 = ge0Var2;
                                int i11 = ge0Var22.f39627a;
                                fi.c2 c2Var = ge0Var22.f39630c;
                                gg0 gg0Var = ge0Var22.f39628a0;
                                gg0Var.p1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    ge0Var22.R = false;
                                    gg0Var.A1(false, true);
                                    ge0Var22.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gg0Var.f39670p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ge0Var22.G);
                                        bundle.putString("phoneHash", ge0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gg0Var.z1(5, true, bundle, false);
                                    } else {
                                        gg0Var.t1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zd0(ge0Var22, tL_auth_signIn22, 1), 10);
                                    ge0Var22.q();
                                } else {
                                    ge0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ge0Var22.c(true);
                                                gg0Var.z1(0, true, null, true);
                                                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                gg0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                gg0Var.q1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ge0Var22.r(false);
                                            c2Var.post(new de0(ge0Var22, 0));
                                            return;
                                        }
                                        c2Var.setText("");
                                        c2Var.requestFocus();
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
                                ge0 ge0Var3 = ge0Var2;
                                ge0Var3.R = false;
                                gg0 gg0Var2 = ge0Var3.f39628a0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ge0Var3.G);
                                    bundle2.putString("phoneHash", ge0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    gg0Var2.z1(6, true, bundle2, false);
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
