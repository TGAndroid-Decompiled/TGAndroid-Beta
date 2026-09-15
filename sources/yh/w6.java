package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class w6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f47944a;
    public final long f47945b;

    public w6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f47944a = f3VarArr;
        this.f47945b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47944a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(bo.R9(this.f47945b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
