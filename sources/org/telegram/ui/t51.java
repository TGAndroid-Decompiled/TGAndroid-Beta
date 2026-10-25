package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class t51 extends PopupWindow {
    public static final Field f43682c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f43683a;
    public ViewTreeObserver f43684b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f43682c = field;
    }

    public t51(c61 c61Var) {
        super(c61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f43682c;
        if (field != null) {
            try {
                this.f43683a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f43683a = null;
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
        if (getContentView() instanceof c61) {
            ((c61) getContentView()).s(new s51(this, 1));
        }
        if (this.f43683a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f43684b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f43684b.removeOnScrollChangedListener(this.f43683a);
                }
                this.f43684b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f43683a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof c61) {
            c61 c61Var = (c61) getContentView();
            s51 s51Var = new s51(this, 0);
            Integer num = c61Var.Z1;
            if (num != null) {
                c61.f38277d2.put(num, c61Var.f38316r0.e0());
            }
            ValueAnimator valueAnimator = c61Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                c61Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            c61Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new d41(c61Var, 3));
            c61Var.W1.addListener(new org.telegram.ui.Components.ll0(14, c61Var, s51Var));
            c61Var.W1.setDuration(200L);
            c61Var.W1.setInterpolator(org.telegram.ui.Components.ds.h);
            c61Var.W1.start();
            t41 t41Var = c61Var.f38292f0;
            if (t41Var != null) {
                AndroidUtilities.hideKeyboard(t41Var.h);
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
        if (this.f43683a != null && (viewTreeObserver = this.f43684b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f43684b.removeOnScrollChangedListener(this.f43683a);
            }
            this.f43684b = null;
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
