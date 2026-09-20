package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class w01 extends View {
    public int f38638a;
    public int f38639b;
    public final z01 f38640c;

    public w01(z01 z01Var, Context context) {
        super(context);
        this.f38640c = z01Var;
        this.f38638a = 0;
        this.f38639b = 0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        int i12 = this.f38639b;
        ProfileActivity profileActivity = this.f38640c.e;
        int i13 = 0;
        if (i12 != profileActivity.f31522a.getMeasuredHeight()) {
            this.f38638a = 0;
        }
        this.f38639b = profileActivity.f31522a.getMeasuredHeight();
        int childCount = profileActivity.f31522a.getChildCount();
        if (childCount == profileActivity.d.e.N2) {
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = profileActivity.f31522a.getChildAt(i15);
                profileActivity.f31522a.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0 && S != profileActivity.C3) {
                    i14 += profileActivity.f31522a.getChildAt(i15).getMeasuredHeight();
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
            int measuredWidth = profileActivity.f31522a.getMeasuredWidth();
            this.f38638a = i13;
            setMeasuredDimension(measuredWidth, i13);
            return;
        }
        setMeasuredDimension(profileActivity.f31522a.getMeasuredWidth(), this.f38638a);
    }
}
