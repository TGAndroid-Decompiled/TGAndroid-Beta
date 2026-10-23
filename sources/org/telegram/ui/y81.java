package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y81 {
    public final org.telegram.ui.Components.a10 f43399a;
    public lg.f f43400b;
    public final int f43401c;
    public final z81 d;

    public y81(z81 z81Var, int i10) {
        this.d = z81Var;
        this.f43401c = i10;
        ?? view = new View(z81Var.getContext());
        view.f24455c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f24456f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f24457n = paint2;
        view.f24460w = AndroidUtilities.dp(35.0f);
        view.f24461x = AndroidUtilities.dp(22.0f);
        view.f24462y = AndroidUtilities.dp(8.0f);
        view.E = AndroidUtilities.dp(3.5f);
        view.F = new RectF();
        view.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f43399a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        z81Var.h.addView(view);
        z81Var.f43678n.add(this);
    }
}
