package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w91 {
    public final org.telegram.ui.Components.t00 f42389a;
    public yf.f f42390b;
    public final int f42391c;
    public final x91 d;

    public w91(x91 x91Var, int i10) {
        this.d = x91Var;
        this.f42391c = i10;
        ?? view = new View(x91Var.getContext());
        view.f31228c = true;
        TextPaint textPaint = new TextPaint(1);
        view.f31229e = textPaint;
        view.f31230f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f31231n = paint2;
        view.f31234w = AndroidUtilities.dp(35.0f);
        view.f31235x = AndroidUtilities.dp(22.0f);
        view.f31236y = AndroidUtilities.dp(8.0f);
        view.B = AndroidUtilities.dp(3.5f);
        view.C = new RectF();
        view.D = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f42389a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        x91Var.h.addView(view);
        x91Var.f42970n.add(this);
    }
}
