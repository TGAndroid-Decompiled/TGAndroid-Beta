package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
public final class tr0 extends RelativeLayout {
    public final PopupNotificationActivity f49876a;

    public tr0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.f49876a = popupNotificationActivity;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.f49876a;
                childAt.layout(left, org.telegram.messenger.g0.L(3.0f) + popupNotificationActivity.f41621b.getTop(), childAt.getRight(), popupNotificationActivity.f41621b.getBottom());
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        PopupNotificationActivity popupNotificationActivity = this.f49876a;
        int measuredWidth = popupNotificationActivity.f41621b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.f41621b.getMeasuredHeight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - org.telegram.messenger.g0.L(3.0f), 1073741824));
            }
        }
    }
}
