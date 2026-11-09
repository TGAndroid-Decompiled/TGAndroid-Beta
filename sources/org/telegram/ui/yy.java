package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class yy extends org.telegram.ui.Cells.n4 {
    public final iz D;
    public final TextView f52355r;
    public final bi.rc f52356s;
    public int f52357w;
    public final org.telegram.ui.Components.z4 f52358x;
    public boolean f52359y;

    public yy(org.telegram.ui.iz r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.<init>(org.telegram.ui.iz, android.content.Context):void");
    }

    public final void d(int i7, boolean z9) {
        int i10;
        boolean z10;
        float f10;
        iz izVar = this.D;
        if (izVar.getUserConfig().q()) {
            i10 = 2131750620;
        } else {
            i10 = 2131750619;
        }
        String M0 = org.telegram.messenger.id.M0(i10, null);
        TextView textView = this.f52355r;
        textView.setText(M0);
        int i11 = 0;
        if (i7 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.l6.f28126r8;
            i11 = izVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f52357w = i11;
        bi.rc rcVar = this.f52356s;
        if (!z10) {
            rcVar.setEmojiColor(i11);
        }
        if (!z9) {
            this.f52358x.a(this.f52357w, true);
        }
        if (z10 != this.f52359y) {
            this.f52359y = z10;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = rcVar.animate();
            if (!z10) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(xqVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z9) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        bi.rc rcVar = this.f52356s;
        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, rcVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z9 && !org.telegram.messenger.id.f23157a0) {
            z10 = true;
        }
        rcVar.c(m10, z10, true);
    }
}
