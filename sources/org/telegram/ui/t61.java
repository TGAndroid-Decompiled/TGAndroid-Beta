package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class t61 extends PopupWindow {
    public static final Field f40695c;
    public static final org.telegram.ui.ActionBar.g1 d = new org.telegram.ui.ActionBar.g1(2);
    public final ViewTreeObserver.OnScrollChangedListener f40696a;
    public ViewTreeObserver f40697b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f40695c = field;
    }

    public t61(c71 c71Var) {
        super(c71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f40695c;
        if (field != null) {
            try {
                this.f40696a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f40696a = null;
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
        if (getContentView() instanceof c71) {
            ((c71) getContentView()).s(new s61(this, 1));
        }
        if (this.f40696a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f40697b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f40697b.removeOnScrollChangedListener(this.f40696a);
                }
                this.f40697b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f40696a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof c71) {
            c71 c71Var = (c71) getContentView();
            s61 s61Var = new s61(this, 0);
            Integer num = c71Var.Y1;
            if (num != null) {
                c71.f35294c2.put(num, c71Var.f35334r0.e0());
            }
            ValueAnimator valueAnimator = c71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                c71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            c71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new f51(c71Var, 3));
            c71Var.V1.addListener(new org.telegram.ui.Components.cl0(15, c71Var, s61Var));
            c71Var.V1.setDuration(200L);
            c71Var.V1.setInterpolator(org.telegram.ui.Components.tr.h);
            c71Var.V1.start();
            t51 t51Var = c71Var.f35310f0;
            if (t51Var != null) {
                AndroidUtilities.hideKeyboard(t51Var.h);
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
        if (this.f40696a != null && (viewTreeObserver = this.f40697b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40697b.removeOnScrollChangedListener(this.f40696a);
            }
            this.f40697b = null;
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
