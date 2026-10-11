package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class vc0 implements org.telegram.ui.Components.ou0 {
    public final gd0 f43008a;

    public vc0(gd0 gd0Var) {
        this.f43008a = gd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        gd0 gd0Var = this.f43008a;
        wc0 wc0Var = gd0Var.K0;
        if (wc0Var == null) {
            c02 = 0;
        } else {
            c02 = wc0Var.c0(8);
        }
        gd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        uc0 uc0Var = gd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (uc0Var.f10803i0 != z10) {
            uc0Var.f10803i0 = z10;
            uc0Var.l();
            gd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.rm0 f() {
        return this.f43008a.U;
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
    public final boolean q() {
        return true;
    }

    @Override
    public final void E() {
    }
}
