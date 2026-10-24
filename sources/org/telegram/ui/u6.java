package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u6 extends FrameLayout {
    public org.telegram.ui.Components.o6 f42328a;
    public t6 f42329b;

    public final void a(float f7) {
        org.telegram.ui.Components.o6 o6Var = this.f42328a;
        o6Var.a();
        o6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.r.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        t6 t6Var = this.f42329b;
        t6Var.f41889c = f7;
        t6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
