package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class w01 extends TextView implements org.telegram.ui.ActionBar.p6 {
    public final ProfileActivity f44939a;

    public w01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f44939a = profileActivity;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f44939a.f36126z0));
    }
}
