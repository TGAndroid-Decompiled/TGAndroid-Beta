package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s00 extends org.telegram.ui.Cells.m4 {
    public final TextView f41582r;
    public final r00 f41583s;
    public int v;
    public final org.telegram.ui.Components.j5 f41584w;
    public boolean f41585x;
    public final e10 f41586y;

    public s00(org.telegram.ui.e10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s00.<init>(org.telegram.ui.e10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        e10 e10Var = this.f41586y;
        if (e10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f41582r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.h6.f21083r8;
            i12 = e10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        r00 r00Var = this.f41583s;
        if (!z11) {
            r00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f41584w.a(this.v, true);
        }
        if (z11 != this.f41585x) {
            this.f41585x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
            duration.setInterpolator(isVar).start();
            ViewPropertyAnimator animate2 = r00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(isVar).start();
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
        r00 r00Var = this.f41583s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, r00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        r00Var.c(replaceEmoji, z11, true);
    }
}
