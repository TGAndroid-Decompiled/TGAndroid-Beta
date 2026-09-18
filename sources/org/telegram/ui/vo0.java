package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class vo0 extends ClickableSpan {
    public final yo0 f38487a;

    public vo0(yo0 yo0Var) {
        this.f38487a = yo0Var;
    }

    @Override
    public final void onClick(View view) {
        yo0 yo0Var = this.f38487a;
        yo0Var.presentFragment(new ih1(6, yo0Var.f39950a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
