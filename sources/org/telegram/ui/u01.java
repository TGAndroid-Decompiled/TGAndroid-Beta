package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
public final class u01 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final ProfileActivity f41755a;

    public u01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f41755a = profileActivity;
        e();
    }

    @Override
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.f41755a.f34714w0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
