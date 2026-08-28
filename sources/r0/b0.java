package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
public abstract class b0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131296698);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static m1 b(View view, m1 m1Var, Rect rect) {
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            return m1.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return m1Var;
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

    public static m1 f(View view) {
        c1 y0Var;
        if (x0.d && view.isAttachedToWindow()) {
            try {
                Object obj = x0.f46958a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) x0.f46959b.get(obj);
                    Rect rect2 = (Rect) x0.f46960c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 34) {
                            y0Var = new b1();
                        } else if (i9 >= 30) {
                            y0Var = new a1();
                        } else if (i9 >= 29) {
                            y0Var = new z0();
                        } else {
                            y0Var = new y0();
                        }
                        y0Var.e(i0.b.b(rect.left, rect.top, rect.right, rect.bottom));
                        y0Var.g(i0.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        m1 b10 = y0Var.b();
                        b10.f46929a.r(b10);
                        b10.f46929a.d(view.getRootView());
                        return b10;
                    }
                }
            } catch (IllegalAccessException e10) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
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

    public static void i(View view, float f10) {
        view.setElevation(f10);
    }

    public static void j(View view, o oVar) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (oVar != null) {
            onApplyWindowInsetsListener = new a0(view, oVar);
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
