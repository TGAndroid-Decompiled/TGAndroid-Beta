package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class w6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f47972a;
    public final long f47973b;

    public w6(org.telegram.ui.ActionBar.g3[] g3VarArr, long j3) {
        this.f47972a = g3VarArr;
        this.f47973b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47972a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(bo.R9(this.f47973b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
