package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public abstract class b0 {
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

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f7) {
        view.setElevation(f7);
    }

    public static void i(View view, o oVar) {
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

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
