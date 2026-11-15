package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class xy extends org.telegram.ui.Cells.n4 {
    public final hz E;
    public final TextView f53346r;
    public final di.ab f53347s;
    public int f53348w;
    public final org.telegram.ui.Components.x4 f53349x;
    public boolean f53350y;

    public xy(org.telegram.ui.hz r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xy.<init>(org.telegram.ui.hz, android.content.Context):void");
    }

    public final void d(int i7, boolean z10) {
        int i10;
        boolean z11;
        float f10;
        hz hzVar = this.E;
        if (hzVar.getUserConfig().q()) {
            i10 = 2131750620;
        } else {
            i10 = 2131750619;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        TextView textView = this.f53346r;
        textView.setText(M0);
        int i11 = 0;
        if (i7 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
            i11 = hzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f53348w = i11;
        di.ab abVar = this.f53347s;
        if (!z11) {
            abVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.f53349x.a(this.f53348w, true);
        }
        if (z11 != this.f53350y) {
            this.f53350y = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            duration.setInterpolator(erVar).start();
            ViewPropertyAnimator animate2 = abVar.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(erVar).start();
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
        di.ab abVar = this.f53347s;
        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, abVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.hd.f24101a0) {
            z11 = true;
        }
        abVar.c(m10, z11, true);
    }
}
