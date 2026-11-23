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
public final class ub0 implements RequestDelegate {
    public final int f52618a;
    public final wb0 f52619b;

    public ub0(wb0 wb0Var, int i7) {
        this.f52618a = i7;
        this.f52619b = wb0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52618a) {
            case 0:
                final wb0 wb0Var = this.f52619b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wb0 wb0Var2 = wb0Var;
                        switch (i10) {
                            case 0:
                                wb0Var2.getClass();
                                if (tL_error2 == null) {
                                    wb0Var2.f53283n = (TL_account.Password) tLObject2;
                                    wb0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                de0 de0Var = wb0Var2.E;
                                de0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (de0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f34924a |= 256;
                                            obj.f34925b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f34926c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.fz0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.gd.N0(2131745884, null), valueOf);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                        t1Var.U = m0;
                                        t1Var.S = org.telegram.messenger.gd.N0(2131745882, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new zs(23, wb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = de0Var.showDialog(t1Var);
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
                                        G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131742589, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
                                    return;
                                } else {
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
                                    return;
                                }
                            default:
                                de0 de0Var2 = wb0Var2.E;
                                wb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new ub0(wb0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    de0Var2.N1(false, true);
                                    wb0Var2.postDelayed(new i50(22, wb0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    de0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (de0Var2.getParentActivity() != null) {
                                            wb0Var2.f53278a.setText("");
                                            de0.c1(de0Var2, wb0Var2.f53288y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G2));
                                        return;
                                    } else {
                                        de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final wb0 wb0Var2 = this.f52619b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wb0 wb0Var22 = wb0Var2;
                        switch (i10) {
                            case 0:
                                wb0Var22.getClass();
                                if (tL_error2 == null) {
                                    wb0Var22.f53283n = (TL_account.Password) tLObject2;
                                    wb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                de0 de0Var = wb0Var22.E;
                                de0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (de0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f34924a |= 256;
                                            obj.f34925b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f34926c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.fz0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.gd.N0(2131745884, null), valueOf);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                        t1Var.U = m0;
                                        t1Var.S = org.telegram.messenger.gd.N0(2131745882, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new zs(23, wb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = de0Var.showDialog(t1Var);
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
                                        G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131742589, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
                                    return;
                                } else {
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
                                    return;
                                }
                            default:
                                de0 de0Var2 = wb0Var22.E;
                                wb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new ub0(wb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    de0Var2.N1(false, true);
                                    wb0Var22.postDelayed(new i50(22, wb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    de0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (de0Var2.getParentActivity() != null) {
                                            wb0Var22.f53278a.setText("");
                                            de0.c1(de0Var2, wb0Var22.f53288y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G2));
                                        return;
                                    } else {
                                        de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final wb0 wb0Var3 = this.f52619b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i7;
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wb0 wb0Var22 = wb0Var3;
                        switch (i10) {
                            case 0:
                                wb0Var22.getClass();
                                if (tL_error2 == null) {
                                    wb0Var22.f53283n = (TL_account.Password) tLObject2;
                                    wb0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                de0 de0Var = wb0Var22.E;
                                de0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (de0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f34924a |= 256;
                                            obj.f34925b = indexOf;
                                            int i11 = lastIndexOf + 1;
                                            obj.f34926c = i11;
                                            valueOf.setSpan(new org.telegram.ui.Components.fz0(obj, 0), indexOf, i11, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.gd.N0(2131745884, null), valueOf);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                        t1Var.U = m0;
                                        t1Var.S = org.telegram.messenger.gd.N0(2131745882, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new zs(23, wb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = de0Var.showDialog(t1Var);
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
                                        G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131742589, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
                                    return;
                                } else {
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
                                    return;
                                }
                            default:
                                de0 de0Var2 = wb0Var22.E;
                                wb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new ub0(wb0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    de0Var2.N1(false, true);
                                    wb0Var22.postDelayed(new i50(22, wb0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    de0Var2.C1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (de0Var2.getParentActivity() != null) {
                                            wb0Var22.f53278a.setText("");
                                            de0.c1(de0Var2, wb0Var22.f53288y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G2));
                                        return;
                                    } else {
                                        de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error2.text);
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
