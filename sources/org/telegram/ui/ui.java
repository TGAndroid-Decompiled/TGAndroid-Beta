package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ui implements Runnable {
    public final int f38010a;
    public final vi f38011b;
    public final int f38012c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 e;
    public final float f38013f;
    public final float h;
    public final zg.o0 f38014n;

    public ui(vi viVar, int i10, boolean z10, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f38010a = i11;
        this.f38011b = viVar;
        this.f38012c = i10;
        this.d = z10;
        this.e = qk0Var;
        this.f38013f = f7;
        this.h = f10;
        this.f38014n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38010a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ui(this.f38011b, this.f38012c, this.d, this.e, this.f38013f, this.h, this.f38014n, 1), 50L);
                return;
            default:
                zn znVar = this.f38011b.f38567s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.f38012c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.k0.d(znVar, this.e, q82, null, this.f38013f, this.h, this.f38014n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
