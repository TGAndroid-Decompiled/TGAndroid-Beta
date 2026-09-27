package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ud0 implements RequestDelegate {
    public final int f38210a;
    public final de0 f38211b;
    public final Bundle f38212c;
    public final TLRPC.TL_auth_resetLoginEmail d;

    public ud0(de0 de0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.f38210a = i10;
        this.f38211b = de0Var;
        this.f38212c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38210a) {
            case 0:
                final de0 de0Var = this.f38211b;
                final Bundle bundle = this.f38212c;
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
                        de0 de0Var2 = de0Var;
                        switch (i12) {
                            case 0:
                                tg0 tg0Var = de0Var2.W;
                                if (tg0Var.getParentActivity() != null) {
                                    de0Var2.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        tg0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var2.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                            c2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            gf.b c10 = gf.b.c();
                                            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + de0Var2.L))));
                                            org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                                            org.telegram.ui.Components.e5.f0(i10, tL_error2, tg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                            return;
                                        } else {
                                            tg0Var.u1(0, true, null, true);
                                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                tg0 tg0Var2 = de0Var2.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = de0Var2.f32950y.getString("emailPattern");
                                        de0Var2.f32949x = true;
                                    }
                                    tg0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.o2) tg0Var2).currentAccount;
                                        org.telegram.ui.Components.e5.f0(i11, tL_error2, tg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                        return;
                                    }
                                    tg0Var2.u1(0, true, null, true);
                                    tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final de0 de0Var2 = this.f38211b;
                final Bundle bundle2 = this.f38212c;
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
                        de0 de0Var22 = de0Var2;
                        switch (i12) {
                            case 0:
                                tg0 tg0Var = de0Var22.W;
                                if (tg0Var.getParentActivity() != null) {
                                    de0Var22.V = false;
                                    if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                        tg0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        return;
                                    } else if (tL_error2 != null && (str = tL_error2.text) != null) {
                                        if (str.contains("TASK_ALREADY_EXISTS")) {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var22.getContext());
                                            String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                                            c2Var.R = string;
                                            int i13 = R.string.LoginEmailResetPremiumRequiredMessage;
                                            gf.b c10 = gf.b.c();
                                            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i13, LocaleController.addNbsp(c10.b("+" + de0Var22.L))));
                                            org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                                            return;
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                            i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                                            org.telegram.ui.Components.e5.f0(i10, tL_error2, tg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                            return;
                                        } else {
                                            tg0Var.u1(0, true, null, true);
                                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            default:
                                tg0 tg0Var2 = de0Var22.W;
                                if (tLObject2 instanceof TLRPC.TL_auth_sentCode) {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = de0Var22.f32950y.getString("emailPattern");
                                        de0Var22.f32949x = true;
                                    }
                                    tg0Var2.g1(bundle22, tL_auth_sentCode, true);
                                    return;
                                } else if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                    if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                        i11 = ((org.telegram.ui.ActionBar.o2) tg0Var2).currentAccount;
                                        org.telegram.ui.Components.e5.f0(i11, tL_error2, tg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                        return;
                                    }
                                    tg0Var2.u1(0, true, null, true);
                                    tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
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
