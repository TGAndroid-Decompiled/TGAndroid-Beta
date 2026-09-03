package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v6 extends FrameLayout {
    public org.telegram.ui.Components.k6 f39008a;
    public cg.r f39009b;

    public final void a(float f10) {
        org.telegram.ui.Components.k6 k6Var = this.f39008a;
        k6Var.a();
        k6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(k7.n.a(f10, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        cg.r rVar = this.f39009b;
        rVar.d = f10;
        rVar.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
