package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y01 extends View {
    public int f39750a;
    public int f39751b;
    public final b11 f39752c;

    public y01(b11 b11Var, Context context) {
        super(context);
        this.f39752c = b11Var;
        this.f39750a = 0;
        this.f39751b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f39751b;
        ProfileActivity profileActivity = this.f39752c.e;
        int i13 = 0;
        if (i12 != profileActivity.f31251a.getMeasuredHeight()) {
            this.f39750a = 0;
        }
        this.f39751b = profileActivity.f31251a.getMeasuredHeight();
        int childCount = profileActivity.f31251a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f31251a.getChildAt(i15);
                profileActivity.f31251a.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0 && S != profileActivity.C3) {
                    i14 += profileActivity.f31251a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f31251a.getMeasuredWidth();
            this.f39750a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f31251a.getMeasuredWidth(), this.f39750a);
    }
}
