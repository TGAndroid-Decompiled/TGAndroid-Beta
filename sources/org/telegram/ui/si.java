package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class si implements Runnable {
    public final int f37893a;
    public final ti f37894b;
    public final int f37895c;
    public final boolean d;
    public final org.telegram.ui.Components.tk0 e;
    public final float f37896f;
    public final float h;
    public final zg.o0 f37897n;

    public si(ti tiVar, int i10, boolean z10, org.telegram.ui.Components.tk0 tk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f37893a = i11;
        this.f37894b = tiVar;
        this.f37895c = i10;
        this.d = z10;
        this.e = tk0Var;
        this.f37896f = f7;
        this.h = f10;
        this.f37897n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37893a) {
            case 0:
                AndroidUtilities.runOnUIThread(new si(this.f37894b, this.f37895c, this.d, this.e, this.f37896f, this.h, this.f37897n, 1), 50L);
                return;
            default:
                wn wnVar = this.f37894b.f38247s;
                org.telegram.ui.Cells.a0 q82 = wnVar.q8(this.f37895c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    zg.k0.d(wnVar, this.e, q82, null, this.f37896f, this.h, this.f37897n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
