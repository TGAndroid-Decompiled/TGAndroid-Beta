package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x01 extends View {
    public int f39421a;
    public int f39422b;
    public final a11 f39423c;

    public x01(a11 a11Var, Context context) {
        super(context);
        this.f39423c = a11Var;
        this.f39421a = 0;
        this.f39422b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f39422b;
        ProfileActivity profileActivity = this.f39423c.e;
        int i13 = 0;
        if (i12 != profileActivity.f31235a.getMeasuredHeight()) {
            this.f39421a = 0;
        }
        this.f39422b = profileActivity.f31235a.getMeasuredHeight();
        int childCount = profileActivity.f31235a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f31235a.getChildAt(i15);
                profileActivity.f31235a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f31235a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.T3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f31235a.getMeasuredWidth();
            this.f39421a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f31235a.getMeasuredWidth(), this.f39421a);
    }
}
