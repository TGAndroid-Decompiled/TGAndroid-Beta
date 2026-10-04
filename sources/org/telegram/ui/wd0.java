package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wd0 implements Runnable {
    public final int f42066a = 0;
    public final ee0 f42067b;
    public final TLRPC.TL_error f42068c;
    public final TLObject d;
    public final String f42069e;

    public wd0(ee0 ee0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f42067b = ee0Var;
        this.f42068c = tL_error;
        this.f42069e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42066a) {
            case 0:
                final ee0 ee0Var = this.f42067b;
                be0 be0Var = ee0Var.f36001a;
                ug0 ug0Var = ee0Var.W;
                ug0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f42068c;
                String str = this.f42069e;
                if (tL_error == null) {
                    ee0Var.E = false;
                    ug0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ee0Var.I);
                    bundle.putString("ephone", ee0Var.J);
                    bundle.putString("phoneFormated", ee0Var.L);
                    bundle.putString("phoneHash", ee0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ug0Var.f41220p0 = tL_help_termsOfService;
                        }
                        ee0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ee0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        ee0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ee0Var.o(new uq(ee0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ud0(ee0Var, str, 1), 10);
                } else {
                    ee0Var.E = false;
                    ug0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ug0Var.u1(0, true, null, true);
                            ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            ug0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        xd0 xd0Var = ee0Var.S;
                        de0 de0Var = ee0Var.Q;
                        try {
                            be0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            es[] esVarArr = be0Var.f35549f;
                            if (i11 < esVarArr.length) {
                                esVarArr[i11].setText("");
                                be0Var.f35549f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (de0Var.getCurrentView() == ee0Var.f36004e) {
                                    de0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ee0Var.h, false, 1.0f, true);
                                }
                                be0Var.f35549f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(be0Var, 10.0f, new xd0(ee0Var, 3));
                                ee0Var.removeCallbacks(xd0Var);
                                ee0Var.postDelayed(xd0Var, 5000L);
                                ee0Var.R = true;
                            }
                        }
                    }
                    if (be0Var.f35549f != null) {
                        int i12 = 0;
                        while (true) {
                            es[] esVarArr2 = be0Var.f35549f;
                            if (i12 < esVarArr2.length) {
                                esVarArr2[i12].setText("");
                                i12++;
                            } else {
                                esVarArr2[0].requestFocus();
                            }
                        }
                    }
                    be0Var.f35548e = false;
                }
                ee0Var.F = null;
                return;
            default:
                final ee0 ee0Var2 = this.f42067b;
                ee0Var2.E = false;
                ug0 ug0Var2 = ee0Var2.W;
                ug0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f42068c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(ug0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ee0Var2.L);
                    bundle2.putString("phoneHash", ee0Var2.M);
                    bundle2.putString("code", this.f42069e);
                    ee0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ee0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    ee0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public wd0(ee0 ee0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f42067b = ee0Var;
        this.f42068c = tL_error;
        this.d = tLObject;
        this.f42069e = str;
    }
}
