package zg;

import m.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.eo;
import w7.w5;
public final class r implements Runnable {
    public final int f54891a;
    public final t f54892b;

    public r(t tVar, int i10) {
        this.f54891a = i10;
        this.f54892b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f54891a) {
            case 0:
                this.f54892b.c(true);
                return;
            default:
                t tVar = this.f54892b;
                tVar.f54897e = tVar.b();
                int i12 = tVar.f54898f;
                int i13 = tVar.h;
                eo eoVar = tVar.f54894a;
                if (tVar.f54895b == null) {
                    if (eoVar.getUserConfig().getClientUserId() == eoVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ?? nl0Var = new nl0(i10, eoVar.getCurrentAccount(), tVar.getContext(), tVar.f54894a, eoVar.getResourceProvider());
                    nl0Var.l1 = 1.0f;
                    nl0Var.setWillNotDraw(false);
                    tVar.f54895b = nl0Var;
                    int dp = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                    int i14 = dp + i11;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i13 = 0;
                    }
                    nl0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f54895b.setDelegate(new y0(tVar, 28));
                    tVar.f54895b.setClipChildren(false);
                    tVar.f54895b.setClipToPadding(false);
                    tVar.addView(tVar.f54895b, w5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f54895b.isEnabled()) {
                    tVar.f54903x = true;
                    tVar.f54895b.p(tVar.f54897e, eoVar.Z7, true);
                    tVar.f54895b.r(false);
                    return;
                }
                tVar.f54903x = false;
                tVar.f54895b.setTransitionProgress(1.0f);
                return;
        }
    }
}
