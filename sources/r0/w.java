package r0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
public final class w implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap f54231a = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
        boolean z9;
        int i7;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f54231a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (booleanValue != z9) {
                    if (z9) {
                        i7 = 16;
                    } else {
                        i7 = 32;
                    }
                    i0.f(i7, view);
                    entry.setValue(Boolean.valueOf(z9));
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
