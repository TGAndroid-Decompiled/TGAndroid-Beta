package u0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
public final class e extends r0.b {
    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z4;
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override
    public final void c(View view, s0.d dVar) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46850a;
        this.f46401a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        dVar.i("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                dVar.b(s0.c.f46844e);
                dVar.b(s0.c.f46845f);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                dVar.b(s0.c.d);
                dVar.b(s0.c.f46846g);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r5, int r6, android.os.Bundle r7) {
        throw new UnsupportedOperationException("Method not decompiled: u0.e.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
