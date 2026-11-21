package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xj0 extends ClickableSpan {
    public final hk0 f53889a;

    public xj0(hk0 hk0Var) {
        this.f53889a = hk0Var;
    }

    @Override
    public final void onClick(View view) {
        hk0 hk0Var = this.f53889a;
        vf.c.t(hk0Var.getParentActivity(), hk0Var.E.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
