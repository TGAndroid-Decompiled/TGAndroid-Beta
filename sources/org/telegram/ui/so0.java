package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class so0 extends ClickableSpan {
    public final vo0 f41740a;

    public so0(vo0 vo0Var) {
        this.f41740a = vo0Var;
    }

    @Override
    public final void onClick(View view) {
        vo0 vo0Var = this.f41740a;
        vo0Var.presentFragment(new ih1(6, vo0Var.f42914a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
