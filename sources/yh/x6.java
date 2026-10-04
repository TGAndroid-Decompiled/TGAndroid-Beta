package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
public final class x6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52260a;
    public final long f52261b;

    public x6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f52260a = f3VarArr;
        this.f52261b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52260a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(yn.Q9(this.f52261b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
