package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class va1 implements Runnable {
    public final int f50625a;
    public final za1 f50626b;
    public final TLRPC.TL_error f50627c;

    public va1(za1 za1Var, TLRPC.TL_error tL_error, int i7) {
        this.f50625a = i7;
        this.f50626b = za1Var;
        this.f50627c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i7 = this.f50625a;
        TLRPC.TL_error tL_error = this.f50627c;
        za1 za1Var = this.f50626b;
        switch (i7) {
            case 0:
                za1Var.B0();
                if (tL_error == null) {
                    za1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new ra1(za1Var, 3));
                    String M0 = org.telegram.messenger.id.M0(2131747437, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.T = M0;
                    u1Var.R = org.telegram.messenger.id.M0(2131743934, null);
                    Dialog showDialog = za1Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    za1Var.L0(org.telegram.messenger.id.M0(2131743934, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    za1Var.L0(org.telegram.messenger.id.M0(2131743934, null), tL_error.text);
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
                        G2 = org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, G2));
                    return;
                } else {
                    za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
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
