package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class r61 extends PopupWindow {
    public static final Field f37189c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f37190a;
    public ViewTreeObserver f37191b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f37189c = field;
    }

    public r61(a71 a71Var) {
        super(a71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f37189c;
        if (field != null) {
            try {
                this.f37190a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f37190a = null;
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
        if (getContentView() instanceof a71) {
            ((a71) getContentView()).s(new q61(this, 1));
        }
        if (this.f37190a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f37191b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f37191b.removeOnScrollChangedListener(this.f37190a);
                }
                this.f37191b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f37190a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof a71) {
            a71 a71Var = (a71) getContentView();
            q61 q61Var = new q61(this, 0);
            Integer num = a71Var.Y1;
            if (num != null) {
                a71.f32007c2.put(num, a71Var.f32046r0.e0());
            }
            ValueAnimator valueAnimator = a71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                a71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            a71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new c51(a71Var, 3));
            a71Var.V1.addListener(new org.telegram.ui.Components.bl0(15, a71Var, q61Var));
            a71Var.V1.setDuration(200L);
            a71Var.V1.setInterpolator(org.telegram.ui.Components.sr.h);
            a71Var.V1.start();
            r51 r51Var = a71Var.f32022f0;
            if (r51Var != null) {
                AndroidUtilities.hideKeyboard(r51Var.h);
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
        if (this.f37190a != null && (viewTreeObserver = this.f37191b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f37191b.removeOnScrollChangedListener(this.f37190a);
            }
            this.f37191b = null;
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
