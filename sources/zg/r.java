package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.zn;
import w7.x5;
public final class r implements Runnable {
    public final int f54657a;
    public final t f54658b;

    public r(t tVar, int i10) {
        this.f54657a = i10;
        this.f54658b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f54657a) {
            case 0:
                this.f54658b.c(true);
                return;
            default:
                t tVar = this.f54658b;
                tVar.f54663e = tVar.b();
                int i12 = tVar.f54664f;
                int i13 = tVar.h;
                zn znVar = tVar.f54660a;
                if (tVar.f54661b == null) {
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
                    ?? kl0Var = new kl0(i10, znVar.getCurrentAccount(), tVar.getContext(), tVar.f54660a, znVar.getResourceProvider());
                    kl0Var.l1 = 1.0f;
                    kl0Var.setWillNotDraw(false);
                    tVar.f54661b = kl0Var;
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
                    kl0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f54661b.setDelegate(new m2.t(tVar, 25));
                    tVar.f54661b.setClipChildren(false);
                    tVar.f54661b.setClipToPadding(false);
                    tVar.addView(tVar.f54661b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f54661b.isEnabled()) {
                    tVar.f54669x = true;
                    tVar.f54661b.p(tVar.f54663e, znVar.Z7, true);
                    tVar.f54661b.r(false);
                    return;
                }
                tVar.f54669x = false;
                tVar.f54661b.setTransitionProgress(1.0f);
                return;
        }
    }
}
