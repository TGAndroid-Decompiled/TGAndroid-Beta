package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class rp0 extends j71 {
    public final up0 f40218d2;
    public final a71[] f40219e2;
    public final vp0 f40220f2;

    public rp0(vp0 vp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, up0 up0Var, a71[] a71VarArr) {
        super(n2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.f40220f2 = vp0Var;
        this.f40218d2 = up0Var;
        this.f40219e2 = a71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        vp0 vp0Var = this.f40220f2;
        if (tL_starGiftUnique != null) {
            if (vp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    vp0Var.f41621s = (TLRPC.TL_peerColorCollectible) peerColor;
                    vp0Var.f41620r = null;
                } else {
                    return;
                }
            } else {
                vp0Var.f41621s = null;
                vp0Var.f41620r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            vp0Var.I = null;
            vp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            vp0Var.f41616n = longValue;
            vp0Var.f41620r = null;
            vp0Var.f41621s = null;
            vp0Var.I = null;
        }
        up0 up0Var = this.f40218d2;
        if (up0Var != null) {
            up0Var.b(true);
        }
        vp0Var.j(true);
        vp0Var.i();
        vp0Var.f(true);
        a71 a71Var = this.f40219e2[0];
        if (a71Var != null) {
            vp0Var.f41618o0 = null;
            a71Var.dismiss();
        }
    }
}
