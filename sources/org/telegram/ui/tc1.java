package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class tc1 extends ViewGroup {
    public final Paint f41617a;
    public View f41618b;
    public boolean f41619c;

    public tc1(Context context) {
        super(context);
        this.f41617a = new Paint(1);
        setClipToPadding(false);
    }

    public final boolean a() {
        View view = this.f41618b;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float T1 = org.telegram.messenger.i0.T1(0.1f, 0.75f, org.telegram.messenger.i0.R0(paddingBottom));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        int k10 = i0.b.k(org.telegram.ui.ActionBar.t6.r1(T1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)), x02);
        Paint paint = this.f41617a;
        paint.setColor(x02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(k10);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean a2 = a();
        int size = View.MeasureSpec.getSize(i10);
        if (a2) {
            i12 = getPaddingBottom() + org.telegram.messenger.i0.L(44.0f);
        } else {
            i12 = 0;
        }
        setMeasuredDimension(size, i12);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f41619c != a2) {
            this.f41619c = a2;
            WeakHashMap weakHashMap = r0.h0.f46134a;
            r0.x.c(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f41618b = view;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).setPadding(i10, i11, i12, i13);
        }
    }
}
