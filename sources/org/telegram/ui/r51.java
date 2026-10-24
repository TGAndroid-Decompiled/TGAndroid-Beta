package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class r51 extends PopupWindow {
    public static final Field f41038c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f41039a;
    public ViewTreeObserver f41040b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f41038c = field;
    }

    public r51(a61 a61Var) {
        super(a61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f41038c;
        if (field != null) {
            try {
                this.f41039a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f41039a = null;
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
        if (getContentView() instanceof a61) {
            ((a61) getContentView()).s(new q51(this, 1));
        }
        if (this.f41039a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f41040b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f41040b.removeOnScrollChangedListener(this.f41039a);
                }
                this.f41040b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f41039a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof a61) {
            a61 a61Var = (a61) getContentView();
            q51 q51Var = new q51(this, 0);
            Integer num = a61Var.Z1;
            if (num != null) {
                a61.f35603d2.put(num, a61Var.f35642r0.e0());
            }
            ValueAnimator valueAnimator = a61Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                a61Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            a61Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new b41(a61Var, 3));
            a61Var.W1.addListener(new org.telegram.ui.Components.pl0(15, a61Var, q51Var));
            a61Var.W1.setDuration(200L);
            a61Var.W1.setInterpolator(org.telegram.ui.Components.zr.h);
            a61Var.W1.start();
            r41 r41Var = a61Var.f35618f0;
            if (r41Var != null) {
                AndroidUtilities.hideKeyboard(r41Var.h);
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
        if (this.f41039a != null && (viewTreeObserver = this.f41040b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f41040b.removeOnScrollChangedListener(this.f41039a);
            }
            this.f41040b = null;
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
