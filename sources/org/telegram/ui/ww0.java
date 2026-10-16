package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ww0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f41372a;
    public final PopupNotificationActivity f41373b;

    public ww0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f41372a = i10;
        this.f41373b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f41372a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f41373b;
                FrameLayout frameLayout = popupNotificationActivity.f32140f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int A = org.telegram.messenger.sk.A(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f32140f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), A, popupNotificationActivity.f32140f.getPaddingRight(), A);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f41373b;
                popupNotificationActivity2.f32141n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f32141n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f32141n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
