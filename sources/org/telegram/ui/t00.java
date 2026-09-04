package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t00 extends org.telegram.ui.Cells.l4 {
    public final TextView f40579r;
    public final s00 f40580s;
    public int v;
    public final org.telegram.ui.Components.h5 f40581w;
    public boolean f40582x;
    public final f10 f40583y;

    public t00(org.telegram.ui.f10 r13, android.content.Context r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t00.<init>(org.telegram.ui.f10, android.content.Context):void");
    }

    public final void d(int i10, boolean z10) {
        int i11;
        boolean z11;
        float f7;
        f10 f10Var = this.f40583y;
        if (f10Var.getUserConfig().isPremium()) {
            i11 = R.string.FolderTagNoColor;
        } else {
            i11 = R.string.FolderTagNoColorPremium;
        }
        String string = LocaleController.getString(i11);
        TextView textView = this.f40579r;
        textView.setText(string);
        int i12 = 0;
        if (i10 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f20918r8;
            i12 = f10Var.getThemedColor(iArr[i10 % iArr.length]);
        }
        this.v = i12;
        s00 s00Var = this.f40580s;
        if (!z11) {
            s00Var.setEmojiColor(i12);
        }
        if (!z10) {
            this.f40581w.a(this.v, true);
        }
        if (z11 != this.f40582x) {
            this.f40582x = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f10 = 0.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f7).setDuration(320L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            duration.setInterpolator(prVar).start();
            ViewPropertyAnimator animate2 = s00Var.animate();
            if (!z11) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setDuration(320L).setInterpolator(prVar).start();
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
        s00 s00Var = this.f40580s;
        CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, s00Var.getPaint().getFontMetricsInt(), false);
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        s00Var.c(replaceEmoji, z11, true);
    }
}
