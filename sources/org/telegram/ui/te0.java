package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f36917a = 0;
    public final xe0 f36918b;
    public final TLRPC.TL_error f36919c;
    public final Bundle d;
    public final TLObject e;

    public te0(xe0 xe0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f36918b = xe0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f36919c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36917a) {
            case 0:
                xe0 xe0Var = this.f36918b;
                xg0 xg0Var = xe0Var.f38684a0;
                xe0Var.M = false;
                xe0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    xe0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    xe0Var.T = tL_auth_sentCode;
                    xg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f36919c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            xe0Var.c(true);
                            xg0Var.u1(0, true, null, true);
                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            xg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                xe0 xe0Var2 = this.f36918b;
                xg0 xg0Var2 = xe0Var2.f38684a0;
                xe0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f36919c;
                if (tL_error2 == null) {
                    xg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                xe0Var2.c(true);
                                xg0Var2.u1(0, true, null, true);
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                xg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                xg0Var2.k1(false, true);
                return;
        }
    }

    public te0(xe0 xe0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f36918b = xe0Var;
        this.f36919c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
