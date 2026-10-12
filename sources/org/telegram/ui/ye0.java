package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye0 implements Runnable {
    public final int f42145a = 0;
    public final cf0 f42146b;
    public final TLRPC.TL_error f42147c;
    public final Bundle d;
    public final TLObject e;

    public ye0(cf0 cf0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f42146b = cf0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f42147c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f42145a) {
            case 0:
                cf0 cf0Var = this.f42146b;
                bh0 bh0Var = cf0Var.f34926a0;
                cf0Var.M = false;
                cf0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    cf0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    cf0Var.T = tL_auth_sentCode;
                    bh0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f42147c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            cf0Var.c(true);
                            bh0Var.u1(0, true, null, true);
                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            bh0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                cf0 cf0Var2 = this.f42146b;
                bh0 bh0Var2 = cf0Var2.f34926a0;
                cf0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f42147c;
                if (tL_error2 == null) {
                    bh0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                cf0Var2.c(true);
                                bh0Var2.u1(0, true, null, true);
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                bh0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                bh0Var2.k1(false, true);
                return;
        }
    }

    public ye0(cf0 cf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f42146b = cf0Var;
        this.f42147c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
