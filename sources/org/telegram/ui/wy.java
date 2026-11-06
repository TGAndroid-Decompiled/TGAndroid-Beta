package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class wy extends org.telegram.ui.Cells.n4 {
    public final gz D;
    public final TextView f51674r;
    public final bi.rc f51675s;
    public int f51676w;
    public final org.telegram.ui.Components.z4 f51677x;
    public boolean f51678y;

    public wy(org.telegram.ui.gz r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.<init>(org.telegram.ui.gz, android.content.Context):void");
    }

    public final void d(int i7, boolean z9) {
        int i10;
        boolean z10;
        float f10;
        gz gzVar = this.D;
        if (gzVar.getUserConfig().q()) {
            i10 = 2131750621;
        } else {
            i10 = 2131750620;
        }
        String M0 = org.telegram.messenger.hd.M0(i10, null);
        TextView textView = this.f51674r;
        textView.setText(M0);
        int i11 = 0;
        if (i7 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f28109r8;
            i11 = gzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f51676w = i11;
        bi.rc rcVar = this.f51675s;
        if (!z10) {
            rcVar.setEmojiColor(i11);
        }
        if (!z9) {
            this.f51677x.a(this.f51676w, true);
        }
        if (z10 != this.f51678y) {
            this.f51678y = z10;
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
        bi.rc rcVar = this.f51675s;
        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, rcVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z9 && !org.telegram.messenger.hd.f22871a0) {
            z10 = true;
        }
        rcVar.c(m10, z10, true);
    }
}
