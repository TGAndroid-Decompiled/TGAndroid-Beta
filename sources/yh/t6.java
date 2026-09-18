package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class t6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f48064a;
    public final long f48065b;

    public t6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f48064a = f3VarArr;
        this.f48065b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f48064a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(zn.R9(this.f48065b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
