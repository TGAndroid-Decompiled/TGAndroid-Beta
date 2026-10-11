package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class ro0 extends ClickableSpan {
    public final uo0 f41482a;

    public ro0(uo0 uo0Var) {
        this.f41482a = uo0Var;
    }

    @Override
    public final void onClick(View view) {
        uo0 uo0Var = this.f41482a;
        uo0Var.presentFragment(new hh1(6, uo0Var.f42693a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
