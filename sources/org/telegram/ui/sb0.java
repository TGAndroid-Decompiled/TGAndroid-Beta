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
public final class sb0 implements RequestDelegate {
    public final int f49467a;
    public final vb0 f49468b;

    public sb0(vb0 vb0Var, int i3) {
        this.f49467a = i3;
        this.f49468b = vb0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49467a) {
            case 0:
                final vb0 vb0Var = this.f49468b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i3;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        vb0 vb0Var2 = vb0Var;
                        switch (i10) {
                            case 0:
                                vb0Var2.getClass();
                                if (tL_error2 == null) {
                                    vb0Var2.f50446n = (TL_account.Password) tLObject2;
                                    vb0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                xd0 xd0Var = vb0Var2.E;
                                xd0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (xd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f38578a |= 256;
                                            obj.f38579b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f38580c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746090, null), valueOf);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.U = m0;
                                        s1Var.S = org.telegram.messenger.bd.M0(2131746088, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new rb0(0, vb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = xd0Var.showDialog(s1Var);
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
                                        G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131742870, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    return;
                                }
                            default:
                                xd0 xd0Var2 = vb0Var2.E;
                                vb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new sb0(vb0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    xd0Var2.E1(false, true);
                                    vb0Var2.postDelayed(new tb0(0, vb0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    xd0Var2.t1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (xd0Var2.getParentActivity() != null) {
                                            vb0Var2.f50441a.setText("");
                                            xd0.b1(xd0Var2, vb0Var2.f50451y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final vb0 vb0Var2 = this.f49468b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i3;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        vb0 vb0Var22 = vb0Var2;
                        switch (i10) {
                            case 0:
                                vb0Var22.getClass();
                                if (tL_error2 == null) {
                                    vb0Var22.f50446n = (TL_account.Password) tLObject2;
                                    vb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                xd0 xd0Var = vb0Var22.E;
                                xd0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (xd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f38578a |= 256;
                                            obj.f38579b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f38580c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746090, null), valueOf);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.U = m0;
                                        s1Var.S = org.telegram.messenger.bd.M0(2131746088, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new rb0(0, vb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = xd0Var.showDialog(s1Var);
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
                                        G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131742870, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    return;
                                }
                            default:
                                xd0 xd0Var2 = vb0Var22.E;
                                vb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new sb0(vb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    xd0Var2.E1(false, true);
                                    vb0Var22.postDelayed(new tb0(0, vb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    xd0Var2.t1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (xd0Var2.getParentActivity() != null) {
                                            vb0Var22.f50441a.setText("");
                                            xd0.b1(xd0Var2, vb0Var22.f50451y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final vb0 vb0Var3 = this.f49468b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i3;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        vb0 vb0Var22 = vb0Var3;
                        switch (i10) {
                            case 0:
                                vb0Var22.getClass();
                                if (tL_error2 == null) {
                                    vb0Var22.f50446n = (TL_account.Password) tLObject2;
                                    vb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                xd0 xd0Var = vb0Var22.E;
                                xd0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (xd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f38578a |= 256;
                                            obj.f38579b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f38580c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.uy0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746090, null), valueOf);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.U = m0;
                                        s1Var.S = org.telegram.messenger.bd.M0(2131746088, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new rb0(0, vb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = xd0Var.showDialog(s1Var);
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
                                        G = org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131742870, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    return;
                                }
                            default:
                                xd0 xd0Var2 = vb0Var22.E;
                                vb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new sb0(vb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    xd0Var2.E1(false, true);
                                    vb0Var22.postDelayed(new tb0(0, vb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    xd0Var2.t1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (xd0Var2.getParentActivity() != null) {
                                            vb0Var22.f50441a.setText("");
                                            xd0.b1(xd0Var2, vb0Var22.f50451y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.bd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.bd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
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
