package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t6 extends FrameLayout {
    public org.telegram.ui.Components.r6 f42106a;
    public s6 f42107b;

    public final void a(float f7) {
        org.telegram.ui.Components.r6 r6Var = this.f42106a;
        r6Var.a();
        r6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.n.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        s6 s6Var = this.f42107b;
        s6Var.d = f7;
        s6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
