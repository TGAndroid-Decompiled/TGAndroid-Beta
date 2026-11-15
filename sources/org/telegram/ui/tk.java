package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class tk extends org.telegram.ui.Components.vy0 {
    public final an L;

    public tk(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, an anVar) {
        super(activity);
        this.L = anVar;
        TextPaint textPaint = new TextPaint(1);
        this.f41187b = textPaint;
        Paint paint = new Paint(1);
        this.f41188c = paint;
        this.d = org.telegram.messenger.g0.L(24.0f);
        this.f41189e = new OvershootInterpolator();
        this.I = new org.telegram.ui.Components.ro0(this, 15);
        this.K = new Path();
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, e6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = org.telegram.messenger.g0.L(6.0f);
        int i7 = org.telegram.ui.ActionBar.j6.wj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, M, null, e6Var);
    }

    public final void d() {
        int i7 = -(org.telegram.messenger.g0.L(16.0f) + getMeasuredHeight());
        an anVar = this.L;
        int top = anVar.f45117a0.getTop() - anVar.f45277m1.getMeasuredHeight();
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
