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
    public final int f43355a = 0;
    public final ee0 f43356b;
    public final TLRPC.TL_error f43357c;
    public final TLObject d;
    public final String f43358e;

    public wd0(ee0 ee0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f43356b = ee0Var;
        this.f43357c = tL_error;
        this.f43358e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43355a) {
            case 0:
                final ee0 ee0Var = this.f43356b;
                be0 be0Var = ee0Var.f37312a;
                vg0 vg0Var = ee0Var.W;
                vg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f43357c;
                String str = this.f43358e;
                if (tL_error == null) {
                    ee0Var.E = false;
                    vg0Var.v1(false, true);
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
                            vg0Var.f43065p0 = tL_help_termsOfService;
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
                        ee0Var.o(new vq(ee0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ud0(ee0Var, str, 1), 10);
                } else {
                    ee0Var.E = false;
                    vg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            vg0Var.u1(0, true, null, true);
                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
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
                            ds[] dsVarArr = be0Var.f36484f;
                            if (i11 < dsVarArr.length) {
                                dsVarArr[i11].setText("");
                                be0Var.f36484f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (de0Var.getCurrentView() == ee0Var.f37315e) {
                                    de0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ee0Var.h, false, 1.0f, true);
                                }
                                be0Var.f36484f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(be0Var, 10.0f, new xd0(ee0Var, 3));
                                ee0Var.removeCallbacks(xd0Var);
                                ee0Var.postDelayed(xd0Var, 5000L);
                                ee0Var.R = true;
                            }
                        }
                    }
                    if (be0Var.f36484f != null) {
                        int i12 = 0;
                        while (true) {
                            ds[] dsVarArr2 = be0Var.f36484f;
                            if (i12 < dsVarArr2.length) {
                                dsVarArr2[i12].setText("");
                                i12++;
                            } else {
                                dsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    be0Var.f36483e = false;
                }
                ee0Var.F = null;
                return;
            default:
                final ee0 ee0Var2 = this.f43356b;
                ee0Var2.E = false;
                vg0 vg0Var2 = ee0Var2.W;
                vg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f43357c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ee0Var2.L);
                    bundle2.putString("phoneHash", ee0Var2.M);
                    bundle2.putString("code", this.f43358e);
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
                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public wd0(ee0 ee0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f43356b = ee0Var;
        this.f43357c = tL_error;
        this.d = tLObject;
        this.f43358e = str;
    }
}
