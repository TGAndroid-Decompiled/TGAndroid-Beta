package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class rc0 implements org.telegram.ui.Components.jt0 {
    public final cd0 f37797a;

    public rc0(cd0 cd0Var) {
        this.f37797a = cd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z4;
        cd0 cd0Var = this.f37797a;
        sc0 sc0Var = cd0Var.H0;
        if (sc0Var == null) {
            c02 = 0;
        } else {
            c02 = sc0Var.c0(8);
        }
        cd0Var.I0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        qc0 qc0Var = cd0Var.Q;
        if (c02 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (qc0Var.f44801f0 != z4) {
            qc0Var.f44801f0 = z4;
            qc0Var.l();
            cd0Var.R.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.rl0 f() {
        return this.f37797a.R;
    }

    @Override
    public final TLRPC.Chat g() {
        return null;
    }

    @Override
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z4, boolean z10, View view) {
        return false;
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final void E() {
    }
}
