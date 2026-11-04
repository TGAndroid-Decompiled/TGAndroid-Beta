package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ty extends org.telegram.ui.Cells.n4 {
    public final ez E;
    public final TextView f49917r;
    public final ci.kb f49918s;
    public int f49919w;
    public final org.telegram.ui.Components.x4 f49920x;
    public boolean f49921y;

    public ty(org.telegram.ui.ez r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.<init>(org.telegram.ui.ez, android.content.Context):void");
    }

    public final void d(int i3, boolean z10) {
        int i10;
        boolean z11;
        float f10;
        ez ezVar = this.E;
        if (ezVar.getUserConfig().q()) {
            i10 = 2131750621;
        } else {
            i10 = 2131750620;
        }
        String M0 = org.telegram.messenger.bd.M0(i10, null);
        TextView textView = this.f49917r;
        textView.setText(M0);
        int i11 = 0;
        if (i3 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f28142r8;
            i11 = ezVar.getThemedColor(iArr[i3 % iArr.length]);
        }
        this.f49919w = i11;
        ci.kb kbVar = this.f49918s;
        if (!z11) {
            kbVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.f49920x.a(this.f49919w, true);
        }
        if (z11 != this.f49921y) {
            this.f49921y = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = kbVar.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(xqVar).start();
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
        ci.kb kbVar = this.f49918s;
        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, kbVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.bd.f21784a0) {
            z11 = true;
        }
        kbVar.c(m10, z11, true);
    }
}
