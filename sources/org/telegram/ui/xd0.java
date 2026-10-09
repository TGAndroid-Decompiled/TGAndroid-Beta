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
public final class xd0 implements Runnable {
    public final int f43931a = 0;
    public final fe0 f43932b;
    public final TLRPC.TL_error f43933c;
    public final TLObject d;
    public final String f43934e;

    public xd0(fe0 fe0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f43932b = fe0Var;
        this.f43933c = tL_error;
        this.f43934e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43931a) {
            case 0:
                final fe0 fe0Var = this.f43932b;
                ce0 ce0Var = fe0Var.f37523a;
                wg0 wg0Var = fe0Var.W;
                wg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f43933c;
                String str = this.f43934e;
                if (tL_error == null) {
                    fe0Var.E = false;
                    wg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", fe0Var.I);
                    bundle.putString("ephone", fe0Var.J);
                    bundle.putString("phoneFormated", fe0Var.L);
                    bundle.putString("phoneHash", fe0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            wg0Var.f43592p0 = tL_help_termsOfService;
                        }
                        fe0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        fe0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        fe0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        fe0Var.o(new vq(fe0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new vd0(fe0Var, str, 1), 10);
                } else {
                    fe0Var.E = false;
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
                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        yd0 yd0Var = fe0Var.S;
                        ee0 ee0Var = fe0Var.Q;
                        try {
                            ce0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            es[] esVarArr = ce0Var.f36732f;
                            if (i11 < esVarArr.length) {
                                esVarArr[i11].setText("");
                                ce0Var.f36732f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (ee0Var.getCurrentView() == fe0Var.f37526e) {
                                    ee0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(fe0Var.h, false, 1.0f, true);
                                }
                                ce0Var.f36732f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(ce0Var, 10.0f, new yd0(fe0Var, 3));
                                fe0Var.removeCallbacks(yd0Var);
                                fe0Var.postDelayed(yd0Var, 5000L);
                                fe0Var.R = true;
                            }
                        }
                    }
                    if (ce0Var.f36732f != null) {
                        int i12 = 0;
                        while (true) {
                            es[] esVarArr2 = ce0Var.f36732f;
                            if (i12 < esVarArr2.length) {
                                esVarArr2[i12].setText("");
                                i12++;
                            } else {
                                esVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ce0Var.f36731e = false;
                }
                fe0Var.F = null;
                return;
            default:
                final fe0 fe0Var2 = this.f43932b;
                fe0Var2.E = false;
                wg0 wg0Var2 = fe0Var2.W;
                wg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f43933c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.g5.w0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", fe0Var2.L);
                    bundle2.putString("phoneHash", fe0Var2.M);
                    bundle2.putString("code", this.f43934e);
                    fe0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    fe0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    fe0Var2.W.u1(6, true, bundle2, false);
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

    public xd0(fe0 fe0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f43932b = fe0Var;
        this.f43933c = tL_error;
        this.d = tLObject;
        this.f43934e = str;
    }
}
