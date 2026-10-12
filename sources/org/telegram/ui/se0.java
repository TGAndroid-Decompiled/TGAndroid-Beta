package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se0 implements RequestDelegate {
    public final int f40106a;
    public final ue0 f40107b;

    public se0(ue0 ue0Var, int i10) {
        this.f40106a = i10;
        this.f40107b = ue0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40106a) {
            case 0:
                final ue0 ue0Var = this.f40107b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ue0 ue0Var2 = ue0Var;
                        switch (i11) {
                            case 0:
                                ue0Var2.getClass();
                                if (tL_error2 == null) {
                                    ue0Var2.f40660n = (TL_account.Password) tLObject2;
                                    ue0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                bh0 bh0Var = ue0Var2.f40665y;
                                bh0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (bh0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28135a |= 256;
                                            obj.f28136b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28137c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                        a2Var.T = formatSpannable;
                                        a2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gw(21, ue0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = bh0Var.showDialog(a2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                                    }
                                    bh0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                bh0 bh0Var2 = ue0Var2.f40665y;
                                ue0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) bh0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new se0(ue0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    bh0Var2.v1(false, true);
                                    ue0Var2.postDelayed(new wc0(4, ue0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    bh0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (bh0Var2.getParentActivity() != null) {
                                            ue0Var2.f40656a.setText("");
                                            bh0.U0(bh0Var2, ue0Var2.f40664x, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                                        }
                                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final ue0 ue0Var2 = this.f40107b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ue0 ue0Var22 = ue0Var2;
                        switch (i11) {
                            case 0:
                                ue0Var22.getClass();
                                if (tL_error2 == null) {
                                    ue0Var22.f40660n = (TL_account.Password) tLObject2;
                                    ue0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                bh0 bh0Var = ue0Var22.f40665y;
                                bh0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (bh0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28135a |= 256;
                                            obj.f28136b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28137c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                        a2Var.T = formatSpannable;
                                        a2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gw(21, ue0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = bh0Var.showDialog(a2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                                    }
                                    bh0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                bh0 bh0Var2 = ue0Var22.f40665y;
                                ue0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) bh0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new se0(ue0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    bh0Var2.v1(false, true);
                                    ue0Var22.postDelayed(new wc0(4, ue0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    bh0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (bh0Var2.getParentActivity() != null) {
                                            ue0Var22.f40656a.setText("");
                                            bh0.U0(bh0Var2, ue0Var22.f40664x, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                                        }
                                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final ue0 ue0Var3 = this.f40107b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        String formatPluralString2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ue0 ue0Var22 = ue0Var3;
                        switch (i11) {
                            case 0:
                                ue0Var22.getClass();
                                if (tL_error2 == null) {
                                    ue0Var22.f40660n = (TL_account.Password) tLObject2;
                                    ue0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                bh0 bh0Var = ue0Var22.f40665y;
                                bh0Var.k1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (bh0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f28135a |= 256;
                                            obj.f28136b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f28137c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                        a2Var.T = formatSpannable;
                                        a2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gw(21, ue0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = bh0Var.showDialog(a2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                                    }
                                    bh0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                                    return;
                                } else {
                                    bh0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    return;
                                }
                            default:
                                bh0 bh0Var2 = ue0Var22.f40665y;
                                ue0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) bh0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new se0(ue0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    bh0Var2.v1(false, true);
                                    ue0Var22.postDelayed(new wc0(4, ue0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    bh0Var2.k1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (bh0Var2.getParentActivity() != null) {
                                            ue0Var22.f40656a.setText("");
                                            bh0.U0(bh0Var2, ue0Var22.f40664x, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                                        } else {
                                            formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                                        }
                                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                                        return;
                                    } else {
                                        bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
        }
    }
}
