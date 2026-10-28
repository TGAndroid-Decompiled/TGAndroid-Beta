package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
public final class vb1 extends FrameLayout {
    public final int f44239a;
    public final Rect f44240b;
    public final vc1 f44241c;

    public vb1(vc1 vc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.f44241c = vc1Var;
        this.f44239a = i10;
        this.f44240b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.f44239a;
        Rect rect = this.f44240b;
        vc1 vc1Var = this.f44241c;
        if (i10 == 0) {
            vc1Var.f44293r.setBounds(vc1Var.W.getLeft() - rect.left, 0, vc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            vc1Var.f44293r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        vc1Var.f44293r.draw(canvas);
    }
}
