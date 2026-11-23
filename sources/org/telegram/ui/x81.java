package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class x81 implements zh.c, org.telegram.messenger.xo, r0.m, org.telegram.ui.Components.tj0 {
    public final w91 f53885a;

    public x81(w91 w91Var) {
        this.f53885a = w91Var;
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        return w91.Z(this.f53885a, tL_error);
    }

    @Override
    public void e(boolean z10, boolean z11) {
        w91 w91Var = this.f53885a;
        w91Var.V0.j(w91Var.S0.b(), z10, z11);
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        return w91.b0(this.f53885a, view, f10);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        int i7 = l1Var.f56381a.f(519).d;
        w91 w91Var = this.f53885a;
        w91Var.f53236h1 = i7;
        s91 s91Var = w91Var.f53257s0;
        if (s91Var != null) {
            s91Var.setPadding(0, 0, 0, i7);
        }
        s81 s81Var = w91Var.f53245n;
        if (s81Var != null) {
            ((TextView) s81Var.d).setTranslationY((-w91Var.f53236h1) - w91Var.f53234g1);
        }
        w91Var.h.setTranslationY(((-w91Var.Y0) - w91Var.f53236h1) - w91Var.f53234g1);
        w91Var.F0();
        return r0.l1.f56380b;
    }

    @Override
    public void l(float f10) {
    }

    @Override
    public void h() {
    }
}
