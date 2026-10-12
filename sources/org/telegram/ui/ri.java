package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ri implements View.OnTouchListener {
    public final int f39806a;
    public final int[] f39807b;
    public final Rect f39808c;
    public final Object d;

    public ri(n60 n60Var, Rect rect) {
        this.f39806a = 1;
        this.d = n60Var;
        this.f39808c = rect;
        this.f39807b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n50 n50Var;
        switch (this.f39806a) {
            case 0:
                fo foVar = (fo) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = foVar.Q8.getContentView();
                        int[] iArr = this.f39807b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f39808c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            foVar.D7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    foVar.D7(true);
                }
                return false;
            default:
                n60 n60Var = (n60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    n50 n50Var2 = n60Var.f38466f3;
                    if (n50Var2 != null && n50Var2.isShowing()) {
                        View contentView2 = n60Var.f38466f3.getContentView();
                        int[] iArr2 = this.f39807b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f39808c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            n60Var.f38466f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (n50Var = n60Var.f38466f3) != null && n50Var.isShowing()) {
                    n60Var.f38466f3.dismiss();
                }
                return false;
        }
    }

    public ri(fo foVar, Rect rect) {
        this.f39806a = 0;
        this.d = foVar;
        this.f39808c = rect;
        this.f39807b = new int[2];
    }
}
