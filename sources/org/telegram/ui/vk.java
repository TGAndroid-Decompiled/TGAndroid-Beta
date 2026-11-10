package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class vk extends org.telegram.ui.Components.ty0 {
    public final cn K;

    public vk(Activity activity, org.telegram.ui.ActionBar.h6 h6Var, cn cnVar) {
        super(activity);
        this.K = cnVar;
        TextPaint textPaint = new TextPaint(1);
        this.f38431b = textPaint;
        Paint paint = new Paint(1);
        this.f38432c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.f38433e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.jr0(this, 12);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, h6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i7 = org.telegram.ui.ActionBar.m6.tj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, M, null, h6Var);
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
