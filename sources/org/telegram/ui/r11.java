package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class r11 extends TextView implements org.telegram.ui.ActionBar.x5 {
    public final ProfileActivity f39571a;

    public r11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f39571a = profileActivity;
        d();
    }

    @Override
    public final void d() {
        setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f39571a.f32703z0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
