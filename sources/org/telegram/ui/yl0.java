package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yl0 extends n11 {
    public final bm0 f53538f2;
    public final e11[] f53539g2;
    public final cm0 f53540h2;

    public yl0(cm0 cm0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, bm0 bm0Var, e11[] e11VarArr) {
        super(e2Var, context, true, num, i7, true, e6Var, i10, i11);
        this.f53540h2 = cm0Var;
        this.f53538f2 = bm0Var;
        this.f53539g2 = e11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        cm0 cm0Var = this.f53540h2;
        if (tL_starGiftUnique != null) {
            if (cm0Var.f46207n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    cm0Var.f46212s = (TLRPC.TL_peerColorCollectible) peerColor;
                    cm0Var.f46211r = null;
                } else {
                    return;
                }
            } else {
                cm0Var.f46212s = null;
                cm0Var.f46211r = org.telegram.messenger.np.q0(tL_starGiftUnique);
            }
            cm0Var.J = null;
            cm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            cm0Var.f46206n = longValue;
            cm0Var.f46211r = null;
            cm0Var.f46212s = null;
            cm0Var.J = null;
        }
        bm0 bm0Var = this.f53538f2;
        if (bm0Var != null) {
            bm0Var.b(true);
        }
        cm0Var.j(true);
        cm0Var.i();
        cm0Var.f(true);
        e11 e11Var = this.f53539g2[0];
        if (e11Var != null) {
            cm0Var.f46209p0 = null;
            e11Var.dismiss();
        }
    }
}
