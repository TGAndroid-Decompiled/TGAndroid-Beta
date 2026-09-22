package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class uo0 extends ClickableSpan {
    public final xo0 f38199a;

    public uo0(xo0 xo0Var) {
        this.f38199a = xo0Var;
    }

    @Override
    public final void onClick(View view) {
        xo0 xo0Var = this.f38199a;
        xo0Var.presentFragment(new ih1(6, xo0Var.f39664a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
