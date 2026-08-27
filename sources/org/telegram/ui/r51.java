package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;

public abstract class r51 extends PopupWindow {

    public static final Field f41816c;
    public static final org.telegram.ui.ActionBar.g1 d = new org.telegram.ui.ActionBar.g1(2);

    public final ViewTreeObserver.OnScrollChangedListener f41817a;

    public ViewTreeObserver f41818b;

    static {
        Field declaredField = null;
        try {
            declaredField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f41816c = declaredField;
    }

    public r51(a61 a61Var) {
        super(a61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f41816c;
        if (field != null) {
            try {
                this.f41817a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f41817a = null;
            }
        }
    }

    public final void b() {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    public final void c(View view) {
        if (getContentView() instanceof a61) {
            ((a61) getContentView()).s(new q51(this, 1));
        }
        if (this.f41817a != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.f41818b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f41818b.removeOnScrollChangedListener(this.f41817a);
                }
                this.f41818b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f41817a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (!(getContentView() instanceof a61)) {
            super.dismiss();
            return;
        }
        a61 a61Var = (a61) getContentView();
        q51 q51Var = new q51(this, 0);
        Integer num = a61Var.U1;
        if (num != null) {
            a61.Y1.put(num, a61Var.f36413n0.e0());
        }
        ValueAnimator valueAnimator = a61Var.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            a61Var.R1 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        a61Var.R1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new d41(a61Var, 3));
        a61Var.R1.addListener(new org.telegram.ui.Components.fk0(15, a61Var, q51Var));
        a61Var.R1.setDuration(200L);
        a61Var.R1.setInterpolator(org.telegram.ui.Components.er.h);
        a61Var.R1.start();
        r41 r41Var = a61Var.f36387b0;
        if (r41Var != null) {
            AndroidUtilities.hideKeyboard(r41Var.h);
        }
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        try {
            int i10 = layoutParams.flags;
            if ((i10 & 2) != 0) {
                layoutParams.flags = i10 & (-3);
                layoutParams.dimAmount = 0.0f;
                windowManager.updateViewLayout(rootView, layoutParams);
            }
        } catch (Exception unused) {
        }
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
        if (this.f41817a == null || (viewTreeObserver = this.f41818b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.f41818b.removeOnScrollChangedListener(this.f41817a);
        }
        this.f41818b = null;
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
