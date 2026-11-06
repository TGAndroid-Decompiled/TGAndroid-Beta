package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v80 extends RelativeLayout {
    public i0.b f50600a;
    public boolean f50601b;
    public final LaunchActivity f50602c;

    public v80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f50602c = launchActivity;
        this.f50600a = i0.b.f15116e;
        wr wrVar = new wr(this, 17);
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.a0.i(this, wrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f50602c.f41253p0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f50602c;
        if (!launchActivity.M0) {
            i0.b bVar = this.f50600a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, bVar.f15117a, bVar.f15119c);
            launchActivity.f41251o0.getView().layout(0, 0, launchActivity.f41251o0.getView().getMeasuredWidth(), launchActivity.f41251o0.getView().getMeasuredHeight());
            launchActivity.f41255q0.getView().layout(l1, 0, launchActivity.f41255q0.getView().getMeasuredWidth() + l1, launchActivity.f41255q0.getView().getMeasuredHeight());
        } else {
            launchActivity.f41251o0.getView().layout(0, 0, launchActivity.f41251o0.getView().getMeasuredWidth(), launchActivity.f41251o0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f41253p0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f50600a.f15118b;
        launchActivity.f41253p0.getView().layout(measuredWidth2, L, launchActivity.f41253p0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f41253p0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.f41261t0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.f41261t0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f41259s0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f41259s0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        this.f50601b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.B1;
        boolean z10 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f50602c;
        if (!z10 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 == launchActivity.M0 && !launchActivity.N0) {
            launchActivity.N0 = true;
            org.telegram.messenger.g0.h3(new hz(this, 18));
        }
        if (!launchActivity.M0) {
            i0.b bVar = this.f50600a;
            int l1 = org.telegram.messenger.g0.l1(size, bVar.f15117a, bVar.f15119c);
            launchActivity.f41251o0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f41255q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f41251o0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f41261t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f41259s0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f41253p0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.b bVar2 = this.f50600a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f15118b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f50601b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f50601b) {
            return;
        }
        super.requestLayout();
    }
}
