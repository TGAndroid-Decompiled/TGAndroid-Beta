package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class z21 extends PopupWindow {
    public static final Field f43994c;
    public static final org.telegram.ui.ActionBar.c1 d = new org.telegram.ui.ActionBar.c1(2);
    public final ViewTreeObserver.OnScrollChangedListener f43995a;
    public ViewTreeObserver f43996b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f43994c = field;
    }

    public z21(i31 i31Var) {
        super(i31Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f43994c;
        if (field != null) {
            try {
                this.f43995a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f43995a = null;
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
        if (getContentView() instanceof i31) {
            ((i31) getContentView()).s(new y21(this, 1));
        }
        if (this.f43995a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f43996b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f43996b.removeOnScrollChangedListener(this.f43995a);
                }
                this.f43996b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f43995a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof i31) {
            i31 i31Var = (i31) getContentView();
            y21 y21Var = new y21(this, 0);
            Integer num = i31Var.Z1;
            if (num != null) {
                i31.f38110d2.put(num, i31Var.f38149r0.e0());
            }
            ValueAnimator valueAnimator = i31Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                i31Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            i31Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new j11(i31Var, 3));
            i31Var.W1.addListener(new org.telegram.ui.Components.iw0(10, (Object) i31Var, (Object) y21Var));
            i31Var.W1.setDuration(200L);
            i31Var.W1.setInterpolator(org.telegram.ui.Components.gr.h);
            i31Var.W1.start();
            a21 a21Var = i31Var.f38125f0;
            if (a21Var != null) {
                org.telegram.messenger.i0.v1(a21Var.h);
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
        if (this.f43995a != null && (viewTreeObserver = this.f43996b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f43996b.removeOnScrollChangedListener(this.f43995a);
            }
            this.f43996b = null;
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
