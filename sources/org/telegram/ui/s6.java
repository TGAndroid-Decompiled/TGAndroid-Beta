package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s6 extends FrameLayout {
    public org.telegram.ui.Components.n6 f37389a;
    public r6 f37390b;

    public final void a(float f7) {
        org.telegram.ui.Components.n6 n6Var = this.f37389a;
        n6Var.a();
        n6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.p.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        r6 r6Var = this.f37390b;
        r6Var.d = f7;
        r6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
