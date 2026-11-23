package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y80 extends RelativeLayout {
    public i0.b f54079a;
    public boolean f54080b;
    public final LaunchActivity f54081c;

    public y80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f54081c = launchActivity;
        this.f54079a = i0.b.f15916e;
        zr zrVar = new zr(this, 17);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(this, zrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f54081c.f43141q0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f54081c;
        if (!launchActivity.N0) {
            i0.b bVar = this.f54079a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, bVar.f15917a, bVar.f15919c);
            launchActivity.f43139p0.getView().layout(0, 0, launchActivity.f43139p0.getView().getMeasuredWidth(), launchActivity.f43139p0.getView().getMeasuredHeight());
            launchActivity.f43143r0.getView().layout(l1, 0, launchActivity.f43143r0.getView().getMeasuredWidth() + l1, launchActivity.f43143r0.getView().getMeasuredHeight());
        } else {
            launchActivity.f43139p0.getView().layout(0, 0, launchActivity.f43139p0.getView().getMeasuredWidth(), launchActivity.f43139p0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f43141q0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f54079a.f15918b;
        launchActivity.f43141q0.getView().layout(measuredWidth2, L, launchActivity.f43141q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f43141q0.getView().getMeasuredHeight() + L);
        w8 w8Var = launchActivity.f43149u0;
        w8Var.layout(0, 0, w8Var.getMeasuredWidth(), launchActivity.f43149u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f43147t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f43147t0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        this.f54080b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z11 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f54081c;
        if (!z11 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            org.telegram.messenger.g0.g3(new lz(this, 18));
        }
        if (!launchActivity.N0) {
            i0.b bVar = this.f54079a;
            int l1 = org.telegram.messenger.g0.l1(size, bVar.f15917a, bVar.f15919c);
            launchActivity.f43139p0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f43143r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f43139p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f43149u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f43147t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f43141q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.b bVar2 = this.f54079a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f15918b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f54080b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f54080b) {
            return;
        }
        super.requestLayout();
    }
}
