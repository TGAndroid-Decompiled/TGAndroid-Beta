package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class yn0 extends ClickableSpan {
    public final bo0 f44914a;

    public yn0(bo0 bo0Var) {
        this.f44914a = bo0Var;
    }

    @Override
    public final void onClick(View view) {
        bo0 bo0Var = this.f44914a;
        bo0Var.presentFragment(new cg1(6, bo0Var.W));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
