package xh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class w6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f46232a;
    public final long f46233b;

    public w6(org.telegram.ui.ActionBar.h3[] h3VarArr, long j3) {
        this.f46232a = h3VarArr;
        this.f46233b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f46232a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(eo.R9(this.f46233b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
