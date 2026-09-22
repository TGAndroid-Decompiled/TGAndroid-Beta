package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class v6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f47850a;
    public final long f47851b;

    public v6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f47850a = f3VarArr;
        this.f47851b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47850a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(bo.R9(this.f47851b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
