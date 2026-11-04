package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
public final class vr0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f50605a;
    public final PopupNotificationActivity f50606b;

    public vr0(PopupNotificationActivity popupNotificationActivity, int i3) {
        this.f50605a = i3;
        this.f50606b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f50605a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f50606b;
                FrameLayout frameLayout = popupNotificationActivity.f41625f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int y9 = org.telegram.messenger.camera.q.y(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f41625f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), y9, popupNotificationActivity.f41625f.getPaddingRight(), y9);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f50606b;
                popupNotificationActivity2.f41626n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f41626n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f41626n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
