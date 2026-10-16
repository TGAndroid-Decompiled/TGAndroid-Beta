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
public final class ue0 implements RequestDelegate {
    public final int f40381a;
    public final bf0 f40382b;
    public final TLRPC.TL_auth_signIn f40383c;

    public ue0(bf0 bf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f40381a = i10;
        this.f40382b = bf0Var;
        this.f40383c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40381a) {
            case 0:
                final bf0 bf0Var = this.f40382b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f40383c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                bf0 bf0Var2 = bf0Var;
                                int i11 = bf0Var2.f34311a;
                                di.g2 g2Var = bf0Var2.f34314c;
                                ah0 ah0Var = bf0Var2.f34312a0;
                                ah0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    bf0Var2.R = false;
                                    ah0Var.v1(false, true);
                                    bf0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ah0Var.f33924p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", bf0Var2.G);
                                        bundle.putString("phoneHash", bf0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ah0Var.u1(5, true, bundle, false);
                                    } else {
                                        ah0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ue0(bf0Var2, tL_auth_signIn2, 1), 10);
                                    bf0Var2.r();
                                } else {
                                    bf0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                bf0Var2.c(true);
                                                ah0Var.u1(0, true, null, true);
                                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                ah0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            bf0Var2.s(false);
                                            g2Var.post(new ye0(bf0Var2, 0));
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
                                bf0 bf0Var3 = bf0Var;
                                bf0Var3.R = false;
                                ah0 ah0Var2 = bf0Var3.f34312a0;
                                ah0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", bf0Var3.G);
                                    bundle2.putString("phoneHash", bf0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    ah0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final bf0 bf0Var2 = this.f40382b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f40383c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                bf0 bf0Var22 = bf0Var2;
                                int i11 = bf0Var22.f34311a;
                                di.g2 g2Var = bf0Var22.f34314c;
                                ah0 ah0Var = bf0Var22.f34312a0;
                                ah0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    bf0Var22.R = false;
                                    ah0Var.v1(false, true);
                                    bf0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ah0Var.f33924p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", bf0Var22.G);
                                        bundle.putString("phoneHash", bf0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ah0Var.u1(5, true, bundle, false);
                                    } else {
                                        ah0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ue0(bf0Var22, tL_auth_signIn22, 1), 10);
                                    bf0Var22.r();
                                } else {
                                    bf0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                bf0Var22.c(true);
                                                ah0Var.u1(0, true, null, true);
                                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                ah0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            bf0Var22.s(false);
                                            g2Var.post(new ye0(bf0Var22, 0));
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
                                bf0 bf0Var3 = bf0Var2;
                                bf0Var3.R = false;
                                ah0 ah0Var2 = bf0Var3.f34312a0;
                                ah0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", bf0Var3.G);
                                    bundle2.putString("phoneHash", bf0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    ah0Var2.u1(6, true, bundle2, false);
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
