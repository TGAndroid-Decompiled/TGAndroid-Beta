package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class uc0 implements org.telegram.ui.Components.xt0 {
    public final fd0 f38205a;

    public uc0(fd0 fd0Var) {
        this.f38205a = fd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        fd0 fd0Var = this.f38205a;
        vc0 vc0Var = fd0Var.K0;
        if (vc0Var == null) {
            c02 = 0;
        } else {
            c02 = vc0Var.c0(8);
        }
        fd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        tc0 tc0Var = fd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (tc0Var.f9925i0 != z10) {
            tc0Var.f9925i0 = z10;
            tc0Var.l();
            fd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.yl0 f() {
        return this.f38205a.U;
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
