package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xv0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f43281a;
    public final PopupNotificationActivity f43282b;

    public xv0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f43281a = i10;
        this.f43282b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f43281a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f43282b;
                FrameLayout frameLayout = popupNotificationActivity.f33478f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int B = org.telegram.messenger.wh.B(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f33478f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), B, popupNotificationActivity.f33478f.getPaddingRight(), B);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f43282b;
                popupNotificationActivity2.f33479n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f33479n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f33479n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
