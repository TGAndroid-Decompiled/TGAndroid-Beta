package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class v01 extends View {
    public int f42594a;
    public int f42595b;
    public final y01 f42596c;

    public v01(y01 y01Var, Context context) {
        super(context);
        this.f42596c = y01Var;
        this.f42594a = 0;
        this.f42595b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f42595b;
        ProfileActivity profileActivity = this.f42596c.f44191e;
        int i13 = 0;
        if (i12 != profileActivity.f34211a.getMeasuredHeight()) {
            this.f42594a = 0;
        }
        this.f42595b = profileActivity.f34211a.getMeasuredHeight();
        int childCount = profileActivity.f34211a.getChildCount();
        if (childCount == profileActivity.d.f44191e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f34211a.getChildAt(i15);
                profileActivity.f34211a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0 && R != profileActivity.C3) {
                    i14 += profileActivity.f34211a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f34211a.getMeasuredWidth();
            this.f42594a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f34211a.getMeasuredWidth(), this.f42594a);
    }
}
