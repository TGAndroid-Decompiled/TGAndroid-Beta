package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vz0 extends s01 {
    public vz0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bi.b4 b4Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.s5 s5Var = this.e;
        if (s5Var != null && (b4Var = s5Var.f29031k) != null) {
            b4Var.startAnimation();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
