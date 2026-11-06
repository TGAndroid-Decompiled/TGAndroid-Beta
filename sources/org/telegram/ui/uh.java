package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class uh implements View.OnTouchListener {
    public final int f50409a;
    public final int[] f50410b;
    public final Rect f50411c;
    public final Object d;

    public uh(c40 c40Var, Rect rect) {
        this.f50409a = 1;
        this.d = c40Var;
        this.f50411c = rect;
        this.f50410b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e30 e30Var;
        switch (this.f50409a) {
            case 0:
                an anVar = (an) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.g1 g1Var = anVar.f43757e9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = anVar.f43757e9.getContentView();
                        int[] iArr = this.f50410b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f50411c;
                        rect.set(i7, iArr[1], contentView.getMeasuredWidth() + i7, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            anVar.O7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    anVar.O7(true);
                }
                return false;
            default:
                c40 c40Var = (c40) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    e30 e30Var2 = c40Var.W4;
                    if (e30Var2 != null && e30Var2.isShowing()) {
                        View contentView2 = c40Var.W4.getContentView();
                        int[] iArr2 = this.f50410b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f50411c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            c40Var.W4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (e30Var = c40Var.W4) != null && e30Var.isShowing()) {
                    c40Var.W4.dismiss();
                }
                return false;
        }
    }

    public uh(an anVar, Rect rect) {
        this.f50409a = 0;
        this.d = anVar;
        this.f50411c = rect;
        this.f50410b = new int[2];
    }
}
