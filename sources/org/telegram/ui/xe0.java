package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements Runnable {
    public final int f41549a = 0;
    public final bf0 f41550b;
    public final TLRPC.TL_error f41551c;
    public final Bundle d;
    public final TLObject e;

    public xe0(bf0 bf0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f41550b = bf0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f41551c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f41549a) {
            case 0:
                bf0 bf0Var = this.f41550b;
                ah0 ah0Var = bf0Var.f34312a0;
                bf0Var.M = false;
                bf0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    bf0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    bf0Var.T = tL_auth_sentCode;
                    ah0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f41551c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            bf0Var.c(true);
                            ah0Var.u1(0, true, null, true);
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            ah0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                bf0 bf0Var2 = this.f41550b;
                ah0 ah0Var2 = bf0Var2.f34312a0;
                bf0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f41551c;
                if (tL_error2 == null) {
                    ah0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                bf0Var2.c(true);
                                ah0Var2.u1(0, true, null, true);
                                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                ah0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                ah0Var2.k1(false, true);
                return;
        }
    }

    public xe0(bf0 bf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f41550b = bf0Var;
        this.f41551c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
