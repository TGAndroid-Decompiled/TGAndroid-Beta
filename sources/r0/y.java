package r0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
public final class y implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap f46515a = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
        boolean z4;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f46515a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (booleanValue != z4) {
                    if (z4) {
                        i10 = 16;
                    } else {
                        i10 = 32;
                    }
                    j0.g(i10, view);
                    entry.setValue(Boolean.valueOf(z4));
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
