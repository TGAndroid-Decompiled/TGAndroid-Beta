package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class sc0 implements org.telegram.ui.Components.kt0 {
    public final dd0 f37239a;

    public sc0(dd0 dd0Var) {
        this.f37239a = dd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        dd0 dd0Var = this.f37239a;
        tc0 tc0Var = dd0Var.K0;
        if (tc0Var == null) {
            c02 = 0;
        } else {
            c02 = tc0Var.c0(8);
        }
        dd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        rc0 rc0Var = dd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rc0Var.f9920i0 != z10) {
            rc0Var.f9920i0 = z10;
            rc0Var.l();
            dd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.ml0 f() {
        return this.f37239a.U;
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
