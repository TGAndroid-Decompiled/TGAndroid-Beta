package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v6 extends FrameLayout {
    public org.telegram.ui.Components.s6 f44720a;
    public u6 f44721b;

    public final void a(float f7) {
        org.telegram.ui.Components.s6 s6Var = this.f44720a;
        s6Var.a();
        s6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(a8.ee.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        u6 u6Var = this.f44721b;
        u6Var.f44028c = f7;
        u6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
