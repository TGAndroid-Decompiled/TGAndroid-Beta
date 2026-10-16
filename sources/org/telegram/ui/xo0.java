package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xo0 extends ClickableSpan {
    public final ap0 f41605a;

    public xo0(ap0 ap0Var) {
        this.f41605a = ap0Var;
    }

    @Override
    public final void onClick(View view) {
        ap0 ap0Var = this.f41605a;
        ap0Var.presentFragment(new oh1(6, ap0Var.f34008a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
