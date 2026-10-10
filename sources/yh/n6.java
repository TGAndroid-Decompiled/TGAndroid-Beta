package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class n6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52979a;
    public final long f52980b;

    public n6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f52979a = f3VarArr;
        this.f52980b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52979a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(zn.W9(this.f52980b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
