package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wv0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f39800a;
    public final PopupNotificationActivity f39801b;

    public wv0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.f39800a = i10;
        this.f39801b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f39800a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.f39801b;
                FrameLayout frameLayout = popupNotificationActivity.f31944f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int x10 = b.x(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f31944f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), x10, popupNotificationActivity.f31944f.getPaddingRight(), x10);
                return true;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.f39801b;
                popupNotificationActivity2.f31945n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.U) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.f31945n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.f31945n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    return true;
                }
                return true;
        }
    }
}
