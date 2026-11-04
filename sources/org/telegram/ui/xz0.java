package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xz0 implements org.telegram.ui.Components.ij0 {
    public final int f52131a;
    public final Context f52132b;
    public final org.telegram.ui.ActionBar.e6 f52133c;
    public final Integer d;
    public final g11 f52134e;

    public xz0(g11 g11Var, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        this.f52134e = g11Var;
        this.f52131a = i3;
        this.f52132b = context;
        this.f52133c = e6Var;
        this.d = num;
    }

    @Override
    public final boolean mo20b(float f10, float f11, int i3, View view) {
        g11 g11Var = this.f52134e;
        int i10 = g11Var.W;
        int i11 = this.f52131a;
        if (i11 != 11 && i11 != 13 && g11Var.f45457i1) {
            boolean z10 = view instanceof q01;
            if (z10 && (i11 == 1 || i11 == 8)) {
                g11Var.l();
                try {
                    g11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                q01 q01Var = (q01) view;
                if (!q01Var.f48724s && !org.telegram.messenger.h10.i(i10).q()) {
                    org.telegram.ui.Components.p5 p5Var = q01Var.f48720e;
                    TLRPC.Document document = p5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.g5.e(i10, p5Var.documentId);
                    }
                    g11Var.p(q01Var, Long.valueOf(q01Var.f48720e.documentId), document, q01Var.f48725w, null);
                    return true;
                }
                g11Var.T0 = q01Var;
                g11Var.V0 = 0.0f;
                g11Var.U0 = false;
                if (q01Var.f48724s) {
                    g11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(i10).f24045r.get(g11Var.T0.f48727y.f9097f);
                    if (tL_availableReaction != null) {
                        g11Var.W0.r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", g11Var.T0.f48727y, 0);
                    }
                } else {
                    g11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.g5(4, i10, g11Var.T0.f48720e.documentId));
                }
                g11Var.f45456i0.invalidate();
                g11Var.m();
                return true;
            } else if (z10) {
                q01 q01Var2 = (q01) view;
                if (q01Var2.f48720e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = q01Var2.f48725w;
                    wz0 wz0Var = new wz0(this, this.f52132b, g11Var.V1, g11Var, q01Var2, this.f52133c, view, tL_starGiftUnique);
                    g11Var.Y0 = wz0Var;
                    wz0Var.show();
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
        g11 g11Var = this.f52134e;
        if (g11Var.T0 != null) {
            g11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new xy0(this, 4));
            ofFloat.addListener(new y20(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            ofFloat.start();
        }
    }

    @Override
    public final void r(float f10) {
    }
}
