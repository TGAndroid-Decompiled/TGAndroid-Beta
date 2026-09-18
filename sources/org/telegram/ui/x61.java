package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class x61 extends PopupWindow {
    public static final Field f39366c;
    public static final org.telegram.ui.ActionBar.g1 d = new org.telegram.ui.ActionBar.g1(2);
    public final ViewTreeObserver.OnScrollChangedListener f39367a;
    public ViewTreeObserver f39368b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f39366c = field;
    }

    public x61(g71 g71Var) {
        super(g71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f39366c;
        if (field != null) {
            try {
                this.f39367a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f39367a = null;
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
        if (getContentView() instanceof g71) {
            ((g71) getContentView()).s(new w61(this, 1));
        }
        if (this.f39367a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f39368b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f39368b.removeOnScrollChangedListener(this.f39367a);
                }
                this.f39368b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f39367a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof g71) {
            g71 g71Var = (g71) getContentView();
            w61 w61Var = new w61(this, 0);
            Integer num = g71Var.Y1;
            if (num != null) {
                g71.f33709c2.put(num, g71Var.f33748r0.e0());
            }
            ValueAnimator valueAnimator = g71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            g71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new j51(g71Var, 3));
            g71Var.V1.addListener(new org.telegram.ui.Components.al0(15, g71Var, w61Var));
            g71Var.V1.setDuration(200L);
            g71Var.V1.setInterpolator(org.telegram.ui.Components.qr.h);
            g71Var.V1.start();
            x51 x51Var = g71Var.f33724f0;
            if (x51Var != null) {
                AndroidUtilities.hideKeyboard(x51Var.h);
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
        if (this.f39367a != null && (viewTreeObserver = this.f39368b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f39368b.removeOnScrollChangedListener(this.f39367a);
            }
            this.f39368b = null;
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
