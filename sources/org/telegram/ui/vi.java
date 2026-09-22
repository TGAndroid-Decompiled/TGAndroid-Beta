package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f38558a;
    public final wi f38559b;
    public final int f38560c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 e;
    public final float f38561f;
    public final float h;
    public final zg.p0 f38562n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.f38558a = i11;
        this.f38559b = wiVar;
        this.f38560c = i10;
        this.d = z10;
        this.e = fk0Var;
        this.f38561f = f7;
        this.h = f10;
        this.f38562n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38558a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f38559b, this.f38560c, this.d, this.e, this.f38561f, this.h, this.f38562n, 1), 50L);
                return;
            default:
                bo boVar = this.f38559b.f39241s;
                org.telegram.ui.Cells.a0 q82 = boVar.q8(this.f38560c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    zg.l0.d(boVar, this.e, q82, null, this.f38561f, this.h, this.f38562n, i10, 1);
                    zg.l0.f();
                    return;
                }
                return;
        }
    }
}
