package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zl0 extends s11 {
    public final cm0 f52594e2;
    public final j11[] f52595f2;
    public final dm0 f52596g2;

    public zl0(dm0 dm0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11, cm0 cm0Var, j11[] j11VarArr) {
        super(f2Var, context, true, num, i7, true, g6Var, i10, i11);
        this.f52596g2 = dm0Var;
        this.f52594e2 = cm0Var;
        this.f52595f2 = j11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        dm0 dm0Var = this.f52596g2;
        if (tL_starGiftUnique != null) {
            if (dm0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    dm0Var.f45080s = (TLRPC.TL_peerColorCollectible) peerColor;
                    dm0Var.f45079r = null;
                } else {
                    return;
                }
            } else {
                dm0Var.f45080s = null;
                dm0Var.f45079r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
            }
            dm0Var.I = null;
            dm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            dm0Var.f45075n = longValue;
            dm0Var.f45079r = null;
            dm0Var.f45080s = null;
            dm0Var.I = null;
        }
        cm0 cm0Var = this.f52594e2;
        if (cm0Var != null) {
            cm0Var.b(true);
        }
        dm0Var.j(true);
        dm0Var.i();
        dm0Var.f(true);
        j11 j11Var = this.f52595f2[0];
        if (j11Var != null) {
            dm0Var.f45077o0 = null;
            j11Var.dismiss();
        }
    }
}
