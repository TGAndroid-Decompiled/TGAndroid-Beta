package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class yk0 extends ClickableSpan {
    public final jl0 f43682a;

    public yk0(jl0 jl0Var) {
        this.f43682a = jl0Var;
    }

    @Override
    public final void onClick(View view) {
        jl0 jl0Var = this.f43682a;
        gf.f.r(jl0Var.getParentActivity(), jl0Var.D.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
    }
}
