package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements org.telegram.ui.Components.jt0 {
    public final id0 f42712a;

    public xc0(id0 id0Var) {
        this.f42712a = id0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        id0 id0Var = this.f42712a;
        yc0 yc0Var = id0Var.K0;
        if (yc0Var == null) {
            c02 = 0;
        } else {
            c02 = yc0Var.c0(8);
        }
        id0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        wc0 wc0Var = id0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (wc0Var.f11286i0 != z10) {
            wc0Var.f11286i0 = z10;
            wc0Var.l();
            id0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.ll0 f() {
        return this.f42712a.U;
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
    public final void D() {
    }
}
