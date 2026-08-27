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

public final class zd0 implements RequestDelegate {

    public final int f45145a;

    public final be0 f45146b;

    public zd0(be0 be0Var, int i10) {
        this.f45145a = i10;
        this.f45146b = be0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45145a) {
            case 0:
                final int i10 = 0;
                final be0 be0Var = this.f45146b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        be0 be0Var2 = be0Var;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                be0Var2.getClass();
                                if (tL_error2 == null) {
                                    be0Var2.f36798n = (TL_account.Password) tLObject2;
                                    be0Var2.h(null);
                                }
                                break;
                            case 1:
                                ig0 ig0Var = be0Var2.f36803y;
                                ig0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    } else {
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        ig0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                    }
                                    break;
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ig0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                                        int iIndexOf = str.indexOf(42);
                                        int iLastIndexOf = str.lastIndexOf(42);
                                        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                            org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                                            xz0Var.f34734a |= 256;
                                            xz0Var.f34735b = iIndexOf;
                                            int i13 = iLastIndexOf + 1;
                                            xz0Var.f34736c = i13;
                                            spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i13, 0);
                                        }
                                        SpannableStringBuilder spannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                        b2Var.P = spannable;
                                        b2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new zr(26, be0Var2, tL_auth_passwordRecovery));
                                        Dialog dialogShowDialog = ig0Var.showDialog(b2Var);
                                        if (dialogShowDialog != null) {
                                            dialogShowDialog.setCanceledOnTouchOutside(false);
                                            dialogShowDialog.setCancelable(false);
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = be0Var2.f36803y;
                                be0Var2.h = false;
                                if (tL_error2 == null || !"SRP_ID_INVALID".equals(tL_error2.text)) {
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                        ig0Var2.v1(false, true);
                                        be0Var2.postDelayed(new a30(24, be0Var2, tLObject2), 150L);
                                        break;
                                    } else {
                                        ig0Var2.k1(false, true);
                                        if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                            if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            } else {
                                                int iIntValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                                            }
                                            break;
                                        } else if (ig0Var2.getParentActivity() != null) {
                                            be0Var2.f36793a.setText("");
                                            ig0.U0(ig0Var2, be0Var2.f36802x, true);
                                            break;
                                        }
                                    }
                                } else {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(new TL_account.getPassword(), new zd0(be0Var2, i12), 8);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final be0 be0Var2 = this.f45146b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        be0 be0Var3 = be0Var2;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                be0Var3.getClass();
                                if (tL_error2 == null) {
                                    be0Var3.f36798n = (TL_account.Password) tLObject2;
                                    be0Var3.h(null);
                                }
                                break;
                            case 1:
                                ig0 ig0Var = be0Var3.f36803y;
                                ig0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    } else {
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        ig0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                    }
                                    break;
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ig0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                                        int iIndexOf = str.indexOf(42);
                                        int iLastIndexOf = str.lastIndexOf(42);
                                        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                            org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                                            xz0Var.f34734a |= 256;
                                            xz0Var.f34735b = iIndexOf;
                                            int i14 = iLastIndexOf + 1;
                                            xz0Var.f34736c = i14;
                                            spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i14, 0);
                                        }
                                        SpannableStringBuilder spannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                        b2Var.P = spannable;
                                        b2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new zr(26, be0Var3, tL_auth_passwordRecovery));
                                        Dialog dialogShowDialog = ig0Var.showDialog(b2Var);
                                        if (dialogShowDialog != null) {
                                            dialogShowDialog.setCanceledOnTouchOutside(false);
                                            dialogShowDialog.setCancelable(false);
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = be0Var3.f36803y;
                                be0Var3.h = false;
                                if (tL_error2 == null || !"SRP_ID_INVALID".equals(tL_error2.text)) {
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                        ig0Var2.v1(false, true);
                                        be0Var3.postDelayed(new a30(24, be0Var3, tLObject2), 150L);
                                        break;
                                    } else {
                                        ig0Var2.k1(false, true);
                                        if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                            if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            } else {
                                                int iIntValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                                            }
                                            break;
                                        } else if (ig0Var2.getParentActivity() != null) {
                                            be0Var3.f36793a.setText("");
                                            ig0.U0(ig0Var2, be0Var3.f36802x, true);
                                            break;
                                        }
                                    }
                                } else {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(new TL_account.getPassword(), new zd0(be0Var3, i13), 8);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final be0 be0Var3 = this.f45146b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i13 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        be0 be0Var4 = be0Var3;
                        int i14 = 0;
                        switch (i13) {
                            case 0:
                                be0Var4.getClass();
                                if (tL_error2 == null) {
                                    be0Var4.f36798n = (TL_account.Password) tLObject2;
                                    be0Var4.h(null);
                                }
                                break;
                            case 1:
                                ig0 ig0Var = be0Var4.f36803y;
                                ig0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    } else {
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        ig0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                    }
                                    break;
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ig0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                                        int iIndexOf = str.indexOf(42);
                                        int iLastIndexOf = str.lastIndexOf(42);
                                        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                            org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                                            xz0Var.f34734a |= 256;
                                            xz0Var.f34735b = iIndexOf;
                                            int i15 = iLastIndexOf + 1;
                                            xz0Var.f34736c = i15;
                                            spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i15, 0);
                                        }
                                        SpannableStringBuilder spannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                        b2Var.P = spannable;
                                        b2Var.N = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new zr(26, be0Var4, tL_auth_passwordRecovery));
                                        Dialog dialogShowDialog = ig0Var.showDialog(b2Var);
                                        if (dialogShowDialog != null) {
                                            dialogShowDialog.setCanceledOnTouchOutside(false);
                                            dialogShowDialog.setCancelable(false);
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = be0Var4.f36803y;
                                be0Var4.h = false;
                                if (tL_error2 == null || !"SRP_ID_INVALID".equals(tL_error2.text)) {
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                        ig0Var2.v1(false, true);
                                        be0Var4.postDelayed(new a30(24, be0Var4, tLObject2), 150L);
                                        break;
                                    } else {
                                        ig0Var2.k1(false, true);
                                        if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                            if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            } else {
                                                int iIntValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                                ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                                            }
                                            break;
                                        } else if (ig0Var2.getParentActivity() != null) {
                                            be0Var4.f36793a.setText("");
                                            ig0.U0(ig0Var2, be0Var4.f36802x, true);
                                            break;
                                        }
                                    }
                                } else {
                                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(new TL_account.getPassword(), new zd0(be0Var4, i14), 8);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
