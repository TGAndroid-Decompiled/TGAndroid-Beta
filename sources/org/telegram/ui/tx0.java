package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tx0 extends View {
    public int f41735a;
    public int f41736b;
    public final wx0 f41737c;

    public tx0(wx0 wx0Var, Context context) {
        super(context);
        this.f41737c = wx0Var;
        this.f41735a = 0;
        this.f41736b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f41736b;
        ProfileActivity profileActivity = this.f41737c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33779a.getMeasuredHeight()) {
            this.f41735a = 0;
        }
        this.f41736b = profileActivity.f33779a.getMeasuredHeight();
        int childCount = profileActivity.f33779a.getChildCount();
        if (childCount == profileActivity.d.e.M2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33779a.getChildAt(i15);
                profileActivity.f33779a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.B3) {
                    i14 += profileActivity.f33779a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16166m) - i14;
            if (currentActionBarHeight > profileActivity.j4()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f33779a.getMeasuredWidth();
            this.f41735a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33779a.getMeasuredWidth(), this.f41735a);
    }
}
