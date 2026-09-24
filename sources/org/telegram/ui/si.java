package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class si implements Runnable {
    public final int f37782a;
    public final ti f37783b;
    public final int f37784c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 e;
    public final float f37785f;
    public final float h;
    public final zg.o0 f37786n;

    public si(ti tiVar, int i10, boolean z10, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f37782a = i11;
        this.f37783b = tiVar;
        this.f37784c = i10;
        this.d = z10;
        this.e = qk0Var;
        this.f37785f = f7;
        this.h = f10;
        this.f37786n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37782a) {
            case 0:
                AndroidUtilities.runOnUIThread(new si(this.f37783b, this.f37784c, this.d, this.e, this.f37785f, this.h, this.f37786n, 1), 50L);
                return;
            default:
                wn wnVar = this.f37783b.f38120s;
                org.telegram.ui.Cells.a0 q82 = wnVar.q8(this.f37784c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    zg.k0.d(wnVar, this.e, q82, null, this.f37785f, this.h, this.f37786n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
