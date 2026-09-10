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
public final class yd0 implements Runnable {
    public final int f38976a = 0;
    public final ge0 f38977b;
    public final TLRPC.TL_error f38978c;
    public final TLObject d;
    public final String e;

    public yd0(ge0 ge0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f38977b = ge0Var;
        this.f38978c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38976a) {
            case 0:
                final ge0 ge0Var = this.f38977b;
                de0 de0Var = ge0Var.f33070a;
                xg0 xg0Var = ge0Var.W;
                xg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f38978c;
                String str = this.e;
                if (tL_error == null) {
                    ge0Var.E = false;
                    xg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ge0Var.I);
                    bundle.putString("ephone", ge0Var.J);
                    bundle.putString("phoneFormated", ge0Var.L);
                    bundle.putString("phoneHash", ge0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            xg0Var.f38736p0 = tL_help_termsOfService;
                        }
                        ge0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ge0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        ge0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ge0Var.o(new zq(ge0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wd0(ge0Var, str, 1), 10);
                } else {
                    ge0Var.E = false;
                    xg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            xg0Var.u1(0, true, null, true);
                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            xg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        zd0 zd0Var = ge0Var.S;
                        fe0 fe0Var = ge0Var.Q;
                        try {
                            de0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            hs[] hsVarArr = de0Var.f32906f;
                            if (i11 < hsVarArr.length) {
                                hsVarArr[i11].setText("");
                                de0Var.f32906f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (fe0Var.getCurrentView() == ge0Var.e) {
                                    fe0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ge0Var.h, false, 1.0f, true);
                                }
                                de0Var.f32906f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(de0Var, 10.0f, new zd0(ge0Var, 3));
                                ge0Var.removeCallbacks(zd0Var);
                                ge0Var.postDelayed(zd0Var, 5000L);
                                ge0Var.R = true;
                            }
                        }
                    }
                    if (de0Var.f32906f != null) {
                        int i12 = 0;
                        while (true) {
                            hs[] hsVarArr2 = de0Var.f32906f;
                            if (i12 < hsVarArr2.length) {
                                hsVarArr2[i12].setText("");
                                i12++;
                            } else {
                                hsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    de0Var.e = false;
                }
                ge0Var.F = null;
                return;
            default:
                final ge0 ge0Var2 = this.f38977b;
                ge0Var2.E = false;
                xg0 xg0Var2 = ge0Var2.W;
                xg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f38978c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ge0Var2.L);
                    bundle2.putString("phoneHash", ge0Var2.M);
                    bundle2.putString("code", this.e);
                    ge0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ge0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    ge0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public yd0(ge0 ge0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f38977b = ge0Var;
        this.f38978c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
