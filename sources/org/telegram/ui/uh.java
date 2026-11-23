package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class uh implements View.OnTouchListener {
    public final int f52658a;
    public final int[] f52659b;
    public final Rect f52660c;
    public final Object d;

    public uh(e40 e40Var, Rect rect) {
        this.f52658a = 1;
        this.d = e40Var;
        this.f52660c = rect;
        this.f52659b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g30 g30Var;
        switch (this.f52658a) {
            case 0:
                bn bnVar = (bn) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.g1 g1Var = bnVar.f46209g9;
                    if (g1Var != null && g1Var.isShowing()) {
                        View contentView = bnVar.f46209g9.getContentView();
                        int[] iArr = this.f52659b;
                        contentView.getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f52660c;
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
                e40 e40Var = (e40) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    g30 g30Var2 = e40Var.f47339e5;
                    if (g30Var2 != null && g30Var2.isShowing()) {
                        View contentView2 = e40Var.f47339e5.getContentView();
                        int[] iArr2 = this.f52659b;
                        contentView2.getLocationInWindow(iArr2);
                        int i10 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f52660c;
                        rect2.set(i10, iArr2[1], contentView2.getMeasuredWidth() + i10, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            e40Var.f47339e5.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (g30Var = e40Var.f47339e5) != null && g30Var.isShowing()) {
                    e40Var.f47339e5.dismiss();
                }
                return false;
        }
    }

    public uh(bn bnVar, Rect rect) {
        this.f52658a = 0;
        this.d = bnVar;
        this.f52660c = rect;
        this.f52659b = new int[2];
    }
}
