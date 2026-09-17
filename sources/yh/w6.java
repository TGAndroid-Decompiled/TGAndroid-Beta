package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class w6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f47967a;
    public final long f47968b;

    public w6(org.telegram.ui.ActionBar.g3[] g3VarArr, long j3) {
        this.f47967a = g3VarArr;
        this.f47968b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47967a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(bo.R9(this.f47968b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
