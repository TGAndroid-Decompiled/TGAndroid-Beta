package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class y61 extends PopupWindow {
    public static final Field f39767c;
    public static final org.telegram.ui.ActionBar.g1 d = new org.telegram.ui.ActionBar.g1(2);
    public final ViewTreeObserver.OnScrollChangedListener f39768a;
    public ViewTreeObserver f39769b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f39767c = field;
    }

    public y61(h71 h71Var) {
        super(h71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f39767c;
        if (field != null) {
            try {
                this.f39768a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f39768a = null;
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
        if (getContentView() instanceof h71) {
            ((h71) getContentView()).s(new x61(this, 1));
        }
        if (this.f39768a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f39769b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f39769b.removeOnScrollChangedListener(this.f39768a);
                }
                this.f39769b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f39768a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof h71) {
            h71 h71Var = (h71) getContentView();
            x61 x61Var = new x61(this, 0);
            Integer num = h71Var.Y1;
            if (num != null) {
                h71.f34113c2.put(num, h71Var.f34152r0.e0());
            }
            ValueAnimator valueAnimator = h71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                h71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            h71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new j51(h71Var, 3));
            h71Var.V1.addListener(new org.telegram.ui.Components.pk0(15, h71Var, x61Var));
            h71Var.V1.setDuration(200L);
            h71Var.V1.setInterpolator(org.telegram.ui.Components.qr.h);
            h71Var.V1.start();
            y51 y51Var = h71Var.f34128f0;
            if (y51Var != null) {
                AndroidUtilities.hideKeyboard(y51Var.h);
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
        if (this.f39768a != null && (viewTreeObserver = this.f39769b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f39769b.removeOnScrollChangedListener(this.f39768a);
            }
            this.f39769b = null;
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
