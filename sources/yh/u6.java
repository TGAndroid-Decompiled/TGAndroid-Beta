package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class u6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f47782a;
    public final long f47783b;

    public u6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f47782a = f3VarArr;
        this.f47783b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47782a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.R9(this.f47783b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
