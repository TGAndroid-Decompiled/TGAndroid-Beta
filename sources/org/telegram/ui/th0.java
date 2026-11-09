package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class th0 extends FrameLayout {
    public TextView f50184a;
    public RadioButton f50185b;
    public org.telegram.ui.Components.wo f50186c;
    public boolean d;
    public sh0 f50187e;

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.d) {
            float f11 = 60.0f;
            if (org.telegram.messenger.id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = 60.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!org.telegram.messenger.id.f23157a0) {
                f11 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.g0.L(f11), getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f50185b.f31522f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
