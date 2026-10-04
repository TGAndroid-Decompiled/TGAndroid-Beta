package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class vc0 implements org.telegram.ui.Components.bu0 {
    public final gd0 f41697a;

    public vc0(gd0 gd0Var) {
        this.f41697a = gd0Var;
    }

    @Override
    public final void P() {
        int c02;
        boolean z10;
        gd0 gd0Var = this.f41697a;
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
        if (uc0Var.f10801i0 != z10) {
            uc0Var.f10801i0 = z10;
            uc0Var.l();
            gd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.zl0 f() {
        return this.f41697a.U;
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
    public final void C() {
    }
}
