package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class uo0 extends ClickableSpan {
    public final xo0 f41195a;

    public uo0(xo0 xo0Var) {
        this.f41195a = xo0Var;
    }

    @Override
    public final void onClick(View view) {
        xo0 xo0Var = this.f41195a;
        xo0Var.presentFragment(new hh1(6, xo0Var.f42807a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
