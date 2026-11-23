package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class zy extends org.telegram.ui.Cells.o4 {
    public final jz E;
    public final TextView f54746r;
    public final di.db f54747s;
    public int f54748w;
    public final org.telegram.ui.Components.f5 f54749x;
    public boolean f54750y;

    public zy(org.telegram.ui.jz r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zy.<init>(org.telegram.ui.jz, android.content.Context):void");
    }

    public final void d(int i7, boolean z10) {
        int i10;
        boolean z11;
        float f10;
        jz jzVar = this.E;
        if (jzVar.getUserConfig().q()) {
            i10 = 2131750603;
        } else {
            i10 = 2131750602;
        }
        String N0 = org.telegram.messenger.gd.N0(i10, null);
        TextView textView = this.f54746r;
        textView.setText(N0);
        int i11 = 0;
        if (i7 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.n6.f29712r8;
            i11 = jzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f54748w = i11;
        di.db dbVar = this.f54747s;
        if (!z11) {
            dbVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.f54749x.a(this.f54748w, true);
        }
        if (z11 != this.f54750y) {
            this.f54750y = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
            duration.setInterpolator(krVar).start();
            ViewPropertyAnimator animate2 = dbVar.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(krVar).start();
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
        di.db dbVar = this.f54747s;
        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, dbVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.gd.f24314a0) {
            z11 = true;
        }
        dbVar.c(m10, z11, true);
    }
}
