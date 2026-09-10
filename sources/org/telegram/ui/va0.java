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
    public i0.c f37513a;
    public boolean f37514b;
    public final LaunchActivity f37515c;

    public va0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f37515c = launchActivity;
        this.f37513a = i0.c.e;
        iu iuVar = new iu(this, 15);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(this, iuVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f37515c.f29959r0;
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
        LaunchActivity launchActivity = this.f37515c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.c cVar = this.f37513a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, cVar.f10074a, cVar.f10076c);
            launchActivity.f29957q0.getView().layout(0, 0, launchActivity.f29957q0.getView().getMeasuredWidth(), launchActivity.f29957q0.getView().getMeasuredHeight());
            launchActivity.f29961s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f29961s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f29961s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f29957q0.getView().layout(0, 0, launchActivity.f29957q0.getView().getMeasuredWidth(), launchActivity.f29957q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f29959r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f37513a.f10075b;
        launchActivity.f29959r0.getView().layout(measuredWidth2, dp, launchActivity.f29959r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f29959r0.getView().getMeasuredHeight() + dp);
        gg.z1 z1Var = launchActivity.f29967v0;
        z1Var.layout(0, 0, z1Var.getMeasuredWidth(), launchActivity.f29967v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f29965u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f29965u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37514b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f37515c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.c cVar = this.f37513a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, cVar.f10074a, cVar.f10076c);
            launchActivity.f29957q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f29961s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f29957q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f29967v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f29965u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f29959r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.c cVar2 = this.f37513a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.f10075b) - cVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f37514b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37514b) {
            return;
        }
        super.requestLayout();
    }
}
