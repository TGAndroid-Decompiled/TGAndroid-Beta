package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v6 extends FrameLayout {
    public org.telegram.ui.Components.s6 f44717a;
    public u6 f44718b;

    public final void a(float f7) {
        org.telegram.ui.Components.s6 s6Var = this.f44717a;
        s6Var.a();
        s6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(a8.ee.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        u6 u6Var = this.f44718b;
        u6Var.f44025c = f7;
        u6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
