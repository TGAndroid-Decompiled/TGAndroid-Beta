package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class va0 extends RelativeLayout {
    public i0.b f42740a;
    public boolean f42741b;
    public final LaunchActivity f42742c;

    public va0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f42742c = launchActivity;
        this.f42740a = i0.b.f11573e;
        ju juVar = new ju(this, 15);
        WeakHashMap weakHashMap = r0.i0.f46981a;
        r0.a0.i(this, juVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f42742c.f33646r0;
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
        LaunchActivity launchActivity = this.f42742c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f42740a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f11574a, bVar.f11576c);
            launchActivity.f33644q0.getView().layout(0, 0, launchActivity.f33644q0.getView().getMeasuredWidth(), launchActivity.f33644q0.getView().getMeasuredHeight());
            launchActivity.f33648s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f33648s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f33648s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f33644q0.getView().layout(0, 0, launchActivity.f33644q0.getView().getMeasuredWidth(), launchActivity.f33644q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f33646r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f42740a.f11575b;
        launchActivity.f33646r0.getView().layout(measuredWidth2, dp, launchActivity.f33646r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f33646r0.getView().getMeasuredHeight() + dp);
        hg.r1 r1Var = launchActivity.f33654v0;
        r1Var.layout(0, 0, r1Var.getMeasuredWidth(), launchActivity.f33654v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f33652u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f33652u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f42741b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f42742c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.b bVar = this.f42740a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f11574a, bVar.f11576c);
            launchActivity.f33644q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f33648s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f33644q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f33654v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f33652u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f33646r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f42740a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f11575b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f42741b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f42741b) {
            return;
        }
        super.requestLayout();
    }
}
