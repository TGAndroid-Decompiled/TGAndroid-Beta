package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 extends ClickableSpan {
    public final dn0 f38409a;

    public sm0(dn0 dn0Var) {
        this.f38409a = dn0Var;
    }

    @Override
    public final void onClick(View view) {
        dn0 dn0Var = this.f38409a;
        af.g.s(dn0Var.getParentActivity(), dn0Var.f33737y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
