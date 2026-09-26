package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vm0 extends ClickableSpan {
    public final gn0 f38781a;

    public vm0(gn0 gn0Var) {
        this.f38781a = gn0Var;
    }

    @Override
    public final void onClick(View view) {
        gn0 gn0Var = this.f38781a;
        nf.f.s(gn0Var.getParentActivity(), gn0Var.f34023y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
