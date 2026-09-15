package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class to0 extends ClickableSpan {
    public final wo0 f37759a;

    public to0(wo0 wo0Var) {
        this.f37759a = wo0Var;
    }

    @Override
    public final void onClick(View view) {
        wo0 wo0Var = this.f37759a;
        wo0Var.presentFragment(new gh1(6, wo0Var.f39307a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
