package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class k7 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.z2[] f47163a;
    public final long f47164b;

    public k7(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10) {
        this.f47163a = z2VarArr;
        this.f47164b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f47163a[0].dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(un.ha(this.f47164b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
