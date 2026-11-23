package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zl0 extends q11 {
    public final cm0 f54646f2;
    public final h11[] f54647g2;
    public final dm0 f54648h2;

    public zl0(dm0 dm0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, cm0 cm0Var, h11[] h11VarArr) {
        super(g2Var, context, true, num, i7, true, i6Var, i10, i11);
        this.f54648h2 = dm0Var;
        this.f54646f2 = cm0Var;
        this.f54647g2 = h11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        dm0 dm0Var = this.f54648h2;
        if (tL_starGiftUnique != null) {
            if (dm0Var.f47182n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    dm0Var.f47187s = (TLRPC.TL_peerColorCollectible) peerColor;
                    dm0Var.f47186r = null;
                } else {
                    return;
                }
            } else {
                dm0Var.f47187s = null;
                dm0Var.f47186r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
            }
            dm0Var.J = null;
            dm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            dm0Var.f47181n = longValue;
            dm0Var.f47186r = null;
            dm0Var.f47187s = null;
            dm0Var.J = null;
        }
        cm0 cm0Var = this.f54646f2;
        if (cm0Var != null) {
            cm0Var.b(true);
        }
        dm0Var.j(true);
        dm0Var.i();
        dm0Var.f(true);
        h11 h11Var = this.f54647g2[0];
        if (h11Var != null) {
            dm0Var.f47184p0 = null;
            h11Var.dismiss();
        }
    }
}
