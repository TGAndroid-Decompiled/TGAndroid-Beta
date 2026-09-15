package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f38626a;
    public final wi f38627b;
    public final int f38628c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 e;
    public final float f38629f;
    public final float h;
    public final zg.p0 f38630n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.f38626a = i11;
        this.f38627b = wiVar;
        this.f38628c = i10;
        this.d = z10;
        this.e = fk0Var;
        this.f38629f = f7;
        this.h = f10;
        this.f38630n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38626a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f38627b, this.f38628c, this.d, this.e, this.f38629f, this.h, this.f38630n, 1), 50L);
                return;
            default:
                bo boVar = this.f38627b.f39239s;
                org.telegram.ui.Cells.a0 q82 = boVar.q8(this.f38628c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    zg.l0.d(boVar, this.e, q82, null, this.f38629f, this.h, this.f38630n, i10, 1);
                    zg.l0.f();
                    return;
                }
                return;
        }
    }
}
