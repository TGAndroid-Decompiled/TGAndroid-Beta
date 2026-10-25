package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s41 implements org.telegram.ui.Components.cm0 {
    public final int f43351a;
    public final Context f43352b;
    public final org.telegram.ui.ActionBar.u6 f43353c;
    public final Integer d;
    public final c61 e;

    public s41(c61 c61Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, Integer num) {
        this.e = c61Var;
        this.f43351a = i10;
        this.f43352b = context;
        this.f43353c = u6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17e(float f7, float f10, int i10, View view) {
        c61 c61Var = this.e;
        int i11 = c61Var.V;
        int i12 = this.f43351a;
        if (i12 != 11 && i12 != 13 && c61Var.f38297h1) {
            boolean z10 = view instanceof l51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                c61Var.l();
                try {
                    c61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                l51 l51Var = (l51) view;
                if (!l51Var.f41144s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.c6 c6Var = l51Var.e;
                    TLRPC.Document document = c6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.t5.f(i11, c6Var.documentId);
                    }
                    c61Var.p(l51Var, Long.valueOf(l51Var.e.documentId), document, l51Var.v, null);
                    return true;
                }
                c61Var.S0 = l51Var;
                c61Var.U0 = 0.0f;
                c61Var.T0 = false;
                if (l51Var.f41144s) {
                    c61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(c61Var.S0.f41146x.f4208f);
                    if (tL_availableReaction != null) {
                        c61Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", c61Var.S0.f41146x, 0);
                    }
                } else {
                    c61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.t5(4, i11, c61Var.S0.e.documentId));
                }
                c61Var.f38296h0.invalidate();
                c61Var.m();
                return true;
            } else if (z10) {
                l51 l51Var2 = (l51) view;
                if (l51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = l51Var2.v;
                    r41 r41Var = new r41(this, this.f43352b, c61Var.U1, c61Var, l51Var2, this.f43353c, view, tL_starGiftUnique);
                    c61Var.X0 = r41Var;
                    r41Var.show();
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
    public final void g() {
        c61 c61Var = this.e;
        if (c61Var.S0 != null) {
            c61Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(c61Var.U0, 0.0f);
            ofFloat.addUpdateListener(new v11(this, 5));
            ofFloat.addListener(new i50(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27584f);
            ofFloat.start();
        }
    }

    @Override
    public final void o(float f7) {
    }
}
