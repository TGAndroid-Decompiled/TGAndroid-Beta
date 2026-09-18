package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r6 extends FrameLayout {
    public org.telegram.ui.Components.p6 f36977a;
    public q6 f36978b;

    public final void a(float f7) {
        org.telegram.ui.Components.p6 p6Var = this.f36977a;
        p6Var.a();
        p6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.q.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        q6 q6Var = this.f36978b;
        q6Var.d = f7;
        q6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
