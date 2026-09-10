package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xo extends ClickableSpan {
    public final int f38784a;

    public xo(int i10) {
        this.f38784a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38784a) {
            case 0:
                nf.f.s(view.getContext(), "https://t.me/BotFather");
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f38784a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                return;
        }
    }

    private final void a(View view) {
    }
}
