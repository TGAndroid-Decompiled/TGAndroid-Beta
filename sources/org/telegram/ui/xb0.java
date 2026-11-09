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
public final class xb0 implements RequestDelegate {
    public final int f51618a;
    public final zb0 f51619b;

    public xb0(zb0 zb0Var, int i7) {
        this.f51618a = i7;
        this.f51619b = zb0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51618a) {
            case 0:
                final zb0 zb0Var = this.f51619b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        zb0 zb0Var2 = zb0Var;
                        switch (i10) {
                            case 0:
                                zb0Var2.getClass();
                                if (tL_error2 == null) {
                                    zb0Var2.f52489n = (TL_account.Password) tLObject2;
                                    zb0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ee0 ee0Var = zb0Var2.D;
                                ee0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ee0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f39836a |= 256;
                                            obj.f39837b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f39838c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.wy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746080, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746078, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new ru(20, zb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = ee0Var.showDialog(u1Var);
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
                                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131742860, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                                    return;
                                } else {
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    return;
                                }
                            default:
                                ee0 ee0Var2 = zb0Var2.D;
                                zb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xb0(zb0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ee0Var2.N1(false, true);
                                    zb0Var2.postDelayed(new s10(25, zb0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    ee0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ee0Var2.getParentActivity() != null) {
                                            zb0Var2.f52484a.setText("");
                                            ee0.c1(ee0Var2, zb0Var2.f52494y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G2));
                                        return;
                                    } else {
                                        ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final zb0 zb0Var2 = this.f51619b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        zb0 zb0Var22 = zb0Var2;
                        switch (i10) {
                            case 0:
                                zb0Var22.getClass();
                                if (tL_error2 == null) {
                                    zb0Var22.f52489n = (TL_account.Password) tLObject2;
                                    zb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ee0 ee0Var = zb0Var22.D;
                                ee0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ee0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f39836a |= 256;
                                            obj.f39837b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f39838c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.wy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746080, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746078, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new ru(20, zb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ee0Var.showDialog(u1Var);
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
                                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131742860, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                                    return;
                                } else {
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    return;
                                }
                            default:
                                ee0 ee0Var2 = zb0Var22.D;
                                zb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xb0(zb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ee0Var2.N1(false, true);
                                    zb0Var22.postDelayed(new s10(25, zb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ee0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ee0Var2.getParentActivity() != null) {
                                            zb0Var22.f52484a.setText("");
                                            ee0.c1(ee0Var2, zb0Var22.f52494y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G2));
                                        return;
                                    } else {
                                        ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final zb0 zb0Var3 = this.f51619b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        zb0 zb0Var22 = zb0Var3;
                        switch (i10) {
                            case 0:
                                zb0Var22.getClass();
                                if (tL_error2 == null) {
                                    zb0Var22.f52489n = (TL_account.Password) tLObject2;
                                    zb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                ee0 ee0Var = zb0Var22.D;
                                ee0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ee0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f39836a |= 256;
                                            obj.f39837b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f39838c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.wy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746080, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746078, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new ru(20, zb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ee0Var.showDialog(u1Var);
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
                                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131742860, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                                    return;
                                } else {
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    return;
                                }
                            default:
                                ee0 ee0Var2 = zb0Var22.D;
                                zb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xb0(zb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    ee0Var2.N1(false, true);
                                    zb0Var22.postDelayed(new s10(25, zb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    ee0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (ee0Var2.getParentActivity() != null) {
                                            zb0Var22.f52484a.setText("");
                                            ee0.c1(ee0Var2, zb0Var22.f52494y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G2));
                                        return;
                                    } else {
                                        ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
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
