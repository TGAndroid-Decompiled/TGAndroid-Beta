package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class r6 extends FrameLayout {

    public org.telegram.ui.Components.j6 f41819a;

    public q6 f41820b;

    public final void a(float f10) {
        org.telegram.ui.Components.j6 j6Var = this.f41819a;
        j6Var.a();
        j6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(h7.n.a(f10, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        q6 q6Var = this.f41820b;
        q6Var.d = f10;
        q6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
