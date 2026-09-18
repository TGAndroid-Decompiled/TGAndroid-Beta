package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xa0 extends RelativeLayout {
    public i0.b f39418a;
    public boolean f39419b;
    public final LaunchActivity f39420c;

    public xa0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f39420c = launchActivity;
        this.f39418a = i0.b.e;
        fu fuVar = new fu(this, 16);
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.a0.j(this, fuVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f39420c.f31090r0;
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
        LaunchActivity launchActivity = this.f39420c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f39418a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f10591a, bVar.f10593c);
            launchActivity.f31088q0.getView().layout(0, 0, launchActivity.f31088q0.getView().getMeasuredWidth(), launchActivity.f31088q0.getView().getMeasuredHeight());
            launchActivity.f31092s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f31092s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f31092s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f31088q0.getView().layout(0, 0, launchActivity.f31088q0.getView().getMeasuredWidth(), launchActivity.f31088q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f31090r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f39418a.f10592b;
        launchActivity.f31090r0.getView().layout(measuredWidth2, dp, launchActivity.f31090r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f31090r0.getView().getMeasuredHeight() + dp);
        hg.q1 q1Var = launchActivity.f31098v0;
        q1Var.layout(0, 0, q1Var.getMeasuredWidth(), launchActivity.f31098v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f31096u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f31096u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39419b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f39420c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.b bVar = this.f39418a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f10591a, bVar.f10593c);
            launchActivity.f31088q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f31092s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f31088q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f31098v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f31096u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f31090r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f39418a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f10592b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f39419b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39419b) {
            return;
        }
        super.requestLayout();
    }
}
