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
    public final int f43081a = 0;
    public final ge0 f43082b;
    public final TLRPC.TL_error f43083c;
    public final TLObject d;
    public final String f43084e;

    public yd0(ge0 ge0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f43082b = ge0Var;
        this.f43083c = tL_error;
        this.f43084e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43081a) {
            case 0:
                final ge0 ge0Var = this.f43082b;
                de0 de0Var = ge0Var.f36642a;
                wg0 wg0Var = ge0Var.W;
                wg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f43083c;
                String str = this.f43084e;
                if (tL_error == null) {
                    ge0Var.E = false;
                    wg0Var.v1(false, true);
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
                            wg0Var.f42379p0 = tL_help_termsOfService;
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
                        ge0Var.o(new yq(ge0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wd0(ge0Var, str, 1), 10);
                } else {
                    ge0Var.E = false;
                    wg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            wg0Var.u1(0, true, null, true);
                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            wg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
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
                            gs[] gsVarArr = de0Var.f36163f;
                            if (i11 < gsVarArr.length) {
                                gsVarArr[i11].setText("");
                                de0Var.f36163f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (fe0Var.getCurrentView() == ge0Var.f36645e) {
                                    fe0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ge0Var.h, false, 1.0f, true);
                                }
                                de0Var.f36163f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(de0Var, 10.0f, new zd0(ge0Var, 3));
                                ge0Var.removeCallbacks(zd0Var);
                                ge0Var.postDelayed(zd0Var, 5000L);
                                ge0Var.R = true;
                            }
                        }
                    }
                    if (de0Var.f36163f != null) {
                        int i12 = 0;
                        while (true) {
                            gs[] gsVarArr2 = de0Var.f36163f;
                            if (i12 < gsVarArr2.length) {
                                gsVarArr2[i12].setText("");
                                i12++;
                            } else {
                                gsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    de0Var.f36162e = false;
                }
                ge0Var.F = null;
                return;
            default:
                final ge0 ge0Var2 = this.f43082b;
                ge0Var2.E = false;
                wg0 wg0Var2 = ge0Var2.W;
                wg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f43083c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ge0Var2.L);
                    bundle2.putString("phoneHash", ge0Var2.M);
                    bundle2.putString("code", this.f43084e);
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
                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public yd0(ge0 ge0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f43082b = ge0Var;
        this.f43083c = tL_error;
        this.d = tLObject;
        this.f43084e = str;
    }
}
