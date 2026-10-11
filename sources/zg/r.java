package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.zn;
import w7.x5;
public final class r implements Runnable {
    public final int f54746a;
    public final t f54747b;

    public r(t tVar, int i10) {
        this.f54746a = i10;
        this.f54747b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f54746a) {
            case 0:
                this.f54747b.c(true);
                return;
            default:
                t tVar = this.f54747b;
                tVar.f54752e = tVar.b();
                int i12 = tVar.f54753f;
                int i13 = tVar.h;
                zn znVar = tVar.f54749a;
                if (tVar.f54750b == null) {
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
                    ?? ml0Var = new ml0(i10, znVar.getCurrentAccount(), tVar.getContext(), tVar.f54749a, znVar.getResourceProvider());
                    ml0Var.l1 = 1.0f;
                    ml0Var.setWillNotDraw(false);
                    tVar.f54750b = ml0Var;
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
                    ml0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f54750b.setDelegate(new m2.t(tVar, 25));
                    tVar.f54750b.setClipChildren(false);
                    tVar.f54750b.setClipToPadding(false);
                    tVar.addView(tVar.f54750b, x5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f54750b.isEnabled()) {
                    tVar.f54758x = true;
                    tVar.f54750b.p(tVar.f54752e, znVar.Z7, true);
                    tVar.f54750b.r(false);
                    return;
                }
                tVar.f54758x = false;
                tVar.f54750b.setTransitionProgress(1.0f);
                return;
        }
    }
}
