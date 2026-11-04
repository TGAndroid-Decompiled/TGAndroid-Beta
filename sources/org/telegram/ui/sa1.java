package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class sa1 extends ViewGroup {
    public final Paint f49461a;
    public View f49462b;
    public boolean f49463c;

    public sa1(Context context) {
        super(context);
        this.f49461a = new Paint(1);
        setClipToPadding(false);
    }

    public final boolean a() {
        View view = this.f49462b;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int paddingBottom = getPaddingBottom();
        float T1 = org.telegram.messenger.g0.T1(0.1f, 0.75f, org.telegram.messenger.g0.R0(paddingBottom));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.r1(T1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)), x02);
        Paint paint = this.f49461a;
        paint.setColor(x02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - paddingBottom, paint);
        paint.setColor(k10);
        canvas.drawRect(0.0f, getMeasuredHeight() - paddingBottom, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        boolean a10 = a();
        int size = View.MeasureSpec.getSize(i3);
        if (a10) {
            i11 = getPaddingBottom() + org.telegram.messenger.g0.L(44.0f);
        } else {
            i11 = 0;
        }
        setMeasuredDimension(size, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f49463c != a10) {
            this.f49463c = a10;
            WeakHashMap weakHashMap = r0.i0.f54015a;
            r0.y.c(this);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f49462b = view;
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        super.setPadding(i3, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).setPadding(i3, i10, i11, i12);
        }
    }
}
