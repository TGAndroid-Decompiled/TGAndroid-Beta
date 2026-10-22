package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y81 {
    public final org.telegram.ui.Components.a10 f43398a;
    public lg.f f43399b;
    public final int f43400c;
    public final z81 d;

    public y81(z81 z81Var, int i10) {
        this.d = z81Var;
        this.f43400c = i10;
        ?? view = new View(z81Var.getContext());
        view.f24454c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f24455f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f24456n = paint2;
        view.f24459w = AndroidUtilities.dp(35.0f);
        view.f24460x = AndroidUtilities.dp(22.0f);
        view.f24461y = AndroidUtilities.dp(8.0f);
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
        this.f43398a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        z81Var.h.addView(view);
        z81Var.f43677n.add(this);
    }
}
