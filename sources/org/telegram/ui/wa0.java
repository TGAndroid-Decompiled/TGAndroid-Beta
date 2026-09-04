package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class wa0 extends RelativeLayout {
    public i0.c f41864a;
    public boolean f41865b;
    public final LaunchActivity f41866c;

    public wa0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f41866c = launchActivity;
        this.f41864a = i0.c.f11424e;
        iu iuVar = new iu(this, 15);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(this, iuVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f41866c.f33455r0;
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
        LaunchActivity launchActivity = this.f41866c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.c cVar = this.f41864a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, cVar.f11425a, cVar.f11427c);
            launchActivity.f33453q0.getView().layout(0, 0, launchActivity.f33453q0.getView().getMeasuredWidth(), launchActivity.f33453q0.getView().getMeasuredHeight());
            launchActivity.f33457s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f33457s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f33457s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f33453q0.getView().layout(0, 0, launchActivity.f33453q0.getView().getMeasuredWidth(), launchActivity.f33453q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f33455r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f41864a.f11426b;
        launchActivity.f33455r0.getView().layout(measuredWidth2, dp, launchActivity.f33455r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f33455r0.getView().getMeasuredHeight() + dp);
        ig.q1 q1Var = launchActivity.f33463v0;
        q1Var.layout(0, 0, q1Var.getMeasuredWidth(), launchActivity.f33463v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f33461u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f33461u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f41865b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f41866c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.c cVar = this.f41864a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, cVar.f11425a, cVar.f11427c);
            launchActivity.f33453q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f33457s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f33453q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f33463v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f33461u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f33455r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.c cVar2 = this.f41864a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.f11426b) - cVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f41865b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f41865b) {
            return;
        }
        super.requestLayout();
    }
}
