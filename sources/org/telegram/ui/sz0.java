package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sz0 extends View {
    public int f42496a;
    public int f42497b;
    public final vz0 f42498c;

    public sz0(vz0 vz0Var, Context context) {
        super(context);
        this.f42498c = vz0Var;
        this.f42496a = 0;
        this.f42497b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f42497b;
        ProfileActivity profileActivity = this.f42498c.f43803e;
        int i13 = 0;
        if (i12 != profileActivity.f35984a.getMeasuredHeight()) {
            this.f42496a = 0;
        }
        this.f42497b = profileActivity.f35984a.getMeasuredHeight();
        int childCount = profileActivity.f35984a.getChildCount();
        if (childCount == profileActivity.d.f43803e.J2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f35984a.getChildAt(i15);
                profileActivity.f35984a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.f36152y3) {
                    i14 += profileActivity.f35984a.getChildAt(i15).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i14;
            if (currentActionBarHeight > profileActivity.T3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i13 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f35984a.getMeasuredWidth();
            this.f42496a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f35984a.getMeasuredWidth(), this.f42496a);
    }
}
