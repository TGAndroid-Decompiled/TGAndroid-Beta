package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ux0 extends View {
    public int f42535a;
    public int f42536b;
    public final xx0 f42537c;

    public ux0(xx0 xx0Var, Context context) {
        super(context);
        this.f42537c = xx0Var;
        this.f42535a = 0;
        this.f42536b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f42536b;
        ProfileActivity profileActivity = this.f42537c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33772a.getMeasuredHeight()) {
            this.f42535a = 0;
        }
        this.f42536b = profileActivity.f33772a.getMeasuredHeight();
        int childCount = profileActivity.f33772a.getChildCount();
        if (childCount == profileActivity.d.e.M2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33772a.getChildAt(i15);
                profileActivity.f33772a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.B3) {
                    i14 += profileActivity.f33772a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16020m) - i14;
            if (currentActionBarHeight > profileActivity.i4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f33772a.getMeasuredWidth();
            this.f42535a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33772a.getMeasuredWidth(), this.f42535a);
    }
}
