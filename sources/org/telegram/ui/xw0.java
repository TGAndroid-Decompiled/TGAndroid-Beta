package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xw0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f41973a;
    public final PopupNotificationActivity f41974b;

    public xw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f41973a = i10;
        this.f41974b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f41973a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f41974b;
                FrameLayout frameLayout = popupNotificationActivity.f32438f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int B = org.telegram.messenger.yh.B(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f32438f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), B, popupNotificationActivity.f32438f.getPaddingRight(), B);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f41974b;
                popupNotificationActivity2.f32439n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f32439n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f32439n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
