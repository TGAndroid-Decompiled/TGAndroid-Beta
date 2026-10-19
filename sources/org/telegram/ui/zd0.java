package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zd0 implements Runnable {
    public final int f43724a = 0;
    public final de0 f43725b;
    public final TLRPC.TL_error f43726c;
    public final Bundle d;
    public final TLObject e;

    public zd0(de0 de0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f43725b = de0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f43726c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f43724a) {
            case 0:
                de0 de0Var = this.f43725b;
                cg0 cg0Var = de0Var.f36366a0;
                de0Var.M = false;
                de0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    de0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    de0Var.T = tL_auth_sentCode;
                    cg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f43726c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            de0Var.c(true);
                            cg0Var.u1(0, true, null, true);
                            cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            cg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        cg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                de0 de0Var2 = this.f43725b;
                cg0 cg0Var2 = de0Var2.f36366a0;
                de0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f43726c;
                if (tL_error2 == null) {
                    cg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                de0Var2.c(true);
                                cg0Var2.u1(0, true, null, true);
                                cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                cg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            cg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                cg0Var2.k1(false, true);
                return;
        }
    }

    public zd0(de0 de0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f43725b = de0Var;
        this.f43726c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
