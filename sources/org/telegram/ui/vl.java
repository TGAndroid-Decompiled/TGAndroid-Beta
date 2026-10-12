package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class vl extends org.telegram.ui.Components.y11 {
    public final eo K;

    public vl(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, eo eoVar) {
        super(activity);
        this.K = eoVar;
        TextPaint textPaint = new TextPaint(1);
        this.f32916b = textPaint;
        Paint paint = new Paint(1);
        this.f32917c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.f32918e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.ur0(this, 15);
        this.J = new Path();
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, c6Var);
        int alpha = Color.alpha(w02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(w02);
        paint.setColor(w02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, c6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        eo eoVar = this.K;
        int top = eoVar.Y.getTop() - eoVar.X0.getMeasuredHeight();
        setTranslationY(top - ((1.0f - getPrepareProgress()) * (top + i10)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
