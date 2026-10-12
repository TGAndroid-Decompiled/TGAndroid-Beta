package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x01 extends View {
    public int f43711a;
    public int f43712b;
    public final a11 f43713c;

    public x01(a11 a11Var, Context context) {
        super(context);
        this.f43713c = a11Var;
        this.f43711a = 0;
        this.f43712b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f43712b;
        ProfileActivity profileActivity = this.f43713c.f35666e;
        int i13 = 0;
        if (i12 != profileActivity.f34050a.getMeasuredHeight()) {
            this.f43711a = 0;
        }
        this.f43712b = profileActivity.f34050a.getMeasuredHeight();
        int childCount = profileActivity.f34050a.getChildCount();
        if (childCount == profileActivity.d.f35666e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34050a.getChildAt(i15);
                profileActivity.f34050a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f34050a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34050a.getMeasuredWidth();
            this.f43711a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34050a.getMeasuredWidth(), this.f43711a);
    }
}
