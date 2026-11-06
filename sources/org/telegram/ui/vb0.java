package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vb0 implements RequestDelegate {
    public final int f50679a;
    public final xb0 f50680b;

    public vb0(xb0 xb0Var, int i7) {
        this.f50679a = i7;
        this.f50680b = xb0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50679a) {
            case 0:
                final xb0 xb0Var = this.f50680b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xb0 xb0Var2 = xb0Var;
                        switch (i10) {
                            case 0:
                                xb0Var2.getClass();
                                if (tL_error2 == null) {
                                    xb0Var2.f51806n = (TL_account.Password) tLObject2;
                                    xb0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ce0 ce0Var = xb0Var2.D;
                                ce0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ce0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f38442a |= 256;
                                            obj.f38443b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f38444c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.hd.M0(2131746081, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.hd.M0(2131746079, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new pu(20, xb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = ce0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.z(tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131742861, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                    return;
                                }
                            default:
                                ce0 ce0Var2 = xb0Var2.D;
                                xb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vb0(xb0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ce0Var2.N1(false, true);
                                    xb0Var2.postDelayed(new q10(25, xb0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    ce0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ce0Var2.getParentActivity() != null) {
                                            xb0Var2.f51801a.setText("");
                                            ce0.c1(ce0Var2, xb0Var2.f51811y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final xb0 xb0Var2 = this.f50680b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xb0 xb0Var22 = xb0Var2;
                        switch (i10) {
                            case 0:
                                xb0Var22.getClass();
                                if (tL_error2 == null) {
                                    xb0Var22.f51806n = (TL_account.Password) tLObject2;
                                    xb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ce0 ce0Var = xb0Var22.D;
                                ce0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ce0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f38442a |= 256;
                                            obj.f38443b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f38444c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.hd.M0(2131746081, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.hd.M0(2131746079, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new pu(20, xb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ce0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.z(tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131742861, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                    return;
                                }
                            default:
                                ce0 ce0Var2 = xb0Var22.D;
                                xb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vb0(xb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ce0Var2.N1(false, true);
                                    xb0Var22.postDelayed(new q10(25, xb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ce0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ce0Var2.getParentActivity() != null) {
                                            xb0Var22.f51801a.setText("");
                                            ce0.c1(ce0Var2, xb0Var22.f51811y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final xb0 xb0Var3 = this.f50680b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xb0 xb0Var22 = xb0Var3;
                        switch (i10) {
                            case 0:
                                xb0Var22.getClass();
                                if (tL_error2 == null) {
                                    xb0Var22.f51806n = (TL_account.Password) tLObject2;
                                    xb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ce0 ce0Var = xb0Var22.D;
                                ce0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ce0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f38442a |= 256;
                                            obj.f38443b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f38444c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.hd.M0(2131746081, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.hd.M0(2131746079, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new pu(20, xb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ce0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.z(tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131742861, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                    return;
                                }
                            default:
                                ce0 ce0Var2 = xb0Var22.D;
                                xb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vb0(xb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ce0Var2.N1(false, true);
                                    xb0Var22.postDelayed(new q10(25, xb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ce0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ce0Var2.getParentActivity() != null) {
                                            xb0Var22.f51801a.setText("");
                                            ce0.c1(ce0Var2, xb0Var22.f51811y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
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
