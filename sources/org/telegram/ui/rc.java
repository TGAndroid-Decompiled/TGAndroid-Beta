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
    public final Paint f41375a;
    public final Paint f41376b;
    public final Paint f41377c;
    public final Paint d;
    public final Path f41378e;
    public final Path f41379f;
    public boolean h;
    public boolean f41380n;
    public final org.telegram.ui.Components.bd f41381r;
    public boolean f41382s;
    public final org.telegram.ui.Components.g6 v;
    public final sc f41383w;

    public rc(sc scVar, Context context) {
        super(context);
        this.f41383w = scVar;
        Paint paint = new Paint(1);
        this.f41375a = paint;
        this.f41376b = new Paint(1);
        this.f41377c = new Paint(1);
        this.d = new Paint(1);
        this.f41378e = new Path();
        this.f41379f = new Path();
        this.f41381r = new org.telegram.ui.Components.bd(this);
        this.v = new org.telegram.ui.Components.g6(this, 0L, 320L, org.telegram.ui.Components.hs.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41383w.f41663a;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        Paint paint = this.f41377c;
        Paint paint2 = this.f41376b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, e6Var));
            paint.setColor(peerColor.getColor(0, e6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, e6Var));
            paint.setColor(peerColor.getColor(1, e6Var));
        }
        this.d.setColor(peerColor.getColor(2, e6Var));
        this.h = peerColor.hasColor2();
        this.f41380n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f41381r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f41378e);
        canvas.drawPaint(this.f41376b);
        if (this.h) {
            canvas.drawPath(this.f41379f, this.f41377c);
        }
        canvas.restore();
        if (this.f41380n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e7 = this.v.e(this.f41382s);
        if (e7 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f41375a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e7), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f41378e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f41379f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f41375a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f41381r.c(z10);
    }
}
