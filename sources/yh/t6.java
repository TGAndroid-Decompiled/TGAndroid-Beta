package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class t6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f48110a;
    public final long f48111b;

    public t6(org.telegram.ui.ActionBar.g3[] g3VarArr, long j3) {
        this.f48110a = g3VarArr;
        this.f48111b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f48110a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.R9(this.f48111b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
