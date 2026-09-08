package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements Runnable {
    public final int f40751a = 0;
    public final xe0 f40752b;
    public final TLRPC.TL_error f40753c;
    public final Bundle d;
    public final TLObject f40754e;

    public te0(xe0 xe0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f40752b = xe0Var;
        this.f40754e = tLObject;
        this.d = bundle;
        this.f40753c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f40751a) {
            case 0:
                xe0 xe0Var = this.f40752b;
                wg0 wg0Var = xe0Var.f42728a0;
                xe0Var.M = false;
                xe0Var.v.invalidate();
                TLObject tLObject = this.f40754e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    xe0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    xe0Var.T = tL_auth_sentCode;
                    wg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f40753c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            xe0Var.c(true);
                            wg0Var.u1(0, true, null, true);
                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            wg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                xe0 xe0Var2 = this.f40752b;
                wg0 wg0Var2 = xe0Var2.f42728a0;
                xe0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f40753c;
                if (tL_error2 == null) {
                    wg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.f40754e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                xe0Var2.c(true);
                                wg0Var2.u1(0, true, null, true);
                                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                wg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                wg0Var2.k1(false, true);
                return;
        }
    }

    public te0(xe0 xe0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f40752b = xe0Var;
        this.f40753c = tL_error;
        this.d = bundle;
        this.f40754e = tLObject;
    }
}
