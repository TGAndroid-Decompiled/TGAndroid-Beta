package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y00 extends org.telegram.ui.Cells.m4 {
    public final TextView f41698r;
    public final x00 f41699s;
    public int v;
    public final org.telegram.ui.Components.j5 f41700w;
    public boolean f41701x;
    public final k10 f41702y;

    public y00(org.telegram.ui.k10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y00.<init>(org.telegram.ui.k10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        k10 k10Var = this.f41702y;
        if (k10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f41698r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.g6.f19860r8;
            i12 = k10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        x00 x00Var = this.f41699s;
        if (!z11) {
            x00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f41700w.a(this.v, true);
        }
        if (z11 != this.f41701x) {
            this.f41701x = z11;
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
            ViewPropertyAnimator animate2 = x00Var.animate();
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
        x00 x00Var = this.f41699s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, x00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        x00Var.c(replaceEmoji, z11, true);
    }
}
