package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class rl extends org.telegram.ui.Components.n01 {
    public final bo K;

    public rl(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, bo boVar) {
        super(activity);
        this.K = boVar;
        TextPaint textPaint = new TextPaint(1);
        this.f26283b = textPaint;
        Paint paint = new Paint(1);
        this.f26284c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.H = new org.telegram.ui.Components.jq0(this, 14);
        this.J = new Path();
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Hi, e6Var);
        int alpha = Color.alpha(v02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(v02);
        paint.setColor(v02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Fi, e6Var)));
    }

    public final void d() {
        int i10 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        bo boVar = this.K;
        int top = boVar.Y.getTop() - boVar.X0.getMeasuredHeight();
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
