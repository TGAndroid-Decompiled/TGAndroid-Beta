package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zm0 extends ClickableSpan {
    public final kn0 f46313a;

    public zm0(kn0 kn0Var) {
        this.f46313a = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        kn0 kn0Var = this.f46313a;
        qf.d.r(kn0Var.getParentActivity(), kn0Var.f40890y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
