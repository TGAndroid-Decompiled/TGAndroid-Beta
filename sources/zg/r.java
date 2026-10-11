package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.zn;
import w7.x5;
public final class r implements Runnable {
    public final int f54780a;
    public final t f54781b;

    public r(t tVar, int i10) {
        this.f54780a = i10;
        this.f54781b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f54780a) {
            case 0:
                this.f54781b.c(true);
                return;
            default:
                t tVar = this.f54781b;
                tVar.f54786e = tVar.b();
                int i12 = tVar.f54787f;
                int i13 = tVar.h;
                zn znVar = tVar.f54783a;
                if (tVar.f54784b == null) {
                    if (znVar.getUserConfig().getClientUserId() == znVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ?? ll0Var = new ll0(i10, znVar.getCurrentAccount(), tVar.getContext(), tVar.f54783a, znVar.getResourceProvider());
                    ll0Var.l1 = 1.0f;
                    ll0Var.setWillNotDraw(false);
                    tVar.f54784b = ll0Var;
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
                    ll0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f54784b.setDelegate(new m2.t(tVar, 25));
                    tVar.f54784b.setClipChildren(false);
                    tVar.f54784b.setClipToPadding(false);
                    tVar.addView(tVar.f54784b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f54784b.isEnabled()) {
                    tVar.f54792x = true;
                    tVar.f54784b.p(tVar.f54786e, znVar.Z7, true);
                    tVar.f54784b.r(false);
                    return;
                }
                tVar.f54792x = false;
                tVar.f54784b.setTransitionProgress(1.0f);
                return;
        }
    }
}
