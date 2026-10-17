package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public abstract class a0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131296698);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static k1 b(View view, k1 k1Var, Rect rect) {
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            return k1.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return k1Var;
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

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f7) {
        view.setElevation(f7);
    }

    public static void i(View view, n nVar) {
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

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
