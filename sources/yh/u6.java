package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class u6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f48133a;
    public final long f48134b;

    public u6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f48133a = f3VarArr;
        this.f48134b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f48133a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(zn.R9(this.f48134b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
