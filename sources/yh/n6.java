package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class n6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f53157a;
    public final long f53158b;

    public n6(org.telegram.ui.ActionBar.e3[] e3VarArr, long j3) {
        this.f53157a = e3VarArr;
        this.f53158b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f53157a[0].dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(eo.W9(this.f53158b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
