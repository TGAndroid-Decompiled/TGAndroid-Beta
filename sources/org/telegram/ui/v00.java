package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v00 extends org.telegram.ui.Cells.m4 {
    public final TextView f37370r;
    public final u00 f37371s;
    public int v;
    public final org.telegram.ui.Components.g5 f37372w;
    public boolean f37373x;
    public final h10 f37374y;

    public v00(org.telegram.ui.h10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v00.<init>(org.telegram.ui.h10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        h10 h10Var = this.f37374y;
        if (h10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f37370r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f18182r8;
            i12 = h10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        u00 u00Var = this.f37371s;
        if (!z11) {
            u00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f37372w.a(this.v, true);
        }
        if (z11 != this.f37373x) {
            this.f37373x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
            duration.setInterpolator(wrVar).start();
            ViewPropertyAnimator animate2 = u00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(wrVar).start();
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
        u00 u00Var = this.f37371s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, u00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        u00Var.c(replaceEmoji, z11, true);
    }
}
