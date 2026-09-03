package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rd0 implements RequestDelegate {
    public final int f37802a;
    public final ae0 f37803b;
    public final Bundle f37804c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public rd0(ae0 ae0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f37802a = i10;
        this.f37803b = ae0Var;
        this.f37804c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37802a) {
            case 0:
                final ae0 ae0Var = this.f37803b;
                final Bundle bundle = this.f37804c;
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
                        ae0 ae0Var2 = ae0Var;
                        switch (i12) {
                            case 0:
                                pg0 pg0Var = ae0Var2.T;
                                if (pg0Var.getParentActivity() != null) {
                                    ae0Var2.S = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        pg0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ae0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                                            d2Var.O = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            se.b c3 = se.b.c();
                                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c3.b("+" + ae0Var2.I))));
                                            kf.k0.C(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i10, tL_error2, pg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            pg0Var.u1(0, true, null, true);
                                            pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                pg0 pg0Var2 = ae0Var2.T;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ae0Var2.f32570y.getString("emailPattern");
                                        ae0Var2.f32569x = true;
                                    }
                                    pg0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) pg0Var2).currentAccount;
                                        org.telegram.ui.Components.z4.f0(i11, tL_error2, pg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    pg0Var2.u1(0, true, null, true);
                                    pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ae0 ae0Var2 = this.f37803b;
                final Bundle bundle2 = this.f37804c;
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
                        ae0 ae0Var22 = ae0Var2;
                        switch (i12) {
                            case 0:
                                pg0 pg0Var = ae0Var22.T;
                                if (pg0Var.getParentActivity() != null) {
                                    ae0Var22.S = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        pg0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ae0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                                            d2Var.O = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            se.b c3 = se.b.c();
                                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c3.b("+" + ae0Var22.I))));
                                            kf.k0.C(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                                            org.telegram.ui.Components.z4.f0(i10, tL_error2, pg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            pg0Var.u1(0, true, null, true);
                                            pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                pg0 pg0Var2 = ae0Var22.T;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ae0Var22.f32570y.getString("emailPattern");
                                        ae0Var22.f32569x = true;
                                    }
                                    pg0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) pg0Var2).currentAccount;
                                        org.telegram.ui.Components.z4.f0(i11, tL_error2, pg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    pg0Var2.u1(0, true, null, true);
                                    pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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
