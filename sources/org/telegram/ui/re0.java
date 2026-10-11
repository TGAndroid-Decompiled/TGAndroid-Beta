package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class re0 implements Runnable {
    public final int f41422a = 0;
    public final ve0 f41423b;
    public final TLRPC.TL_error f41424c;
    public final Bundle d;
    public final TLObject f41425e;

    public re0(ve0 ve0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f41423b = ve0Var;
        this.f41425e = tLObject;
        this.d = bundle;
        this.f41424c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f41422a) {
            case 0:
                ve0 ve0Var = this.f41423b;
                vg0 vg0Var = ve0Var.f42989a0;
                ve0Var.M = false;
                ve0Var.v.invalidate();
                TLObject tLObject = this.f41425e;
                if (tLObject != null) {
                    Bundle bundle = this.d;
                    ve0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ve0Var.T = tL_auth_sentCode;
                    vg0Var.g1(bundle, tL_auth_sentCode, true);
                    return;
                }
                TLRPC.TL_error tL_error = this.f41424c;
                if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ve0Var.c(true);
                            vg0Var.u1(0, true, null, true);
                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            return;
                        } else if (tL_error.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error.text);
                            vg0Var.l1(string, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        return;
                    }
                }
                return;
            default:
                ve0 ve0Var2 = this.f41423b;
                vg0 vg0Var2 = ve0Var2.f42989a0;
                ve0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.f41424c;
                if (tL_error2 == null) {
                    vg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.f41425e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                ve0Var2.c(true);
                                vg0Var2.u1(0, true, null, true);
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                            } else if (tL_error2.code != -1000) {
                                String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                                sb3.append(tL_error2.text);
                                vg0Var2.l1(string2, sb3.toString());
                            }
                        } else {
                            vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        }
                    }
                }
                vg0Var2.k1(false, true);
                return;
        }
    }

    public re0(ve0 ve0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f41423b = ve0Var;
        this.f41424c = tL_error;
        this.d = bundle;
        this.f41425e = tLObject;
    }
}
