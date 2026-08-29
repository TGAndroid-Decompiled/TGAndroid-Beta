package u0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
public final class e extends r0.b {
    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override
    public final void c(View view, s0.c cVar) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47482a;
        this.f46792a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        cVar.i("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.b(s0.b.f47476e);
                cVar.b(s0.b.f47477f);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.b(s0.b.d);
                cVar.b(s0.b.f47478g);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r5, int r6, android.os.Bundle r7) {
        throw new UnsupportedOperationException("Method not decompiled: u0.e.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
