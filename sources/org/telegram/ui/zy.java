package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class zy extends org.telegram.ui.Cells.n4 {
    public final jz D;
    public final TextView f52705r;
    public final bi.rc f52706s;
    public int f52707w;
    public final org.telegram.ui.Components.y4 f52708x;
    public boolean f52709y;

    public zy(org.telegram.ui.jz r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zy.<init>(org.telegram.ui.jz, android.content.Context):void");
    }

    public final void d(int i7, boolean z9) {
        int i10;
        boolean z10;
        float f10;
        jz jzVar = this.D;
        if (jzVar.getUserConfig().q()) {
            i10 = 2131750620;
        } else {
            i10 = 2131750619;
        }
        String M0 = org.telegram.messenger.id.M0(i10, null);
        TextView textView = this.f52705r;
        textView.setText(M0);
        int i11 = 0;
        if (i7 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int[] iArr = org.telegram.ui.ActionBar.m6.f28151r8;
            i11 = jzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f52707w = i11;
        bi.rc rcVar = this.f52706s;
        if (!z10) {
            rcVar.setEmojiColor(i11);
        }
        if (!z9) {
            this.f52708x.a(this.f52707w, true);
        }
        if (z10 != this.f52709y) {
            this.f52709y = z10;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
            duration.setInterpolator(wqVar).start();
            ViewPropertyAnimator animate2 = rcVar.animate();
            if (!z10) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(wqVar).start();
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
        bi.rc rcVar = this.f52706s;
        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, rcVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z9 && !org.telegram.messenger.id.f23161a0) {
            z10 = true;
        }
        rcVar.c(m10, z10, true);
    }
}
