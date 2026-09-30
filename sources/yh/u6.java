package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class u6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f48128a;
    public final long f48129b;

    public u6(org.telegram.ui.ActionBar.e3[] e3VarArr, long j3) {
        this.f48128a = e3VarArr;
        this.f48129b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f48128a[0].dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(wn.R9(this.f48129b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
