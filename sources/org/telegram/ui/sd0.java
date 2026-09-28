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
public final class sd0 implements Runnable {
    public final int f37713a = 0;
    public final ae0 f37714b;
    public final TLRPC.TL_error f37715c;
    public final TLObject d;
    public final String e;

    public sd0(ae0 ae0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f37714b = ae0Var;
        this.f37715c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37713a) {
            case 0:
                final ae0 ae0Var = this.f37714b;
                xd0 xd0Var = ae0Var.f32137a;
                qg0 qg0Var = ae0Var.W;
                qg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f37715c;
                String str = this.e;
                if (tL_error == null) {
                    ae0Var.E = false;
                    qg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ae0Var.I);
                    bundle.putString("ephone", ae0Var.J);
                    bundle.putString("phoneFormated", ae0Var.L);
                    bundle.putString("phoneHash", ae0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            qg0Var.f36904p0 = tL_help_termsOfService;
                        }
                        ae0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ae0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        ae0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ae0Var.o(new sq(ae0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qd0(ae0Var, str, 1), 10);
                } else {
                    ae0Var.E = false;
                    qg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            qg0Var.u1(0, true, null, true);
                            qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            qg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        td0 td0Var = ae0Var.S;
                        zd0 zd0Var = ae0Var.Q;
                        try {
                            xd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            as[] asVarArr = xd0Var.f40237f;
                            if (i11 < asVarArr.length) {
                                asVarArr[i11].setText("");
                                xd0Var.f40237f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (zd0Var.getCurrentView() == ae0Var.e) {
                                    zd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ae0Var.h, false, 1.0f, true);
                                }
                                xd0Var.f40237f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(xd0Var, 10.0f, new td0(ae0Var, 3));
                                ae0Var.removeCallbacks(td0Var);
                                ae0Var.postDelayed(td0Var, 5000L);
                                ae0Var.R = true;
                            }
                        }
                    }
                    if (xd0Var.f40237f != null) {
                        int i12 = 0;
                        while (true) {
                            as[] asVarArr2 = xd0Var.f40237f;
                            if (i12 < asVarArr2.length) {
                                asVarArr2[i12].setText("");
                                i12++;
                            } else {
                                asVarArr2[0].requestFocus();
                            }
                        }
                    }
                    xd0Var.e = false;
                }
                ae0Var.F = null;
                return;
            default:
                final ae0 ae0Var2 = this.f37714b;
                ae0Var2.E = false;
                qg0 qg0Var2 = ae0Var2.W;
                qg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f37715c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(qg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ae0Var2.L);
                    bundle2.putString("phoneHash", ae0Var2.M);
                    bundle2.putString("code", this.e);
                    ae0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ae0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    ae0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public sd0(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f37714b = ae0Var;
        this.f37715c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
