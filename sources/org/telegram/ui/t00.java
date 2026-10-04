package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t00 extends org.telegram.ui.Cells.m4 {
    public final TextView f40640r;
    public final s00 f40641s;
    public int v;
    public final org.telegram.ui.Components.h5 f40642w;
    public boolean f40643x;
    public final f10 f40644y;

    public t00(org.telegram.ui.f10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t00.<init>(org.telegram.ui.f10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        f10 f10Var = this.f40644y;
        if (f10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f40640r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.i6.f21079r8;
            i12 = f10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        s00 s00Var = this.f40641s;
        if (!z11) {
            s00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f40642w.a(this.v, true);
        }
        if (z11 != this.f40643x) {
            this.f40643x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
            duration.setInterpolator(trVar).start();
            ViewPropertyAnimator animate2 = s00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(trVar).start();
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
        s00 s00Var = this.f40641s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, s00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        s00Var.c(replaceEmoji, z11, true);
    }
}
