package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class va1 implements Runnable {
    public final int f52932a;
    public final za1 f52933b;
    public final TLRPC.TL_error f52934c;

    public va1(za1 za1Var, TLRPC.TL_error tL_error, int i7) {
        this.f52932a = i7;
        this.f52933b = za1Var;
        this.f52934c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i7 = this.f52932a;
        TLRPC.TL_error tL_error = this.f52934c;
        za1 za1Var = this.f52933b;
        switch (i7) {
            case 0:
                za1Var.B0();
                if (tL_error == null) {
                    za1Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new ra1(za1Var, 3));
                    String N0 = org.telegram.messenger.gd.N0(2131747242, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.U = N0;
                    t1Var.S = org.telegram.messenger.gd.N0(2131743684, null);
                    Dialog showDialog = za1Var.showDialog(t1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G));
                    return;
                } else {
                    za1Var.L0(org.telegram.messenger.gd.N0(2131743684, null), tL_error.text);
                    return;
                }
            case 1:
                za1Var.B0();
                if (tL_error == null) {
                    if (za1Var.getParentActivity() != null) {
                        za1Var.z0(new qa1(za1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    za1Var.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.gd.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.gd.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    za1Var.L0(org.telegram.messenger.gd.N0(2131689472, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, G2));
                    return;
                } else {
                    za1Var.L0(org.telegram.messenger.gd.N0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                za1.j0(za1Var, tL_error);
                return;
            default:
                za1.e0(za1Var, tL_error);
                return;
        }
    }
}
