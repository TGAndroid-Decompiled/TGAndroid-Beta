package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ve0 implements Runnable {
    public final int f38552a = 0;
    public final ze0 f38553b;
    public final TLRPC.TL_error f38554c;
    public final Bundle d;
    public final TLObject e;

    public ve0(ze0 ze0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f38553b = ze0Var;
        this.e = tLObject;
        this.d = bundle;
        this.f38554c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38552a) {
            case 0:
                ze0 ze0Var = this.f38553b;
                yg0 yg0Var = ze0Var.f40215a0;
                ze0Var.M = false;
                ze0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    ze0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ze0Var.T = tL_auth_sentCode;
                    yg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f38554c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ze0Var.c(true);
                            yg0Var.u1(0, true, null, true);
                            yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            yg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                ze0 ze0Var2 = this.f38553b;
                yg0 yg0Var2 = ze0Var2.f40215a0;
                ze0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f38554c;
                if (tL_error2 == null) {
                    yg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                ze0Var2.c(true);
                                yg0Var2.u1(0, true, null, true);
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                yg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                yg0Var2.k1(false, true);
                return;
        }
    }

    public ve0(ze0 ze0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f38553b = ze0Var;
        this.f38554c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
