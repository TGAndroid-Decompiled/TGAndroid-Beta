package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class z61 extends PopupWindow {
    public static final Field f40138c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f40139a;
    public ViewTreeObserver f40140b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f40138c = field;
    }

    public z61(i71 i71Var) {
        super(i71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f40138c;
        if (field != null) {
            try {
                this.f40139a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f40139a = null;
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
        if (getContentView() instanceof i71) {
            ((i71) getContentView()).s(new y61(this, 1));
        }
        if (this.f40139a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f40140b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f40140b.removeOnScrollChangedListener(this.f40139a);
                }
                this.f40140b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f40139a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof i71) {
            i71 i71Var = (i71) getContentView();
            y61 y61Var = new y61(this, 0);
            Integer num = i71Var.Y1;
            if (num != null) {
                i71.f34447c2.put(num, i71Var.f34486r0.e0());
            }
            ValueAnimator valueAnimator = i71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                i71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            i71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new l51(i71Var, 3));
            i71Var.V1.addListener(new org.telegram.ui.Components.qk0(15, i71Var, y61Var));
            i71Var.V1.setDuration(200L);
            i71Var.V1.setInterpolator(org.telegram.ui.Components.qr.h);
            i71Var.V1.start();
            z51 z51Var = i71Var.f34462f0;
            if (z51Var != null) {
                AndroidUtilities.hideKeyboard(z51Var.h);
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
        if (this.f40139a != null && (viewTreeObserver = this.f40140b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40140b.removeOnScrollChangedListener(this.f40139a);
            }
            this.f40140b = null;
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
