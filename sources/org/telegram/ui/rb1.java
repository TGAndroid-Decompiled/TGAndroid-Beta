package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class rb1 extends FrameLayout {
    public final int f41081a;
    public final Rect f41082b;
    public final qc1 f41083c;

    public rb1(qc1 qc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f41083c = qc1Var;
        this.f41081a = i10;
        this.f41082b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f41081a;
        Rect rect = this.f41082b;
        qc1 qc1Var = this.f41083c;
        if (i10 == 0) {
            qc1Var.f40760r.setBounds(qc1Var.W.getLeft() - rect.left, 0, qc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            qc1Var.f40760r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        qc1Var.f40760r.draw(canvas);
    }
}
