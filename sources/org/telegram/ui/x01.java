package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x01 extends View {
    public int f42526a;
    public int f42527b;
    public final a11 f42528c;

    public x01(a11 a11Var, Context context) {
        super(context);
        this.f42528c = a11Var;
        this.f42526a = 0;
        this.f42527b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f42527b;
        ProfileActivity profileActivity = this.f42528c.f34291e;
        int i13 = 0;
        if (i12 != profileActivity.f33856a.getMeasuredHeight()) {
            this.f42526a = 0;
        }
        this.f42527b = profileActivity.f33856a.getMeasuredHeight();
        int childCount = profileActivity.f33856a.getChildCount();
        if (childCount == profileActivity.d.f34291e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33856a.getChildAt(i15);
                profileActivity.f33856a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f33856a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f33856a.getMeasuredWidth();
            this.f42526a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33856a.getMeasuredWidth(), this.f42526a);
    }
}
