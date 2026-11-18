package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class th implements View.OnTouchListener {
    public final int f52283a;
    public final int[] f52284b;
    public final Rect f52285c;
    public final Object d;

    public th(f40 f40Var, Rect rect) {
        this.f52283a = 1;
        this.d = f40Var;
        this.f52285c = rect;
        this.f52284b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h30 h30Var;
        switch (this.f52283a) {
            case 0:
                bn bnVar = (bn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.h1 h1Var = bnVar.f46014g9;
                    if (h1Var != null && h1Var.isShowing()) {
                        View contentView = bnVar.f46014g9.getContentView();
                        int[] iArr = this.f52284b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f52285c;
                        rect.set(i7, iArr[1], contentView.getMeasuredWidth() + i7, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            bnVar.P7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    bnVar.P7(true);
                }
                return false;
            default:
                f40 f40Var = (f40) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    h30 h30Var2 = f40Var.f47417e5;
                    if (h30Var2 != null && h30Var2.isShowing()) {
                        View contentView2 = f40Var.f47417e5.getContentView();
                        int[] iArr2 = this.f52284b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f52285c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            f40Var.f47417e5.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (h30Var = f40Var.f47417e5) != null && h30Var.isShowing()) {
                    f40Var.f47417e5.dismiss();
                }
                return false;
        }
    }

    public th(bn bnVar, Rect rect) {
        this.f52283a = 0;
        this.d = bnVar;
        this.f52285c = rect;
        this.f52284b = new int[2];
    }
}
