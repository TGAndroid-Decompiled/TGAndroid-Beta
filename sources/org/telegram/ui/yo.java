package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class yo extends ClickableSpan {
    public final int f41856a;

    public yo(int i10) {
        this.f41856a = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41856a) {
            case 0:
                pf.d.r(view.getContext(), "https://t.me/BotFather");
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f41856a) {
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
