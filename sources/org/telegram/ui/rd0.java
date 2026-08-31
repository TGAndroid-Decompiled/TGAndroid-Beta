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
public final class rd0 implements Runnable {
    public final int f40935a = 0;
    public final zd0 f40936b;
    public final TLRPC.TL_error f40937c;
    public final TLObject d;
    public final String f40938e;

    public rd0(zd0 zd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f40936b = zd0Var;
        this.f40937c = tL_error;
        this.f40938e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40935a) {
            case 0:
                final zd0 zd0Var = this.f40936b;
                wd0 wd0Var = zd0Var.f43906a;
                og0 og0Var = zd0Var.T;
                og0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f40937c;
                String str = this.f40938e;
                if (tL_error == null) {
                    zd0Var.B = false;
                    og0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", zd0Var.F);
                    bundle.putString("ephone", zd0Var.G);
                    bundle.putString("phoneFormated", zd0Var.I);
                    bundle.putString("phoneHash", zd0Var.J);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            og0Var.m0 = tL_help_termsOfService;
                        }
                        zd0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        zd0Var.T.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        zd0Var.T.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        zd0Var.o(new sq(zd0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new pd0(zd0Var, str, 1), 10);
                } else {
                    zd0Var.B = false;
                    og0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            og0Var.u1(0, true, null, true);
                            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            og0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        sd0 sd0Var = zd0Var.P;
                        yd0 yd0Var = zd0Var.N;
                        try {
                            wd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            cs[] csVarArr = wd0Var.f43982f;
                            if (i11 < csVarArr.length) {
                                csVarArr[i11].setText("");
                                wd0Var.f43982f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (yd0Var.getCurrentView() == zd0Var.f43909e) {
                                    yd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(zd0Var.h, false, 1.0f, true);
                                }
                                wd0Var.f43982f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(wd0Var, 10.0f, new sd0(zd0Var, 3));
                                zd0Var.removeCallbacks(sd0Var);
                                zd0Var.postDelayed(sd0Var, 5000L);
                                zd0Var.O = true;
                            }
                        }
                    }
                    if (wd0Var.f43982f != null) {
                        int i12 = 0;
                        while (true) {
                            cs[] csVarArr2 = wd0Var.f43982f;
                            if (i12 < csVarArr2.length) {
                                csVarArr2[i12].setText("");
                                i12++;
                            } else {
                                csVarArr2[0].requestFocus();
                            }
                        }
                    }
                    wd0Var.f43981e = false;
                }
                zd0Var.C = null;
                return;
            default:
                final zd0 zd0Var2 = this.f40936b;
                zd0Var2.B = false;
                og0 og0Var2 = zd0Var2.T;
                og0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f40937c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", zd0Var2.I);
                    bundle2.putString("phoneHash", zd0Var2.J);
                    bundle2.putString("code", this.f40938e);
                    zd0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    zd0Var2.T.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    zd0Var2.T.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public rd0(zd0 zd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f40936b = zd0Var;
        this.f40937c = tL_error;
        this.d = tLObject;
        this.f40938e = str;
    }
}
