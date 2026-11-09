package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class wh implements View.OnTouchListener {
    public final int f51409a;
    public final int[] f51410b;
    public final Rect f51411c;
    public final Object d;

    public wh(e40 e40Var, Rect rect) {
        this.f51409a = 1;
        this.d = e40Var;
        this.f51411c = rect;
        this.f51410b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g30 g30Var;
        switch (this.f51409a) {
            case 0:
                cn cnVar = (cn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.g1 g1Var = cnVar.f44442e9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = cnVar.f44442e9.getContentView();
                        int[] iArr = this.f51410b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f51411c;
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
                e40 e40Var = (e40) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    g30 g30Var2 = e40Var.W4;
                    if (g30Var2 != null && g30Var2.isShowing()) {
                        View contentView2 = e40Var.W4.getContentView();
                        int[] iArr2 = this.f51410b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f51411c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            e40Var.W4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (g30Var = e40Var.W4) != null && g30Var.isShowing()) {
                    e40Var.W4.dismiss();
                }
                return false;
        }
    }

    public wh(cn cnVar, Rect rect) {
        this.f51409a = 0;
        this.d = cnVar;
        this.f51411c = rect;
        this.f51410b = new int[2];
    }
}
