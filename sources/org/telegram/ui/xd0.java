package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xd0 implements RequestDelegate {
    public final int f42690a;
    public final ge0 f42691b;
    public final Bundle f42692c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public xd0(ge0 ge0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f42690a = i10;
        this.f42691b = ge0Var;
        this.f42692c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42690a) {
            case 0:
                final ge0 ge0Var = this.f42691b;
                final Bundle bundle = this.f42692c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        ge0 ge0Var2 = ge0Var;
                        switch (i12) {
                            case 0:
                                wg0 wg0Var = ge0Var2.W;
                                if (wg0Var.getParentActivity() != null) {
                                    ge0Var2.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        wg0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ge0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                                            b2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            gf.b c10 = gf.b.c();
                                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + ge0Var2.L))));
                                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                            org.telegram.ui.Components.e5.f0(i10, tL_error2, wg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            wg0Var.u1(0, true, null, true);
                                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                wg0 wg0Var2 = ge0Var2.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ge0Var2.f36652y.getString("emailPattern");
                                        ge0Var2.f36651x = true;
                                    }
                                    wg0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                        org.telegram.ui.Components.e5.f0(i11, tL_error2, wg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    wg0Var2.u1(0, true, null, true);
                                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ge0 ge0Var2 = this.f42691b;
                final Bundle bundle2 = this.f42692c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = r6;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        ge0 ge0Var22 = ge0Var2;
                        switch (i12) {
                            case 0:
                                wg0 wg0Var = ge0Var22.W;
                                if (wg0Var.getParentActivity() != null) {
                                    ge0Var22.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        wg0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ge0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                                            b2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            gf.b c10 = gf.b.c();
                                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + ge0Var22.L))));
                                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                            org.telegram.ui.Components.e5.f0(i10, tL_error2, wg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            wg0Var.u1(0, true, null, true);
                                            wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                wg0 wg0Var2 = ge0Var22.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ge0Var22.f36652y.getString("emailPattern");
                                        ge0Var22.f36651x = true;
                                    }
                                    wg0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                        org.telegram.ui.Components.e5.f0(i11, tL_error2, wg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    wg0Var2.u1(0, true, null, true);
                                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
