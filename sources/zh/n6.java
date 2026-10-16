package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
public final class n6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f50887a;
    public final long f50888b;

    public n6(org.telegram.ui.ActionBar.e3[] e3VarArr, long j10) {
        this.f50887a = e3VarArr;
        this.f50888b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f50887a[0].dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(fo.W9(this.f50888b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
