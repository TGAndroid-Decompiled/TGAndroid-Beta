package r0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
public final class w implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap f54056a = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
        boolean z10;
        int i3;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f54056a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (booleanValue != z10) {
                    if (z10) {
                        i3 = 16;
                    } else {
                        i3 = 32;
                    }
                    i0.f(i3, view);
                    entry.setValue(Boolean.valueOf(z10));
                }
            }
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
