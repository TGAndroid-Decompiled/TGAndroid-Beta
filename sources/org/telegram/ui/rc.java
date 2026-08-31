package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class rc extends View {
    public final Paint f40919a;
    public final Paint f40920b;
    public final Paint f40921c;
    public final Paint d;
    public final Path f40922e;
    public final Path f40923f;
    public boolean h;
    public boolean f40924n;
    public final org.telegram.ui.Components.rc f40925r;
    public boolean f40926s;
    public final org.telegram.ui.Components.z5 v;
    public final sc f40927w;

    public rc(sc scVar, Context context) {
        super(context);
        this.f40927w = scVar;
        Paint paint = new Paint(1);
        this.f40919a = paint;
        this.f40920b = new Paint(1);
        this.f40921c = new Paint(1);
        this.d = new Paint(1);
        this.f40922e = new Path();
        this.f40923f = new Path();
        this.f40925r = new org.telegram.ui.Components.rc(this);
        this.v = new org.telegram.ui.Components.z5(this, 0L, 320L, org.telegram.ui.Components.pr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q10;
        org.telegram.ui.ActionBar.g6 g6Var = this.f40927w.f41224a;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        Paint paint = this.f40921c;
        Paint paint2 = this.f40920b;
        if (q10 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, g6Var));
            paint.setColor(peerColor.getColor(0, g6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, g6Var));
            paint.setColor(peerColor.getColor(1, g6Var));
        }
        this.d.setColor(peerColor.getColor(2, g6Var));
        this.h = peerColor.hasColor2();
        this.f40924n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40925r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f40922e);
        canvas.drawPaint(this.f40920b);
        if (this.h) {
            canvas.drawPath(this.f40923f, this.f40921c);
        }
        canvas.restore();
        if (this.f40924n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e6 = this.v.e(this.f40926s);
        if (e6 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40919a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e6), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f40922e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40923f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40919a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z4) {
        super.setPressed(z4);
        this.f40925r.c(z4);
    }
}
