package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class vj0 extends ClickableSpan {
    public final fk0 f52976a;

    public vj0(fk0 fk0Var) {
        this.f52976a = fk0Var;
    }

    @Override
    public final void onClick(View view) {
        fk0 fk0Var = this.f52976a;
        vf.c.t(fk0Var.getParentActivity(), fk0Var.E.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
