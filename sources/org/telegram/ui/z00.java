package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z00 extends org.telegram.ui.Cells.m4 {
    public final TextView f42444r;
    public final y00 f42445s;
    public int v;
    public final org.telegram.ui.Components.j5 f42446w;
    public boolean f42447x;
    public final l10 f42448y;

    public z00(org.telegram.ui.l10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z00.<init>(org.telegram.ui.l10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        l10 l10Var = this.f42448y;
        if (l10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f42444r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.f20160r8;
            i12 = l10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        y00 y00Var = this.f42445s;
        if (!z11) {
            y00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f42446w.a(this.v, true);
        }
        if (z11 != this.f42447x) {
            this.f42447x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
            duration.setInterpolator(esVar).start();
            ViewPropertyAnimator animate2 = y00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(esVar).start();
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
        y00 y00Var = this.f42445s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, y00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        y00Var.c(replaceEmoji, z11, true);
    }
}
