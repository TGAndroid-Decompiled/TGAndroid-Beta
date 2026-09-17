package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
public final class t6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52697a;
    public final long f52698b;

    public t6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3) {
        this.f52697a = f3VarArr;
        this.f52698b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52697a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(co.R9(this.f52698b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
