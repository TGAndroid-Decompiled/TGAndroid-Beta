package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class u51 extends PopupWindow {
    public static final Field f43184c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f43185a;
    public ViewTreeObserver f43186b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f43184c = field;
    }

    public u51(d61 d61Var) {
        super(d61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f43184c;
        if (field != null) {
            try {
                this.f43185a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f43185a = null;
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
        if (getContentView() instanceof d61) {
            ((d61) getContentView()).s(new t51(this, 1));
        }
        if (this.f43185a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f43186b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f43186b.removeOnScrollChangedListener(this.f43185a);
                }
                this.f43186b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f43185a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof d61) {
            d61 d61Var = (d61) getContentView();
            t51 t51Var = new t51(this, 0);
            Integer num = d61Var.U1;
            if (num != null) {
                d61.Y1.put(num, d61Var.f37347n0.e0());
            }
            ValueAnimator valueAnimator = d61Var.R1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                d61Var.R1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            d61Var.R1 = ofFloat;
            ofFloat.addUpdateListener(new g41(d61Var, 3));
            d61Var.R1.addListener(new org.telegram.ui.Components.ok0(16, d61Var, t51Var));
            d61Var.R1.setDuration(200L);
            d61Var.R1.setInterpolator(org.telegram.ui.Components.jr.h);
            d61Var.R1.start();
            u41 u41Var = d61Var.f37321b0;
            if (u41Var != null) {
                AndroidUtilities.hideKeyboard(u41Var.h);
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
        if (this.f43185a != null && (viewTreeObserver = this.f43186b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f43186b.removeOnScrollChangedListener(this.f43185a);
            }
            this.f43186b = null;
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
