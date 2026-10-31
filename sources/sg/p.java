package sg;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.un;
import w7.b6;
public final class p implements Runnable {
    public final int f48436a;
    public final s f48437b;

    public p(s sVar, int i10) {
        this.f48436a = i10;
        this.f48437b = sVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f48436a) {
            case 0:
                this.f48437b.c(true);
                return;
            default:
                s sVar = this.f48437b;
                sVar.e = sVar.b();
                int i12 = sVar.f48468f;
                int i13 = sVar.h;
                un unVar = sVar.f48465a;
                if (sVar.f48466b == null) {
                    if (unVar.getUserConfig().e() == unVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ?? mj0Var = new mj0(i10, unVar.getCurrentAccount(), sVar.getContext(), sVar.f48465a, unVar.getResourceProvider());
                    mj0Var.f48460m1 = 1.0f;
                    mj0Var.setWillNotDraw(false);
                    sVar.f48466b = mj0Var;
                    int L = org.telegram.messenger.i0.L(4.0f);
                    if (cd.X) {
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                    int i14 = L + i11;
                    int L2 = org.telegram.messenger.i0.L(4.0f);
                    int L3 = org.telegram.messenger.i0.L(4.0f);
                    if (!cd.X) {
                        i13 = 0;
                    }
                    mj0Var.setPadding(i14, L2, L3 + i13, org.telegram.messenger.i0.L(i12));
                    sVar.f48466b.setDelegate(new n2.u(sVar, 25));
                    sVar.f48466b.setClipChildren(false);
                    sVar.f48466b.setClipToPadding(false);
                    sVar.addView(sVar.f48466b, b6.e(-2, i12 + 70, 5));
                }
                sVar.c(false);
                if (sVar.f48466b.isEnabled()) {
                    sVar.f48474y = true;
                    sVar.f48466b.p(sVar.e, unVar.f42374p8, true);
                    sVar.f48466b.r(false);
                    return;
                }
                sVar.f48474y = false;
                sVar.f48466b.setTransitionProgress(1.0f);
                return;
        }
    }
}
