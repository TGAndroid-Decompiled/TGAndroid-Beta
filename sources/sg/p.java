package sg;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.un;
import w7.b6;
public final class p implements Runnable {
    public final int f48447a;
    public final s f48448b;

    public p(s sVar, int i10) {
        this.f48447a = i10;
        this.f48448b = sVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f48447a) {
            case 0:
                this.f48448b.c(true);
                return;
            default:
                s sVar = this.f48448b;
                sVar.e = sVar.b();
                int i12 = sVar.f48479f;
                int i13 = sVar.h;
                un unVar = sVar.f48476a;
                if (sVar.f48477b == null) {
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
                    ?? nj0Var = new nj0(i10, unVar.getCurrentAccount(), sVar.getContext(), sVar.f48476a, unVar.getResourceProvider());
                    nj0Var.f48471m1 = 1.0f;
                    nj0Var.setWillNotDraw(false);
                    sVar.f48477b = nj0Var;
                    int L = org.telegram.messenger.i0.L(4.0f);
                    if (dd.X) {
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                    int i14 = L + i11;
                    int L2 = org.telegram.messenger.i0.L(4.0f);
                    int L3 = org.telegram.messenger.i0.L(4.0f);
                    if (!dd.X) {
                        i13 = 0;
                    }
                    nj0Var.setPadding(i14, L2, L3 + i13, org.telegram.messenger.i0.L(i12));
                    sVar.f48477b.setDelegate(new n2.u(sVar, 25));
                    sVar.f48477b.setClipChildren(false);
                    sVar.f48477b.setClipToPadding(false);
                    sVar.addView(sVar.f48477b, b6.e(-2, i12 + 70, 5));
                }
                sVar.c(false);
                if (sVar.f48477b.isEnabled()) {
                    sVar.f48485y = true;
                    sVar.f48477b.p(sVar.e, unVar.f42185p8, true);
                    sVar.f48477b.r(false);
                    return;
                }
                sVar.f48485y = false;
                sVar.f48477b.setTransitionProgress(1.0f);
                return;
        }
    }
}
