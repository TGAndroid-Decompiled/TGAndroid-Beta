package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class rc0 implements org.telegram.ui.Components.wt0 {
    public final cd0 f37296a;

    public rc0(cd0 cd0Var) {
        this.f37296a = cd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        cd0 cd0Var = this.f37296a;
        sc0 sc0Var = cd0Var.K0;
        if (sc0Var == null) {
            c02 = 0;
        } else {
            c02 = sc0Var.c0(8);
        }
        cd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        qc0 qc0Var = cd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qc0Var.f9919i0 != z10) {
            qc0Var.f9919i0 = z10;
            qc0Var.l();
            cd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.xl0 f() {
        return this.f37296a.U;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void E() {
    }
}
