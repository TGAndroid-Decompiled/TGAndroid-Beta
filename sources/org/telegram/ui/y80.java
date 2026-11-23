package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y80 extends RelativeLayout {
    public i0.b f54055a;
    public boolean f54056b;
    public final LaunchActivity f54057c;

    public y80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f54057c = launchActivity;
        this.f54055a = i0.b.f15882e;
        zr zrVar = new zr(this, 17);
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.a0.i(this, zrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f54057c.f43106q0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f54057c;
        if (!launchActivity.N0) {
            i0.b bVar = this.f54055a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, bVar.f15883a, bVar.f15885c);
            launchActivity.f43104p0.getView().layout(0, 0, launchActivity.f43104p0.getView().getMeasuredWidth(), launchActivity.f43104p0.getView().getMeasuredHeight());
            launchActivity.f43108r0.getView().layout(l1, 0, launchActivity.f43108r0.getView().getMeasuredWidth() + l1, launchActivity.f43108r0.getView().getMeasuredHeight());
        } else {
            launchActivity.f43104p0.getView().layout(0, 0, launchActivity.f43104p0.getView().getMeasuredWidth(), launchActivity.f43104p0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f43106q0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f54055a.f15884b;
        launchActivity.f43106q0.getView().layout(measuredWidth2, L, launchActivity.f43106q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f43106q0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.f43114u0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.f43114u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f43112t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f43112t0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        this.f54056b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z11 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f54057c;
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
            i0.b bVar = this.f54055a;
            int l1 = org.telegram.messenger.g0.l1(size, bVar.f15883a, bVar.f15885c);
            launchActivity.f43104p0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f43108r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f43104p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f43114u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f43112t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f43106q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.b bVar2 = this.f54055a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f15884b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f54056b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f54056b) {
            return;
        }
        super.requestLayout();
    }
}
