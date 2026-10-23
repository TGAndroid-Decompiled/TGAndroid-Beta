package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r41 implements org.telegram.ui.Components.dm0 {
    public final int f41015a;
    public final Context f41016b;
    public final org.telegram.ui.ActionBar.g6 f41017c;
    public final Integer d;
    public final b61 e;

    public r41(b61 b61Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.e = b61Var;
        this.f41015a = i10;
        this.f41016b = context;
        this.f41017c = g6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        b61 b61Var = this.e;
        int i11 = b61Var.V;
        int i12 = this.f41015a;
        if (i12 != 11 && i12 != 13 && b61Var.f35906h1) {
            boolean z10 = view instanceof k51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                b61Var.l();
                try {
                    b61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                k51 k51Var = (k51) view;
                if (!k51Var.f38828s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.a6 a6Var = k51Var.e;
                    TLRPC.Document document = a6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.r5.f(i11, a6Var.documentId);
                    }
                    b61Var.p(k51Var, Long.valueOf(k51Var.e.documentId), document, k51Var.v, null);
                    return true;
                }
                b61Var.S0 = k51Var;
                b61Var.U0 = 0.0f;
                b61Var.T0 = false;
                if (k51Var.f38828s) {
                    b61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(b61Var.S0.f38830x.f784f);
                    if (tL_availableReaction != null) {
                        b61Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", b61Var.S0.f38830x, 0);
                    }
                } else {
                    b61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.r5(4, i11, b61Var.S0.e.documentId));
                }
                b61Var.f35905h0.invalidate();
                b61Var.m();
                return true;
            } else if (z10) {
                k51 k51Var2 = (k51) view;
                if (k51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = k51Var2.v;
                    q41 q41Var = new q41(this, this.f41016b, b61Var.U1, b61Var, k51Var2, this.f41017c, view, tL_starGiftUnique);
                    b61Var.X0 = q41Var;
                    q41Var.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void h() {
        b61 b61Var = this.e;
        if (b61Var.S0 != null) {
            b61Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(b61Var.U0, 0.0f);
            ofFloat.addUpdateListener(new g11(this, 6));
            ofFloat.addListener(new v70(this, 25));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f25133f);
            ofFloat.start();
        }
    }

    @Override
    public final void o(float f7) {
    }
}
