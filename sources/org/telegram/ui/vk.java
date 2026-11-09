package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class vk extends org.telegram.ui.Components.uy0 {
    public final cn K;

    public vk(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, cn cnVar) {
        super(activity);
        this.K = cnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f38837b = textPaint;
        Paint paint = new Paint(1);
        this.f38838c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.f38839e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.kr0(this, 12);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, g6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i7 = org.telegram.ui.ActionBar.l6.tj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(this, d02, M, null, g6Var);
    }

    public final void d() {
        int i7 = -(org.telegram.messenger.g0.L(16.0f) + getMeasuredHeight());
        cn cnVar = this.K;
        int top = cnVar.Z.getTop() - cnVar.l1.getMeasuredHeight();
        setTranslationY(top - ((1.0f - getPrepareProgress()) * (top + i7)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        d();
    }
}
