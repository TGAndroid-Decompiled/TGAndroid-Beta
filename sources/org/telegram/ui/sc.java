package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class sc extends View {
    public final Paint f40449a;
    public final Paint f40450b;
    public final Paint f40451c;
    public final Paint d;
    public final Path f40452e;
    public final Path f40453f;
    public boolean h;
    public boolean f40454n;
    public final org.telegram.ui.Components.zc f40455r;
    public boolean f40456s;
    public final org.telegram.ui.Components.e6 v;
    public final tc f40457w;

    public sc(tc tcVar, Context context) {
        super(context);
        this.f40457w = tcVar;
        Paint paint = new Paint(1);
        this.f40449a = paint;
        this.f40450b = new Paint(1);
        this.f40451c = new Paint(1);
        this.d = new Paint(1);
        this.f40452e = new Path();
        this.f40453f = new Path();
        this.f40455r = new org.telegram.ui.Components.zc(this);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 320L, org.telegram.ui.Components.tr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40457w.f40789a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        Paint paint = this.f40451c;
        Paint paint2 = this.f40450b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, d6Var));
            paint.setColor(peerColor.getColor(0, d6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, d6Var));
            paint.setColor(peerColor.getColor(1, d6Var));
        }
        this.d.setColor(peerColor.getColor(2, d6Var));
        this.h = peerColor.hasColor2();
        this.f40454n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40455r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f40452e);
        canvas.drawPaint(this.f40450b);
        if (this.h) {
            canvas.drawPath(this.f40453f, this.f40451c);
        }
        canvas.restore();
        if (this.f40454n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e7 = this.v.e(this.f40456s);
        if (e7 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40449a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e7), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f40452e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40453f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40449a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40455r.c(z10);
    }
}
