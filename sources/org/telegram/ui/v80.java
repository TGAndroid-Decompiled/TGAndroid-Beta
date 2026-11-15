package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v80 extends RelativeLayout {
    public i0.c f52160a;
    public boolean f52161b;
    public final LaunchActivity f52162c;

    public v80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f52162c = launchActivity;
        this.f52160a = i0.c.f15573e;
        zr zrVar = new zr(this, 17);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(this, zrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f52162c.f42651q0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f52162c;
        if (!launchActivity.N0) {
            i0.c cVar = this.f52160a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, cVar.f15574a, cVar.f15576c);
            launchActivity.f42649p0.getView().layout(0, 0, launchActivity.f42649p0.getView().getMeasuredWidth(), launchActivity.f42649p0.getView().getMeasuredHeight());
            launchActivity.f42653r0.getView().layout(l1, 0, launchActivity.f42653r0.getView().getMeasuredWidth() + l1, launchActivity.f42653r0.getView().getMeasuredHeight());
        } else {
            launchActivity.f42649p0.getView().layout(0, 0, launchActivity.f42649p0.getView().getMeasuredWidth(), launchActivity.f42649p0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f42651q0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f52160a.f15575b;
        launchActivity.f42651q0.getView().layout(measuredWidth2, L, launchActivity.f42651q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f42651q0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.f42659u0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.f42659u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f42657t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f42657t0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        this.f52161b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z11 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f52162c;
        if (!z11 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            org.telegram.messenger.g0.h3(new iz(this, 18));
        }
        if (!launchActivity.N0) {
            i0.c cVar = this.f52160a;
            int l1 = org.telegram.messenger.g0.l1(size, cVar.f15574a, cVar.f15576c);
            launchActivity.f42649p0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f42653r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f42649p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f42659u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f42657t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f42651q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.c cVar2 = this.f52160a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.f15575b) - cVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f52161b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f52161b) {
            return;
        }
        super.requestLayout();
    }
}
