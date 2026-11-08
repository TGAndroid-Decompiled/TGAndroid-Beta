package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xl0 extends q11 {
    public final am0 f51899e2;
    public final h11[] f51900f2;
    public final bm0 f51901g2;

    public xl0(bm0 bm0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, am0 am0Var, h11[] h11VarArr) {
        super(f2Var, context, true, num, i7, true, f6Var, i10, i11);
        this.f51901g2 = bm0Var;
        this.f51899e2 = am0Var;
        this.f51900f2 = h11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        bm0 bm0Var = this.f51901g2;
        if (tL_starGiftUnique != null) {
            if (bm0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    bm0Var.f44451s = (TLRPC.TL_peerColorCollectible) peerColor;
                    bm0Var.f44450r = null;
                } else {
                    return;
                }
            } else {
                bm0Var.f44451s = null;
                bm0Var.f44450r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
            }
            bm0Var.I = null;
            bm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            bm0Var.f44446n = longValue;
            bm0Var.f44450r = null;
            bm0Var.f44451s = null;
            bm0Var.I = null;
        }
        am0 am0Var = this.f51899e2;
        if (am0Var != null) {
            am0Var.b(true);
        }
        bm0Var.j(true);
        bm0Var.i();
        bm0Var.f(true);
        h11 h11Var = this.f51900f2[0];
        if (h11Var != null) {
            bm0Var.f44448o0 = null;
            h11Var.dismiss();
        }
    }
}
