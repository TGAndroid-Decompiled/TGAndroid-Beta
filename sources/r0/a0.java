package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
public abstract class a0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131296698);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static l1 b(View view, l1 l1Var, Rect rect) {
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            return l1.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return l1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static l1 f(View view) {
        b1 x0Var;
        if (w0.d && view.isAttachedToWindow()) {
            try {
                Object obj = w0.f44740a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) w0.f44741b.get(obj);
                    Rect rect2 = (Rect) w0.f44742c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 34) {
                            x0Var = new a1();
                        } else if (i10 >= 30) {
                            x0Var = new z0();
                        } else if (i10 >= 29) {
                            x0Var = new y0();
                        } else {
                            x0Var = new x0();
                        }
                        x0Var.e(i0.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        x0Var.g(i0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        l1 b10 = x0Var.b();
                        b10.f44711a.r(b10);
                        b10.f44711a.d(view.getRootView());
                        return b10;
                    }
                }
            } catch (IllegalAccessException e7) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    public static void g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void h(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void i(View view, float f7) {
        view.setElevation(f7);
    }

    public static void j(View view, n nVar) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (nVar != null) {
            onApplyWindowInsetsListener = new z(view, nVar);
        } else {
            onApplyWindowInsetsListener = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131296687, onApplyWindowInsetsListener);
        }
        if (view.getTag(2131296686) != null) {
            return;
        }
        if (onApplyWindowInsetsListener != null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131296698));
        }
    }

    public static void k(View view) {
        view.stopNestedScroll();
    }
}
