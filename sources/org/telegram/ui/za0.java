package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class za0 extends RelativeLayout {
    public i0.b f42579a;
    public boolean f42580b;
    public final LaunchActivity f42581c;

    public za0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f42581c = launchActivity;
        this.f42579a = i0.b.e;
        mu muVar = new mu(this, 15);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(this, muVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f42581c.f32135r0;
        if (actionBarLayout != null) {
            actionBarLayout.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        boolean z11 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f42581c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f42579a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f10888a, bVar.f10890c);
            launchActivity.f32133q0.getView().layout(0, 0, launchActivity.f32133q0.getView().getMeasuredWidth(), launchActivity.f32133q0.getView().getMeasuredHeight());
            launchActivity.f32137s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f32137s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f32137s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f32133q0.getView().layout(0, 0, launchActivity.f32133q0.getView().getMeasuredWidth(), launchActivity.f32133q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f32135r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f42579a.f10889b;
        launchActivity.f32135r0.getView().layout(measuredWidth2, dp, launchActivity.f32135r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f32135r0.getView().getMeasuredHeight() + dp);
        ig.q1 q1Var = launchActivity.f32143v0;
        q1Var.layout(0, 0, q1Var.getMeasuredWidth(), launchActivity.f32143v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f32141u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f32141u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f42580b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f42581c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.b bVar = this.f42579a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f10888a, bVar.f10890c);
            launchActivity.f32133q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f32137s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f32133q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f32143v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f32141u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f32135r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f42579a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f10889b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f42580b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f42580b) {
            return;
        }
        super.requestLayout();
    }
}
