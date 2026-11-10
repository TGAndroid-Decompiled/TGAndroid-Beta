package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class wh implements View.OnTouchListener {
    public final int f51372a;
    public final int[] f51373b;
    public final Rect f51374c;
    public final Object d;

    public wh(f40 f40Var, Rect rect) {
        this.f51372a = 1;
        this.d = f40Var;
        this.f51374c = rect;
        this.f51373b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h30 h30Var;
        switch (this.f51372a) {
            case 0:
                cn cnVar = (cn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.g1 g1Var = cnVar.f44483e9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = cnVar.f44483e9.getContentView();
                        int[] iArr = this.f51373b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f51374c;
                        rect.set(i7, iArr[1], contentView.getMeasuredWidth() + i7, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            cnVar.P7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    cnVar.P7(true);
                }
                return false;
            default:
                f40 f40Var = (f40) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    h30 h30Var2 = f40Var.Z4;
                    if (h30Var2 != null && h30Var2.isShowing()) {
                        View contentView2 = f40Var.Z4.getContentView();
                        int[] iArr2 = this.f51373b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f51374c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            f40Var.Z4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (h30Var = f40Var.Z4) != null && h30Var.isShowing()) {
                    f40Var.Z4.dismiss();
                }
                return false;
        }
    }

    public wh(cn cnVar, Rect rect) {
        this.f51372a = 0;
        this.d = cnVar;
        this.f51374c = rect;
        this.f51373b = new int[2];
    }
}
