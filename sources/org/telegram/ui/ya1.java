package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ya1 implements Runnable {
    public final int f51985a;
    public final cb1 f51986b;
    public final TLRPC.TL_error f51987c;

    public ya1(cb1 cb1Var, TLRPC.TL_error tL_error, int i7) {
        this.f51985a = i7;
        this.f51986b = cb1Var;
        this.f51987c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i7 = this.f51985a;
        TLRPC.TL_error tL_error = this.f51987c;
        cb1 cb1Var = this.f51986b;
        switch (i7) {
            case 0:
                cb1Var.B0();
                if (tL_error == null) {
                    cb1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cb1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new ua1(cb1Var, 3));
                    String M0 = org.telegram.messenger.id.M0(2131747436, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.T = M0;
                    u1Var.R = org.telegram.messenger.id.M0(2131743931, null);
                    Dialog showDialog = cb1Var.showDialog(u1Var);
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
                    cb1Var.L0(org.telegram.messenger.id.M0(2131743931, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G));
                    return;
                } else {
                    cb1Var.L0(org.telegram.messenger.id.M0(2131743931, null), tL_error.text);
                    return;
                }
            case 1:
                cb1Var.B0();
                if (tL_error == null) {
                    if (cb1Var.getParentActivity() != null) {
                        cb1Var.z0(new ta1(cb1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    cb1Var.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    cb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, G2));
                    return;
                } else {
                    cb1Var.L0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                cb1.j0(cb1Var, tL_error);
                return;
            default:
                cb1.e0(cb1Var, tL_error);
                return;
        }
    }
}
