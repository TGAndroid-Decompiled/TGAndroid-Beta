package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ri implements View.OnTouchListener {
    public final int f41660a;
    public final int[] f41661b;
    public final Rect f41662c;
    public final Object d;

    public ri(i60 i60Var, Rect rect) {
        this.f41660a = 1;
        this.d = i60Var;
        this.f41662c = rect;
        this.f41661b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i50 i50Var;
        switch (this.f41660a) {
            case 0:
                eo eoVar = (eo) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    org.telegram.ui.ActionBar.m1 m1Var = eoVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = eoVar.Q8.getContentView();
                        int[] iArr = this.f41661b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.f41662c;
                        rect.set(i10, iArr[1], contentView.getMeasuredWidth() + i10, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            eoVar.D7(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    eoVar.D7(true);
                }
                return false;
            default:
                i60 i60Var = (i60) this.d;
                if (motionEvent.getActionMasked() == 0) {
                    i50 i50Var2 = i60Var.f38703f3;
                    if (i50Var2 != null && i50Var2.isShowing()) {
                        View contentView2 = i60Var.f38703f3.getContentView();
                        int[] iArr2 = this.f41661b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.f41662c;
                        rect2.set(i11, iArr2[1], contentView2.getMeasuredWidth() + i11, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            i60Var.f38703f3.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (i50Var = i60Var.f38703f3) != null && i50Var.isShowing()) {
                    i60Var.f38703f3.dismiss();
                }
                return false;
        }
    }

    public ri(eo eoVar, Rect rect) {
        this.f41660a = 0;
        this.d = eoVar;
        this.f41662c = rect;
        this.f41661b = new int[2];
    }
}
