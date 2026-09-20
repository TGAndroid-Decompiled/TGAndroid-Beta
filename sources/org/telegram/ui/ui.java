package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ui implements Runnable {
    public final int f38096a;
    public final vi f38097b;
    public final int f38098c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38099f;
    public final float h;
    public final zg.o0 f38100n;

    public ui(vi viVar, int i10, boolean z10, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f38096a = i11;
        this.f38097b = viVar;
        this.f38098c = i10;
        this.d = z10;
        this.e = pk0Var;
        this.f38099f = f7;
        this.h = f10;
        this.f38100n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38096a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ui(this.f38097b, this.f38098c, this.d, this.e, this.f38099f, this.h, this.f38100n, 1), 50L);
                return;
            default:
                zn znVar = this.f38097b.f38564s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.f38098c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.k0.d(znVar, this.e, q82, null, this.f38099f, this.h, this.f38100n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
