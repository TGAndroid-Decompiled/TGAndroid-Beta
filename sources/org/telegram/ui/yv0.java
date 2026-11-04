package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yv0 extends View {
    public int f52416a;
    public int f52417b;
    public final bw0 f52418c;

    public yv0(bw0 bw0Var, Context context) {
        super(context);
        this.f52418c = bw0Var;
        this.f52416a = 0;
        this.f52417b = 0;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int measuredHeight;
        int i11 = this.f52417b;
        ProfileActivity profileActivity = this.f52418c.f44157e;
        int i12 = 0;
        if (i11 != profileActivity.f41719a.getMeasuredHeight()) {
            this.f52416a = 0;
        }
        this.f52417b = profileActivity.f41719a.getMeasuredHeight();
        int childCount = profileActivity.f41719a.getChildCount();
        if (childCount == profileActivity.d.f44157e.N2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f41719a.getChildAt(i14);
                profileActivity.f41719a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i13 += profileActivity.f41719a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m) - i13;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f41719a.getMeasuredWidth();
            this.f52416a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f41719a.getMeasuredWidth(), this.f52416a);
    }
}
