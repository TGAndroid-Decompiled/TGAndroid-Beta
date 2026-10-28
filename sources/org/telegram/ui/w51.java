package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class w51 extends PopupWindow {
    public static final Field f44522c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f44523a;
    public ViewTreeObserver f44524b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f44522c = field;
    }

    public w51(f61 f61Var) {
        super(f61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f44522c;
        if (field != null) {
            try {
                this.f44523a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f44523a = null;
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
        if (getContentView() instanceof f61) {
            ((f61) getContentView()).s(new v51(this, 1));
        }
        if (this.f44523a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f44524b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f44524b.removeOnScrollChangedListener(this.f44523a);
                }
                this.f44524b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f44523a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof f61) {
            f61 f61Var = (f61) getContentView();
            v51 v51Var = new v51(this, 0);
            Integer num = f61Var.Z1;
            if (num != null) {
                f61.f39183d2.put(num, f61Var.f39222r0.e0());
            }
            ValueAnimator valueAnimator = f61Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                f61Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            f61Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new g41(f61Var, 3));
            f61Var.W1.addListener(new org.telegram.ui.Components.ml0(14, f61Var, v51Var));
            f61Var.W1.setDuration(200L);
            f61Var.W1.setInterpolator(org.telegram.ui.Components.ds.h);
            f61Var.W1.start();
            w41 w41Var = f61Var.f39198f0;
            if (w41Var != null) {
                AndroidUtilities.hideKeyboard(w41Var.h);
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
        if (this.f44523a != null && (viewTreeObserver = this.f44524b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f44524b.removeOnScrollChangedListener(this.f44523a);
            }
            this.f44524b = null;
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
