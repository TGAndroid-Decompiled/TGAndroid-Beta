package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yz0 extends View {
    public int f43577a;
    public int f43578b;
    public final b01 f43579c;

    public yz0(b01 b01Var, Context context) {
        super(context);
        this.f43579c = b01Var;
        this.f43577a = 0;
        this.f43578b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f43578b;
        ProfileActivity profileActivity = this.f43579c.e;
        int i13 = 0;
        if (i12 != profileActivity.f33580a.getMeasuredHeight()) {
            this.f43577a = 0;
        }
        this.f43578b = profileActivity.f33580a.getMeasuredHeight();
        int childCount = profileActivity.f33580a.getChildCount();
        if (childCount == profileActivity.d.e.O2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f33580a.getChildAt(i15);
                profileActivity.f33580a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.D3) {
                    i14 += profileActivity.f33580a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f33580a.getMeasuredWidth();
            this.f43577a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f33580a.getMeasuredWidth(), this.f43577a);
    }
}
