package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ua0 extends RelativeLayout {
    public i0.b f42384a;
    public boolean f42385b;
    public final LaunchActivity f42386c;

    public ua0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f42386c = launchActivity;
        this.f42384a = i0.b.f11575e;
        gu guVar = new gu(this, 15);
        WeakHashMap weakHashMap = r0.i0.f46766a;
        r0.a0.i(this, guVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f42386c.f33809r0;
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
        LaunchActivity launchActivity = this.f42386c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f42384a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f11576a, bVar.f11578c);
            launchActivity.f33807q0.getView().layout(0, 0, launchActivity.f33807q0.getView().getMeasuredWidth(), launchActivity.f33807q0.getView().getMeasuredHeight());
            launchActivity.f33811s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f33811s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f33811s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f33807q0.getView().layout(0, 0, launchActivity.f33807q0.getView().getMeasuredWidth(), launchActivity.f33807q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f33809r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f42384a.f11577b;
        launchActivity.f33809r0.getView().layout(measuredWidth2, dp, launchActivity.f33809r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f33809r0.getView().getMeasuredHeight() + dp);
        hg.r1 r1Var = launchActivity.f33817v0;
        r1Var.layout(0, 0, r1Var.getMeasuredWidth(), launchActivity.f33817v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f33815u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f33815u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f42385b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f42386c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.O0 = false;
            i0.b bVar = this.f42384a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f11576a, bVar.f11578c);
            launchActivity.f33807q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f33811s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.O0 = true;
            launchActivity.f33807q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f33817v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f33815u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f33809r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f42384a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f11577b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f42385b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f42385b) {
            return;
        }
        super.requestLayout();
    }
}
