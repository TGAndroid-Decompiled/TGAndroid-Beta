package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u01 extends View {
    public int f42304a;
    public int f42305b;
    public final x01 f42306c;

    public u01(x01 x01Var, Context context) {
        super(context);
        this.f42306c = x01Var;
        this.f42304a = 0;
        this.f42305b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f42305b;
        ProfileActivity profileActivity = this.f42306c.f43916e;
        int i13 = 0;
        if (i12 != profileActivity.f34239a.getMeasuredHeight()) {
            this.f42304a = 0;
        }
        this.f42305b = profileActivity.f34239a.getMeasuredHeight();
        int childCount = profileActivity.f34239a.getChildCount();
        if (childCount == profileActivity.d.f43916e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34239a.getChildAt(i15);
                profileActivity.f34239a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f34239a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34239a.getMeasuredWidth();
            this.f42304a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34239a.getMeasuredWidth(), this.f42304a);
    }
}
