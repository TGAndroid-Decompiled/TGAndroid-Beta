package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x80 extends RelativeLayout {
    public i0.b f53753a;
    public boolean f53754b;
    public final LaunchActivity f53755c;

    public x80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f53755c = launchActivity;
        this.f53753a = i0.b.f15891e;
        zr zrVar = new zr(this, 17);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(this, zrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f53755c.f43096q0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f53755c;
        if (!launchActivity.N0) {
            i0.b bVar = this.f53753a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, bVar.f15892a, bVar.f15894c);
            launchActivity.f43094p0.getView().layout(0, 0, launchActivity.f43094p0.getView().getMeasuredWidth(), launchActivity.f43094p0.getView().getMeasuredHeight());
            launchActivity.f43098r0.getView().layout(l1, 0, launchActivity.f43098r0.getView().getMeasuredWidth() + l1, launchActivity.f43098r0.getView().getMeasuredHeight());
        } else {
            launchActivity.f43094p0.getView().layout(0, 0, launchActivity.f43094p0.getView().getMeasuredWidth(), launchActivity.f43094p0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f43096q0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f53753a.f15893b;
        launchActivity.f43096q0.getView().layout(measuredWidth2, L, launchActivity.f43096q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f43096q0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.f43104u0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.f43104u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f43102t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f43102t0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        this.f53754b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z11 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f53755c;
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
            i0.b bVar = this.f53753a;
            int l1 = org.telegram.messenger.g0.l1(size, bVar.f15892a, bVar.f15894c);
            launchActivity.f43094p0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f43098r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f43094p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f43104u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f43102t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f43096q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.b bVar2 = this.f53753a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f15893b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f53754b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f53754b) {
            return;
        }
        super.requestLayout();
    }
}
