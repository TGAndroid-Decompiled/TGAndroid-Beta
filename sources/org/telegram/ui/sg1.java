package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class sg1 extends ViewGroup {
    public final Paint f41285a;
    public View f41286b;
    public boolean f41287c;

    public sg1(Context context) {
        super(context);
        this.f41285a = new Paint(1);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(0.1f, 0.75f, paddingBottom);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        int h = i0.a.h(org.telegram.ui.ActionBar.k6.l1(navigationBarThirdButtonsFactor, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)), w02);
        Paint paint = this.f41285a;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(h);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        View view = this.f41286b;
        if (view != null && view.getVisibility() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (z4) {
            i12 = getPaddingBottom() + AndroidUtilities.dp(44.0f);
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
        if (this.f41287c != z4) {
            this.f41287c = z4;
            WeakHashMap weakHashMap = r0.j0.f46438a;
            r0.z.c(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f41286b = view;
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
