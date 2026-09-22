package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class to0 extends ClickableSpan {
    public final wo0 f37708a;

    public to0(wo0 wo0Var) {
        this.f37708a = wo0Var;
    }

    @Override
    public final void onClick(View view) {
        wo0 wo0Var = this.f37708a;
        wo0Var.presentFragment(new hh1(6, wo0Var.f39303a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
