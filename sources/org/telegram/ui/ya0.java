package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ya0 extends RelativeLayout {
    public i0.b f41794a;
    public boolean f41795b;
    public final LaunchActivity f41796c;

    public ya0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f41796c = launchActivity;
        this.f41794a = i0.b.e;
        mu muVar = new mu(this, 15);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(this, muVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f41796c.f31837r0;
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
        LaunchActivity launchActivity = this.f41796c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f41794a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f10892a, bVar.f10894c);
            launchActivity.f31835q0.getView().layout(0, 0, launchActivity.f31835q0.getView().getMeasuredWidth(), launchActivity.f31835q0.getView().getMeasuredHeight());
            launchActivity.f31839s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f31839s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f31839s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f31835q0.getView().layout(0, 0, launchActivity.f31835q0.getView().getMeasuredWidth(), launchActivity.f31835q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f31837r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f41794a.f10893b;
        launchActivity.f31837r0.getView().layout(measuredWidth2, dp, launchActivity.f31837r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f31837r0.getView().getMeasuredHeight() + dp);
        ig.q1 q1Var = launchActivity.f31845v0;
        q1Var.layout(0, 0, q1Var.getMeasuredWidth(), launchActivity.f31845v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f31843u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f31843u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f41795b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f41796c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.b bVar = this.f41794a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f10892a, bVar.f10894c);
            launchActivity.f31835q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f31839s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f31835q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f31845v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f31843u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f31837r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f41794a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f10893b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f41795b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f41795b) {
            return;
        }
        super.requestLayout();
    }
}
