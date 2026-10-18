package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u6 extends FrameLayout {
    public org.telegram.ui.Components.q6 f41862a;
    public t6 f41863b;

    public final void a(float f7) {
        org.telegram.ui.Components.q6 q6Var = this.f41862a;
        q6Var.a();
        q6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.r.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        t6 t6Var = this.f41863b;
        t6Var.d = f7;
        t6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
