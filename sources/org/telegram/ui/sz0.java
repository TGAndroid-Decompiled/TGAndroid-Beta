package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class sz0 extends View {

    public int f42726a;

    public int f42727b;

    public final vz0 f42728c;

    public sz0(vz0 vz0Var, Context context) {
        super(context);
        this.f42728c = vz0Var;
        this.f42726a = 0;
        this.f42727b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f42727b;
        ProfileActivity profileActivity = this.f42728c.f43554e;
        if (i12 != profileActivity.f35921a.getMeasuredHeight()) {
            this.f42726a = 0;
        }
        this.f42727b = profileActivity.f35921a.getMeasuredHeight();
        int childCount = profileActivity.f35921a.getChildCount();
        if (childCount != profileActivity.d.f43554e.J2) {
            setMeasuredDimension(profileActivity.f35921a.getMeasuredWidth(), this.f42726a);
            return;
        }
        int measuredHeight = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = profileActivity.f35921a.getChildAt(i13);
            profileActivity.f35921a.getClass();
            int iR = RecyclerView.R(childAt);
            if (iR >= 0 && iR != profileActivity.f36090y3) {
                measuredHeight += profileActivity.f35921a.getChildAt(i13).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight2 = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - measuredHeight;
        if (measuredHeight2 > profileActivity.T3()) {
            measuredHeight2 = 0;
        }
        int i14 = measuredHeight2 > 0 ? measuredHeight2 : 0;
        int measuredWidth = profileActivity.f35921a.getMeasuredWidth();
        this.f42726a = i14;
        setMeasuredDimension(measuredWidth, i14);
    }
}
