package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class vi0 extends FrameLayout {
    public TextView f42536a;
    public RadioButton f42537b;
    public org.telegram.ui.Components.ep f42538c;
    public boolean d;
    public ui0 e;

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.d) {
            float f10 = 60.0f;
            if (org.telegram.messenger.dd.X) {
                f7 = 0.0f;
            } else {
                f7 = 60.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!org.telegram.messenger.dd.X) {
                f10 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.i0.L(f10), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f42537b.f24162f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }
}
