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
        WindowInsets windowInsetsG = m1Var.g();
        if (windowInsetsG != null) {
            return m1.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
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
        c1 z0Var;
        if (x0.d && view.isAttachedToWindow()) {
            try {
                Object obj = x0.f46648a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) x0.f46649b.get(obj);
                    Rect rect2 = (Rect) x0.f46650c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 34) {
                            z0Var = new b1();
                        } else if (i10 >= 30) {
                            z0Var = new a1();
                        } else {
                            z0Var = i10 >= 29 ? new z0() : new y0();
                        }
                        z0Var.e(i0.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        z0Var.g(i0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        m1 m1VarB = z0Var.b();
                        m1VarB.f46619a.r(m1VarB);
                        m1VarB.f46619a.d(view.getRootView());
                        return m1VarB;
                    }
                }
            } catch (IllegalAccessException e9) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e9.getMessage(), e9);
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
        a0 a0Var = oVar != null ? new a0(view, oVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131296687, a0Var);
        }
        if (view.getTag(2131296686) != null) {
            return;
        }
        if (a0Var != null) {
            view.setOnApplyWindowInsetsListener(a0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131296698));
        }
    }

    public static void k(View view) {
        view.stopNestedScroll();
    }
}
