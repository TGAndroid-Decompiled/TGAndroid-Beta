package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class yz extends org.telegram.ui.Cells.p4 {
    public final i00 D;
    public final TextView f43918r;
    public final xz f43919s;
    public int f43920w;
    public final org.telegram.ui.Components.w4 f43921x;
    public boolean f43922y;

    public yz(org.telegram.ui.i00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yz.<init>(org.telegram.ui.i00, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        i00 i00Var = this.D;
        if (i00Var.getUserConfig().q()) {
            i11 = 2131750621;
        } else {
            i11 = 2131750620;
        }
        String L0 = org.telegram.messenger.cd.L0(i11, null);
        TextView textView = this.f43918r;
        textView.setText(L0);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.t6.f21188r8;
            i12 = i00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.f43920w = i12;
        xz xzVar = this.f43919s;
        if (!z11) {
            xzVar.setEmojiColor(i12);
        }
        if (!z10) {
            this.f43921x.a(this.f43920w, true);
        }
        if (z11 != this.f43922y) {
            this.f43922y = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = xzVar.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(grVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        xz xzVar = this.f43919s;
        CharSequence m10 = org.telegram.messenger.k6.m(charSequence, xzVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.cd.X) {
            z11 = true;
        }
        xzVar.c(m10, z11, true);
    }
}
