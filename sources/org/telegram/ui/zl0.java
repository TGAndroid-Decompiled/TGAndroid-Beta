package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zl0 extends n11 {
    public final cm0 f53952f2;
    public final e11[] f53953g2;
    public final dm0 f53954h2;

    public zl0(dm0 dm0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, cm0 cm0Var, e11[] e11VarArr) {
        super(e2Var, context, true, num, i7, true, e6Var, i10, i11);
        this.f53954h2 = dm0Var;
        this.f53952f2 = cm0Var;
        this.f53953g2 = e11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        dm0 dm0Var = this.f53954h2;
        if (tL_starGiftUnique != null) {
            if (dm0Var.f46416n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    dm0Var.f46421s = (TLRPC.TL_peerColorCollectible) peerColor;
                    dm0Var.f46420r = null;
                } else {
                    return;
                }
            } else {
                dm0Var.f46421s = null;
                dm0Var.f46420r = org.telegram.messenger.np.q0(tL_starGiftUnique);
            }
            dm0Var.J = null;
            dm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            dm0Var.f46415n = longValue;
            dm0Var.f46420r = null;
            dm0Var.f46421s = null;
            dm0Var.J = null;
        }
        cm0 cm0Var = this.f53952f2;
        if (cm0Var != null) {
            cm0Var.b(true);
        }
        dm0Var.j(true);
        dm0Var.i();
        dm0Var.f(true);
        e11 e11Var = this.f53953g2[0];
        if (e11Var != null) {
            dm0Var.f46418p0 = null;
            e11Var.dismiss();
        }
    }
}
