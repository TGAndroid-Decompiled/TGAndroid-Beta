package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class zc0 implements org.telegram.ui.Components.vt0 {
    public final kd0 f40179a;

    public zc0(kd0 kd0Var) {
        this.f40179a = kd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        kd0 kd0Var = this.f40179a;
        ad0 ad0Var = kd0Var.K0;
        if (ad0Var == null) {
            c02 = 0;
        } else {
            c02 = ad0Var.c0(8);
        }
        kd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        yc0 yc0Var = kd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (yc0Var.f9938i0 != z10) {
            yc0Var.f9938i0 = z10;
            yc0Var.l();
            kd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.vl0 f() {
        return this.f40179a.U;
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
