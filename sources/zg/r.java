package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.wn;
import w7.y5;
public final class r implements Runnable {
    public final int f49437a;
    public final t f49438b;

    public r(t tVar, int i10) {
        this.f49437a = i10;
        this.f49438b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f49437a) {
            case 0:
                this.f49438b.c(true);
                return;
            default:
                t tVar = this.f49438b;
                tVar.e = tVar.b();
                int i12 = tVar.f49444f;
                int i13 = tVar.h;
                wn wnVar = tVar.f49441a;
                if (tVar.f49442b == null) {
                    if (wnVar.getUserConfig().getClientUserId() == wnVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    wn wnVar2 = tVar.f49441a;
                    ?? sk0Var = new sk0(i10, wnVar.getCurrentAccount(), tVar.getContext(), wnVar2, wnVar.getResourceProvider());
                    sk0Var.l1 = 1.0f;
                    sk0Var.setWillNotDraw(false);
                    tVar.f49442b = sk0Var;
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
                    sk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    tVar.f49442b.setDelegate(new n2.e(tVar, 28));
                    tVar.f49442b.setClipChildren(false);
                    tVar.f49442b.setClipToPadding(false);
                    tVar.addView(tVar.f49442b, y5.e(-2, i12 + 70, 5));
                }
                tVar.c(false);
                if (tVar.f49442b.isEnabled()) {
                    tVar.f49449x = true;
                    tVar.f49442b.p(tVar.e, wnVar.Z7, true);
                    tVar.f49442b.r(false);
                    return;
                }
                tVar.f49449x = false;
                tVar.f49442b.setTransitionProgress(1.0f);
                return;
        }
    }
}
