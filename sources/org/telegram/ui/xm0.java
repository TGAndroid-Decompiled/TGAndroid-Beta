package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xm0 extends ClickableSpan {
    public final in0 f39307a;

    public xm0(in0 in0Var) {
        this.f39307a = in0Var;
    }

    @Override
    public final void onClick(View view) {
        in0 in0Var = this.f39307a;
        nf.f.s(in0Var.getParentActivity(), in0Var.f34217y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
