package yg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.eo;
import w7.a6;
public final class t implements Runnable {
    public final int f47144a;
    public final v f47145b;

    public t(v vVar, int i10) {
        this.f47144a = i10;
        this.f47145b = vVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f47144a) {
            case 0:
                this.f47145b.c(true);
                return;
            default:
                v vVar = this.f47145b;
                vVar.e = vVar.b();
                int i12 = vVar.f47150f;
                int i13 = vVar.h;
                eo eoVar = vVar.f47147a;
                if (vVar.f47148b == null) {
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
                    eo eoVar2 = vVar.f47147a;
                    ?? pk0Var = new pk0(i10, eoVar.getCurrentAccount(), vVar.getContext(), eoVar2, eoVar.getResourceProvider());
                    pk0Var.l1 = 1.0f;
                    pk0Var.setWillNotDraw(false);
                    vVar.f47148b = pk0Var;
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
                    pk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    vVar.f47148b.setDelegate(new o0.b(vVar));
                    vVar.f47148b.setClipChildren(false);
                    vVar.f47148b.setClipToPadding(false);
                    vVar.addView(vVar.f47148b, a6.e(-2, i12 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f47148b.isEnabled()) {
                    vVar.f47155x = true;
                    vVar.f47148b.p(vVar.e, eoVar.Z7, true);
                    vVar.f47148b.r(false);
                    return;
                }
                vVar.f47155x = false;
                vVar.f47148b.setTransitionProgress(1.0f);
                return;
        }
    }
}
