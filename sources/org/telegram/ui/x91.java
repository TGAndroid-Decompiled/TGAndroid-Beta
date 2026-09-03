package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x91 {
    public final org.telegram.ui.Components.t00 f39943a;
    public xf.f f39944b;
    public final int f39945c;
    public final y91 d;

    public x91(y91 y91Var, int i10) {
        this.d = y91Var;
        this.f39945c = i10;
        ?? view = new View(y91Var.getContext());
        view.f28853c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f28854f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.f28855n = paint2;
        view.f28858w = AndroidUtilities.dp(35.0f);
        view.f28859x = AndroidUtilities.dp(22.0f);
        view.f28860y = AndroidUtilities.dp(8.0f);
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
        this.f39943a = view;
        view.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        y91Var.h.addView(view);
        y91Var.f40193n.add(this);
    }
}
