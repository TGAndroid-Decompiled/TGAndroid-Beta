package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t41 implements org.telegram.ui.Components.cl0 {
    public final int f42547a;
    public final Context f42548b;
    public final org.telegram.ui.ActionBar.c6 f42549c;
    public final Integer d;
    public final d61 f42550e;

    public t41(d61 d61Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        this.f42550e = d61Var;
        this.f42547a = i10;
        this.f42548b = context;
        this.f42549c = c6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17b(float f9, float f10, int i10, View view) {
        d61 d61Var = this.f42550e;
        int i11 = d61Var.R;
        int i12 = this.f42547a;
        if (i12 != 11 && i12 != 13 && d61Var.f37327d1) {
            boolean z10 = view instanceof m51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                d61Var.l();
                try {
                    d61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                m51 m51Var = (m51) view;
                if (!m51Var.f40433s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.y5 y5Var = m51Var.f40429e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.f(i11, y5Var.documentId);
                    }
                    d61Var.p(m51Var, Long.valueOf(m51Var.f40429e.documentId), document, m51Var.v, null);
                    return true;
                }
                d61Var.O0 = m51Var;
                d61Var.Q0 = 0.0f;
                d61Var.P0 = false;
                if (m51Var.f40433s) {
                    d61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(d61Var.O0.f40435x.f13825f);
                    if (tL_availableReaction != null) {
                        d61Var.R0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", d61Var.O0.f40435x, 0);
                    }
                } else {
                    d61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i11, d61Var.O0.f40429e.documentId));
                }
                d61Var.f37326d0.invalidate();
                d61Var.m();
                return true;
            } else if (z10) {
                m51 m51Var2 = (m51) view;
                if (m51Var2.f40429e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = m51Var2.v;
                    s41 s41Var = new s41(this, this.f42548b, d61Var.P1, d61Var, m51Var2, this.f42549c, view, tL_starGiftUnique);
                    d61Var.T0 = s41Var;
                    s41Var.show();
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
        d61 d61Var = this.f42550e;
        if (d61Var.O0 != null) {
            d61Var.P0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(d61Var.Q0, 0.0f);
            ofFloat.addUpdateListener(new w01(this, 8));
            ofFloat.addListener(new e50(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            ofFloat.start();
        }
    }

    @Override
    public final void r(float f9) {
    }
}
