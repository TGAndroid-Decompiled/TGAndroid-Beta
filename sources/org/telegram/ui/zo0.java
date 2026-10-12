package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class zo0 extends ClickableSpan {
    public final cp0 f42689a;

    public zo0(cp0 cp0Var) {
        this.f42689a = cp0Var;
    }

    @Override
    public final void onClick(View view) {
        cp0 cp0Var = this.f42689a;
        cp0Var.presentFragment(new oh1(6, cp0Var.f34996a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
