package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class uo0 extends ClickableSpan {
    public final xo0 f42545a;

    public uo0(xo0 xo0Var) {
        this.f42545a = xo0Var;
    }

    @Override
    public final void onClick(View view) {
        xo0 xo0Var = this.f42545a;
        xo0Var.presentFragment(new kh1(6, xo0Var.f44091a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
