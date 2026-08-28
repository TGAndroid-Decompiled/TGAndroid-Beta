package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sz0 extends View {
    public int f42793a;
    public int f42794b;
    public final vz0 f42795c;

    public sz0(vz0 vz0Var, Context context) {
        super(context);
        this.f42795c = vz0Var;
        this.f42793a = 0;
        this.f42794b = 0;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int measuredHeight;
        int i11 = this.f42794b;
        ProfileActivity profileActivity = this.f42795c.f43616e;
        int i12 = 0;
        if (i11 != profileActivity.f35918a.getMeasuredHeight()) {
            this.f42793a = 0;
        }
        this.f42794b = profileActivity.f35918a.getMeasuredHeight();
        int childCount = profileActivity.f35918a.getChildCount();
        if (childCount == profileActivity.d.f43616e.J2) {
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = profileActivity.f35918a.getChildAt(i14);
                profileActivity.f35918a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.f36087y3) {
                    i13 += profileActivity.f35918a.getChildAt(i14).getMeasuredHeight();
                }
            }
            View view = profileActivity.fragmentView;
            if (view == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = view.getMeasuredHeight();
            }
            int currentActionBarHeight = ((measuredHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i13;
            if (currentActionBarHeight > profileActivity.T3()) {
                currentActionBarHeight = 0;
            }
            if (currentActionBarHeight > 0) {
                i12 = currentActionBarHeight;
            }
            int measuredWidth = profileActivity.f35918a.getMeasuredWidth();
            this.f42793a = i12;
            setMeasuredDimension(measuredWidth, i12);
            return;
        }
        setMeasuredDimension(profileActivity.f35918a.getMeasuredWidth(), this.f42793a);
    }
}
