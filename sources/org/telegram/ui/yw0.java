package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class yw0 extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final ProfileActivity f52341a;

    public yw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f52341a = profileActivity;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.f52341a.f41876z0));
    }
}
