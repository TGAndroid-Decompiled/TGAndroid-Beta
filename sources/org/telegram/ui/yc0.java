package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class yc0 implements org.telegram.ui.Components.wt0 {
    public final jd0 f39786a;

    public yc0(jd0 jd0Var) {
        this.f39786a = jd0Var;
    }

    @Override
    public final void R() {
        int c02;
        boolean z10;
        jd0 jd0Var = this.f39786a;
        zc0 zc0Var = jd0Var.K0;
        if (zc0Var == null) {
            c02 = 0;
        } else {
            c02 = zc0Var.c0(8);
        }
        jd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        xc0 xc0Var = jd0Var.T;
        if (c02 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (xc0Var.f9937i0 != z10) {
            xc0Var.f9937i0 = z10;
            xc0Var.l();
            jd0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.wl0 f() {
        return this.f39786a.U;
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
