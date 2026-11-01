package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class k7 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.z2[] f47177a;
    public final long f47178b;

    public k7(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10) {
        this.f47177a = z2VarArr;
        this.f47178b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f47177a[0].dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(un.ma(this.f47178b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
