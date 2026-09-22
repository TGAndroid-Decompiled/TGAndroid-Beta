package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t00 extends org.telegram.ui.Cells.m4 {
    public final TextView f37518r;
    public final s00 f37519s;
    public int v;
    public final org.telegram.ui.Components.f5 f37520w;
    public boolean f37521x;
    public final f10 f37522y;

    public t00(org.telegram.ui.f10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t00.<init>(org.telegram.ui.f10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        f10 f10Var = this.f37522y;
        if (f10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f37518r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.i6.f19091r8;
            i12 = f10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        s00 s00Var = this.f37519s;
        if (!z11) {
            s00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f37520w.a(this.v, true);
        }
        if (z11 != this.f37521x) {
            this.f37521x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
            duration.setInterpolator(qrVar).start();
            ViewPropertyAnimator animate2 = s00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(qrVar).start();
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
        s00 s00Var = this.f37519s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, s00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        s00Var.c(replaceEmoji, z11, true);
    }
}
