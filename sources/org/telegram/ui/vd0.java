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
public final class vd0 implements Runnable {
    public final int f38553a = 0;
    public final de0 f38554b;
    public final TLRPC.TL_error f38555c;
    public final TLObject d;
    public final String e;

    public vd0(de0 de0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f38554b = de0Var;
        this.f38555c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38553a) {
            case 0:
                final de0 de0Var = this.f38554b;
                ae0 ae0Var = de0Var.f32941a;
                tg0 tg0Var = de0Var.W;
                tg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.f38555c;
                String str = this.e;
                if (tL_error == null) {
                    de0Var.E = false;
                    tg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", de0Var.I);
                    bundle.putString("ephone", de0Var.J);
                    bundle.putString("phoneFormated", de0Var.L);
                    bundle.putString("phoneHash", de0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            tg0Var.f37803p0 = tL_help_termsOfService;
                        }
                        de0Var.o(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        de0Var.W.u1(5, true, bundle, false);
                                        return;
                                    default:
                                        de0Var.W.u1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        de0Var.o(new tq(de0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new td0(de0Var, str, 1), 10);
                } else {
                    de0Var.E = false;
                    tg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            tg0Var.u1(0, true, null, true);
                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            tg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    } else {
                        wd0 wd0Var = de0Var.S;
                        ce0 ce0Var = de0Var.Q;
                        try {
                            ae0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            ds[] dsVarArr = ae0Var.f32431f;
                            if (i11 < dsVarArr.length) {
                                dsVarArr[i11].setText("");
                                ae0Var.f32431f[i11].i(1.0f);
                                i11++;
                            } else {
                                if (ce0Var.getCurrentView() == de0Var.e) {
                                    ce0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(de0Var.h, false, 1.0f, true);
                                }
                                ae0Var.f32431f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(ae0Var, 10.0f, new wd0(de0Var, 3));
                                de0Var.removeCallbacks(wd0Var);
                                de0Var.postDelayed(wd0Var, 5000L);
                                de0Var.R = true;
                            }
                        }
                    }
                    if (ae0Var.f32431f != null) {
                        int i12 = 0;
                        while (true) {
                            ds[] dsVarArr2 = ae0Var.f32431f;
                            if (i12 < dsVarArr2.length) {
                                dsVarArr2[i12].setText("");
                                i12++;
                            } else {
                                dsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ae0Var.e = false;
                }
                de0Var.F = null;
                return;
            default:
                final de0 de0Var2 = this.f38554b;
                de0Var2.E = false;
                tg0 tg0Var2 = de0Var2.W;
                tg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.f38555c;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.e5.x0(tg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", de0Var2.L);
                    bundle2.putString("phoneHash", de0Var2.M);
                    bundle2.putString("code", this.e);
                    de0Var2.o(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    de0Var2.W.u1(5, true, bundle2, false);
                                    return;
                                default:
                                    de0Var2.W.u1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                return;
        }
    }

    public vd0(de0 de0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f38554b = de0Var;
        this.f38555c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
