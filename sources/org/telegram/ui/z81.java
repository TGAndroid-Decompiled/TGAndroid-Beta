package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class z81 implements zh.c, org.telegram.messenger.xo, r0.m, org.telegram.ui.Components.tj0 {
    public final y91 f54495a;

    public z81(y91 y91Var) {
        this.f54495a = y91Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = l1Var.f56299a.f(519).d;
        y91 y91Var = this.f54495a;
        y91Var.f54115h1 = i7;
        u91 u91Var = y91Var.f54136s0;
        if (u91Var != null) {
            u91Var.setPadding(0, 0, 0, i7);
        }
        u81 u81Var = y91Var.f54124n;
        if (u81Var != null) {
            ((TextView) u81Var.d).setTranslationY((-y91Var.f54115h1) - y91Var.f54113g1);
        }
        y91Var.h.setTranslationY(((-y91Var.Y0) - y91Var.f54115h1) - y91Var.f54113g1);
        y91Var.F0();
        return r0.l1.f56298b;
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        return y91.Z(this.f54495a, tL_error);
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        return y91.b0(this.f54495a, view, f10);
    }

    @Override
    public void g(boolean z10, boolean z11) {
        y91 y91Var = this.f54495a;
        y91Var.V0.j(y91Var.S0.b(), z10, z11);
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void j() {
    }
}
