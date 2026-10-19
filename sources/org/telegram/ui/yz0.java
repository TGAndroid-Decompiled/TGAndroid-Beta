package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yz0 extends View {
    public int f43571a;
    public int f43572b;
    public final b01 f43573c;

    public yz0(b01 b01Var, Context context) {
        super(context);
        this.f43573c = b01Var;
        this.f43571a = 0;
        this.f43572b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f43572b;
        ProfileActivity profileActivity = this.f43573c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33574a.getMeasuredHeight()) {
            this.f43571a = 0;
        }
        this.f43572b = profileActivity.f33574a.getMeasuredHeight();
        int childCount = profileActivity.f33574a.getChildCount();
        if (childCount == profileActivity.d.e.O2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33574a.getChildAt(i15);
                profileActivity.f33574a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i14 += profileActivity.f33574a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f33574a.getMeasuredWidth();
            this.f43571a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33574a.getMeasuredWidth(), this.f43571a);
    }
}
