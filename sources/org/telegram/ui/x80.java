package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x80 extends RelativeLayout {
    public i0.b f51591a;
    public boolean f51592b;
    public final LaunchActivity f51593c;

    public x80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f51593c = launchActivity;
        this.f51591a = i0.b.f15119e;
        yr yrVar = new yr(this, 17);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(this, yrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f51593c.f41288p0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f51593c;
        if (!launchActivity.M0) {
            i0.b bVar = this.f51591a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, bVar.f15120a, bVar.f15122c);
            launchActivity.f41286o0.getView().layout(0, 0, launchActivity.f41286o0.getView().getMeasuredWidth(), launchActivity.f41286o0.getView().getMeasuredHeight());
            launchActivity.f41290q0.getView().layout(l1, 0, launchActivity.f41290q0.getView().getMeasuredWidth() + l1, launchActivity.f41290q0.getView().getMeasuredHeight());
        } else {
            launchActivity.f41286o0.getView().layout(0, 0, launchActivity.f41286o0.getView().getMeasuredWidth(), launchActivity.f41286o0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f41288p0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f51591a.f15121b;
        launchActivity.f41288p0.getView().layout(measuredWidth2, L, launchActivity.f41288p0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f41288p0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.f41296t0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.f41296t0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f41294s0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f41294s0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        this.f51592b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.B1;
        boolean z10 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f51593c;
        if (!z10 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 == launchActivity.M0 && !launchActivity.N0) {
            launchActivity.N0 = true;
            org.telegram.messenger.g0.h3(new jz(this, 18));
        }
        if (!launchActivity.M0) {
            i0.b bVar = this.f51591a;
            int l1 = org.telegram.messenger.g0.l1(size, bVar.f15120a, bVar.f15122c);
            launchActivity.f41286o0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f41290q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f41286o0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f41296t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f41294s0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f41288p0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.b bVar2 = this.f51591a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f15121b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f51592b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f51592b) {
            return;
        }
        super.requestLayout();
    }
}
