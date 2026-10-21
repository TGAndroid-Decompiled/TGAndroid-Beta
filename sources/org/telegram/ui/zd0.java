package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zd0 implements Runnable {
    public final int f43725a = 0;
    public final de0 f43726b;
    public final TLRPC.TL_error f43727c;
    public final Bundle d;
    public final TLObject e;

    public zd0(de0 de0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f43726b = de0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f43727c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f43725a) {
            case 0:
                de0 de0Var = this.f43726b;
                dg0 dg0Var = de0Var.f36345a0;
                de0Var.M = false;
                de0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    de0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    de0Var.T = tL_auth_sentCode;
                    dg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f43727c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            de0Var.c(true);
                            dg0Var.u1(0, true, null, true);
                            dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            dg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                de0 de0Var2 = this.f43726b;
                dg0 dg0Var2 = de0Var2.f36345a0;
                de0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f43727c;
                if (tL_error2 == null) {
                    dg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                de0Var2.c(true);
                                dg0Var2.u1(0, true, null, true);
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                dg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                dg0Var2.k1(false, true);
                return;
        }
    }

    public zd0(de0 de0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f43726b = de0Var;
        this.f43727c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
