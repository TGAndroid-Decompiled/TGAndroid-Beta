package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

public final class z81 {

    public final org.telegram.ui.Components.g00 f45104a;

    public tf.f f45105b;

    public final int f45106c;
    public final a91 d;

    public z81(a91 a91Var, int i10) {
        this.d = a91Var;
        this.f45106c = i10;
        org.telegram.ui.Components.g00 g00Var = new org.telegram.ui.Components.g00(a91Var.getContext());
        g00Var.f28482c = true;
        TextPaint textPaint = new TextPaint(1);
        g00Var.f28483e = textPaint;
        g00Var.f28484f = new Paint(1);
        Paint paint = new Paint(1);
        g00Var.h = paint;
        Paint paint2 = new Paint(1);
        g00Var.f28485n = paint2;
        g00Var.f28488w = AndroidUtilities.dp(35.0f);
        g00Var.f28489x = AndroidUtilities.dp(22.0f);
        g00Var.f28490y = AndroidUtilities.dp(8.0f);
        g00Var.A = AndroidUtilities.dp(3.5f);
        g00Var.B = new RectF();
        g00Var.C = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f45104a = g00Var;
        g00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        a91Var.h.addView(g00Var);
        a91Var.f36468n.add(this);
    }
}
