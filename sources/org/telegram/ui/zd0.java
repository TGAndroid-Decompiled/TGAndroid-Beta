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
    public final int f45117a;
    public final ge0 f45118b;
    public final TLRPC.TL_auth_signIn f45119c;

    public zd0(ge0 ge0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i9) {
        this.f45117a = i9;
        this.f45118b = ge0Var;
        this.f45119c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45117a) {
            case 0:
                final ge0 ge0Var = this.f45118b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f45119c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9;
                        switch (r5) {
                            case 0:
                                ge0 ge0Var2 = ge0Var;
                                int i10 = ge0Var2.f38518a;
                                fg.g gVar = ge0Var2.f38520c;
                                fg0 fg0Var = ge0Var2.T;
                                fg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    ge0Var2.N = false;
                                    fg0Var.v1(false, true);
                                    ge0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.f38275l0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ge0Var2.C);
                                        bundle.putString("phoneHash", ge0Var2.D);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        fg0Var.u1(5, true, bundle, false);
                                    } else {
                                        fg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i9).sendRequest(getpassword, new zd0(ge0Var2, tL_auth_signIn2, 1), 10);
                                    ge0Var2.r();
                                } else {
                                    ge0Var2.N = false;
                                    if (i10 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ge0Var2.c(true);
                                                fg0Var.u1(0, true, null, true);
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                fg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ge0Var2.s(false);
                                            gVar.post(new de0(ge0Var2, 0));
                                            return;
                                        }
                                        gVar.setText("");
                                        gVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i10 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                ge0 ge0Var3 = ge0Var;
                                ge0Var3.N = false;
                                fg0 fg0Var2 = ge0Var3.T;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.h0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ge0Var3.C);
                                    bundle2.putString("phoneHash", ge0Var3.D);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    fg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ge0 ge0Var2 = this.f45118b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f45119c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9;
                        switch (r5) {
                            case 0:
                                ge0 ge0Var22 = ge0Var2;
                                int i10 = ge0Var22.f38518a;
                                fg.g gVar = ge0Var22.f38520c;
                                fg0 fg0Var = ge0Var22.T;
                                fg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    ge0Var22.N = false;
                                    fg0Var.v1(false, true);
                                    ge0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fg0Var.f38275l0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ge0Var22.C);
                                        bundle.putString("phoneHash", ge0Var22.D);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        fg0Var.u1(5, true, bundle, false);
                                    } else {
                                        fg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i9).sendRequest(getpassword, new zd0(ge0Var22, tL_auth_signIn22, 1), 10);
                                    ge0Var22.r();
                                } else {
                                    ge0Var22.N = false;
                                    if (i10 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ge0Var22.c(true);
                                                fg0Var.u1(0, true, null, true);
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                fg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ge0Var22.s(false);
                                            gVar.post(new de0(ge0Var22, 0));
                                            return;
                                        }
                                        gVar.setText("");
                                        gVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i10 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                ge0 ge0Var3 = ge0Var2;
                                ge0Var3.N = false;
                                fg0 fg0Var2 = ge0Var3.T;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.h0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ge0Var3.C);
                                    bundle2.putString("phoneHash", ge0Var3.D);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    fg0Var2.u1(6, true, bundle2, false);
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
