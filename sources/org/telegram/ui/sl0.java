package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sl0 extends g11 {
    public final vl0 f49534f2;
    public final x01[] f49535g2;
    public final wl0 f49536h2;

    public sl0(wl0 wl0Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, vl0 vl0Var, x01[] x01VarArr) {
        super(d2Var, context, true, num, i3, true, e6Var, i10, i11);
        this.f49536h2 = wl0Var;
        this.f49534f2 = vl0Var;
        this.f49535g2 = x01VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        wl0 wl0Var = this.f49536h2;
        if (tL_starGiftUnique != null) {
            if (wl0Var.f51218n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    wl0Var.f51223s = (TLRPC.TL_peerColorCollectible) peerColor;
                    wl0Var.f51222r = null;
                } else {
                    return;
                }
            } else {
                wl0Var.f51223s = null;
                wl0Var.f51222r = org.telegram.messenger.hp.q0(tL_starGiftUnique);
            }
            wl0Var.J = null;
            wl0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            wl0Var.f51217n = longValue;
            wl0Var.f51222r = null;
            wl0Var.f51223s = null;
            wl0Var.J = null;
        }
        vl0 vl0Var = this.f49534f2;
        if (vl0Var != null) {
            vl0Var.b(true);
        }
        wl0Var.j(true);
        wl0Var.i();
        wl0Var.f(true);
        x01 x01Var = this.f49535g2[0];
        if (x01Var != null) {
            wl0Var.f51220p0 = null;
            x01Var.dismiss();
        }
    }
}
