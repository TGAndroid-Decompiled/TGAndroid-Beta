package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z11 implements org.telegram.ui.Components.jk0 {
    public final int f43981a;
    public final Context f43982b;
    public final org.telegram.ui.ActionBar.p6 f43983c;
    public final Integer d;
    public final i31 e;

    public z11(i31 i31Var, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        this.e = i31Var;
        this.f43981a = i10;
        this.f43982b = context;
        this.f43983c = p6Var;
        this.d = num;
    }

    @Override
    public final boolean mo16b(float f7, float f10, int i10, View view) {
        i31 i31Var = this.e;
        int i11 = i31Var.V;
        int i12 = this.f43981a;
        if (i12 != 11 && i12 != 13 && i31Var.f38130h1) {
            boolean z10 = view instanceof s21;
            if (z10 && (i12 == 1 || i12 == 8)) {
                i31Var.l();
                try {
                    i31Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                s21 s21Var = (s21) view;
                if (!s21Var.f41362s && !org.telegram.messenger.d20.i(i11).q()) {
                    org.telegram.ui.Components.o5 o5Var = s21Var.e;
                    TLRPC.Document document = o5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.f5.e(i11, o5Var.documentId);
                    }
                    i31Var.p(s21Var, Long.valueOf(s21Var.e.documentId), document, s21Var.f41363w, null);
                    return true;
                }
                i31Var.S0 = s21Var;
                i31Var.U0 = 0.0f;
                i31Var.T0 = false;
                if (s21Var.f41362s) {
                    i31Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i11).f18341r.get(i31Var.S0.f41365y.f48434f);
                    if (tL_availableReaction != null) {
                        i31Var.V0.r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", i31Var.S0.f41365y, 0);
                    }
                } else {
                    i31Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.f5(4, i11, i31Var.S0.e.documentId));
                }
                i31Var.f38129h0.invalidate();
                i31Var.m();
                return true;
            } else if (z10) {
                s21 s21Var2 = (s21) view;
                if (s21Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = s21Var2.f41363w;
                    y11 y11Var = new y11(this, this.f43982b, i31Var.U1, i31Var, s21Var2, this.f43983c, view, tL_starGiftUnique);
                    i31Var.X0 = y11Var;
                    y11Var.show();
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
        i31 i31Var = this.e;
        if (i31Var.S0 != null) {
            i31Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(i31Var.U0, 0.0f);
            ofFloat.addUpdateListener(new u01(this, 4));
            ofFloat.addListener(new ns0(this, 7));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            ofFloat.start();
        }
    }

    @Override
    public final void p(float f7) {
    }
}
