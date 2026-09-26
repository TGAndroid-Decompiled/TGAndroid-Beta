package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class si implements Runnable {
    public final int f37796a;
    public final ti f37797b;
    public final int f37798c;
    public final boolean d;
    public final org.telegram.ui.Components.rk0 e;
    public final float f37799f;
    public final float h;
    public final zg.o0 f37800n;

    public si(ti tiVar, int i10, boolean z10, org.telegram.ui.Components.rk0 rk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f37796a = i11;
        this.f37797b = tiVar;
        this.f37798c = i10;
        this.d = z10;
        this.e = rk0Var;
        this.f37799f = f7;
        this.h = f10;
        this.f37800n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37796a) {
            case 0:
                AndroidUtilities.runOnUIThread(new si(this.f37797b, this.f37798c, this.d, this.e, this.f37799f, this.h, this.f37800n, 1), 50L);
                return;
            default:
                wn wnVar = this.f37797b.f38136s;
                org.telegram.ui.Cells.a0 q82 = wnVar.q8(this.f37798c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    zg.k0.d(wnVar, this.e, q82, null, this.f37799f, this.h, this.f37800n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
