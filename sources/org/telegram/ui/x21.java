package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class x21 extends PopupWindow {
    public static final Field f43210c;
    public static final org.telegram.ui.ActionBar.c1 d = new org.telegram.ui.ActionBar.c1(2);
    public final ViewTreeObserver.OnScrollChangedListener f43211a;
    public ViewTreeObserver f43212b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f43210c = field;
    }

    public x21(g31 g31Var) {
        super(g31Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f43210c;
        if (field != null) {
            try {
                this.f43211a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f43211a = null;
            }
        }
    }

    public final void b() {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public final void c(View view) {
        ViewTreeObserver viewTreeObserver;
        if (getContentView() instanceof g31) {
            ((g31) getContentView()).s(new w21(this, 1));
        }
        if (this.f43211a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f43212b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f43212b.removeOnScrollChangedListener(this.f43211a);
                }
                this.f43212b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f43211a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof g31) {
            g31 g31Var = (g31) getContentView();
            w21 w21Var = new w21(this, 0);
            Integer num = g31Var.Z1;
            if (num != null) {
                g31.f37286d2.put(num, g31Var.f37325r0.e0());
            }
            ValueAnimator valueAnimator = g31Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g31Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            g31Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new i11(g31Var, 3));
            g31Var.W1.addListener(new org.telegram.ui.Components.jw0(10, (Object) g31Var, (Object) w21Var));
            g31Var.W1.setDuration(200L);
            g31Var.W1.setInterpolator(org.telegram.ui.Components.gr.h);
            g31Var.W1.start();
            y11 y11Var = g31Var.f37301f0;
            if (y11Var != null) {
                org.telegram.messenger.i0.v1(y11Var.h);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
                try {
                    int i10 = layoutParams.flags;
                    if ((i10 & 2) != 0) {
                        layoutParams.flags = i10 & (-3);
                        layoutParams.dimAmount = 0.0f;
                        windowManager.updateViewLayout(rootView, layoutParams);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        super.dismiss();
    }

    @Override
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f43211a != null && (viewTreeObserver = this.f43212b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f43212b.removeOnScrollChangedListener(this.f43211a);
            }
            this.f43212b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
        c(view);
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
        c(view);
    }
}
