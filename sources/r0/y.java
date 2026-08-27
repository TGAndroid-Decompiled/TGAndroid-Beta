package r0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

public final class y implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    public final WeakHashMap f46651a = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f46651a.entrySet()) {
                View view = (View) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z10) {
                    j0.g(z10 ? 16 : 32, view);
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
