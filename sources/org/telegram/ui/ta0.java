package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ta0 extends RelativeLayout {
    public i0.b f37745a;
    public boolean f37746b;
    public final LaunchActivity f37747c;

    public ta0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f37747c = launchActivity;
        this.f37745a = i0.b.e;
        au auVar = new au(this, 17);
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.a0.j(this, auVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f37747c.f31134r0;
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
        LaunchActivity launchActivity = this.f37747c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f37745a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f10579a, bVar.f10581c);
            launchActivity.f31132q0.getView().layout(0, 0, launchActivity.f31132q0.getView().getMeasuredWidth(), launchActivity.f31132q0.getView().getMeasuredHeight());
            launchActivity.f31136s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f31136s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f31136s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f31132q0.getView().layout(0, 0, launchActivity.f31132q0.getView().getMeasuredWidth(), launchActivity.f31132q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f31134r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f37745a.f10580b;
        launchActivity.f31134r0.getView().layout(measuredWidth2, dp, launchActivity.f31134r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f31134r0.getView().getMeasuredHeight() + dp);
        hg.q1 q1Var = launchActivity.f31142v0;
        q1Var.layout(0, 0, q1Var.getMeasuredWidth(), launchActivity.f31142v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f31140u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f31140u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37746b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f37747c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.b bVar = this.f37745a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f10579a, bVar.f10581c);
            launchActivity.f31132q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f31136s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f31132q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f31142v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f31140u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f31134r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f37745a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f10580b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f37746b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37746b) {
            return;
        }
        super.requestLayout();
    }
}
