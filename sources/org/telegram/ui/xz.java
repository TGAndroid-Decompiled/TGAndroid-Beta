package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class xz extends org.telegram.ui.Cells.p4 {
    public final h00 D;
    public final TextView f43484r;
    public final wz f43485s;
    public int f43486w;
    public final org.telegram.ui.Components.w4 f43487x;
    public boolean f43488y;

    public xz(org.telegram.ui.h00 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xz.<init>(org.telegram.ui.h00, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        h00 h00Var = this.D;
        if (h00Var.getUserConfig().q()) {
            i11 = 2131750621;
        } else {
            i11 = 2131750620;
        }
        String L0 = org.telegram.messenger.dd.L0(i11, null);
        TextView textView = this.f43484r;
        textView.setText(L0);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.t6.f21189r8;
            i12 = h00Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.f43486w = i12;
        wz wzVar = this.f43485s;
        if (!z11) {
            wzVar.setEmojiColor(i12);
        }
        if (!z10) {
            this.f43487x.a(this.f43486w, true);
        }
        if (z11 != this.f43488y) {
            this.f43488y = z11;
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
            ViewPropertyAnimator animate2 = wzVar.animate();
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
        wz wzVar = this.f43485s;
        CharSequence m10 = org.telegram.messenger.k6.m(charSequence, wzVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.dd.X) {
            z11 = true;
        }
        wzVar.c(m10, z11, true);
    }
}
