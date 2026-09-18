package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wi implements Runnable {
    public final int f39046a;
    public final xi f39047b;
    public final int f39048c;
    public final boolean d;
    public final org.telegram.ui.Components.gk0 e;
    public final float f39049f;
    public final float h;
    public final zg.p0 f39050n;

    public wi(xi xiVar, int i10, boolean z10, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.f39046a = i11;
        this.f39047b = xiVar;
        this.f39048c = i10;
        this.d = z10;
        this.e = gk0Var;
        this.f39049f = f7;
        this.h = f10;
        this.f39050n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39046a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wi(this.f39047b, this.f39048c, this.d, this.e, this.f39049f, this.h, this.f39050n, 1), 50L);
                return;
            default:
                bo boVar = this.f39047b.f39656s;
                org.telegram.ui.Cells.a0 q82 = boVar.q8(this.f39048c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    zg.l0.d(boVar, this.e, q82, null, this.f39049f, this.h, this.f39050n, i10, 1);
                    zg.l0.f();
                    return;
                }
                return;
        }
    }
}
