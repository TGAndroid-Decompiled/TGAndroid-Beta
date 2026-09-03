package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class um0 extends ClickableSpan {
    public final fn0 f41876a;

    public um0(fn0 fn0Var) {
        this.f41876a = fn0Var;
    }

    @Override
    public final void onClick(View view) {
        fn0 fn0Var = this.f41876a;
        af.g.s(fn0Var.getParentActivity(), fn0Var.f36876y.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
