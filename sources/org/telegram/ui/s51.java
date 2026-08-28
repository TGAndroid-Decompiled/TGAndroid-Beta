package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class s51 extends PopupWindow {
    public static final Field f42563c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f42564a;
    public ViewTreeObserver f42565b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f42563c = field;
    }

    public s51(b61 b61Var) {
        super(b61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f42563c;
        if (field != null) {
            try {
                this.f42564a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f42564a = null;
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
        if (getContentView() instanceof b61) {
            ((b61) getContentView()).s(new r51(this, 1));
        }
        if (this.f42564a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f42565b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f42565b.removeOnScrollChangedListener(this.f42564a);
                }
                this.f42565b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f42564a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof b61) {
            b61 b61Var = (b61) getContentView();
            r51 r51Var = new r51(this, 0);
            Integer num = b61Var.U1;
            if (num != null) {
                b61.Y1.put(num, b61Var.f36690n0.e0());
            }
            ValueAnimator valueAnimator = b61Var.R1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                b61Var.R1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            b61Var.R1 = ofFloat;
            ofFloat.addUpdateListener(new e41(b61Var, 3));
            b61Var.R1.addListener(new org.telegram.ui.Components.su0(13, b61Var, r51Var));
            b61Var.R1.setDuration(200L);
            b61Var.R1.setInterpolator(org.telegram.ui.Components.gr.h);
            b61Var.R1.start();
            s41 s41Var = b61Var.f36664b0;
            if (s41Var != null) {
                AndroidUtilities.hideKeyboard(s41Var.h);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
                try {
                    int i9 = layoutParams.flags;
                    if ((i9 & 2) != 0) {
                        layoutParams.flags = i9 & (-3);
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
    public final void showAtLocation(View view, int i9, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i9, i10, i11);
        if (this.f42564a != null && (viewTreeObserver = this.f42565b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f42565b.removeOnScrollChangedListener(this.f42564a);
            }
            this.f42565b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i9, int i10) {
        super.showAsDropDown(view, i9, i10);
        c(view);
    }

    @Override
    public final void showAsDropDown(View view, int i9, int i10, int i11) {
        super.showAsDropDown(view, i9, i10, i11);
        c(view);
    }
}
