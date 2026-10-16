package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class wc extends View {
    public final Paint f40921a;
    public final Paint f40922b;
    public final Paint f40923c;
    public final Paint d;
    public final Path e;
    public final Path f40924f;
    public boolean h;
    public boolean f40925n;
    public final org.telegram.ui.Components.ad f40926r;
    public boolean f40927s;
    public final org.telegram.ui.Components.g6 v;
    public final xc f40928w;

    public wc(xc xcVar, Context context) {
        super(context);
        this.f40928w = xcVar;
        Paint paint = new Paint(1);
        this.f40921a = paint;
        this.f40922b = new Paint(1);
        this.f40923c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f40924f = new Path();
        this.f40926r = new org.telegram.ui.Components.ad(this);
        this.v = new org.telegram.ui.Components.g6(this, 0L, 320L, org.telegram.ui.Components.es.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f40928w.f41538a;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        Paint paint = this.f40923c;
        Paint paint2 = this.f40922b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, c6Var));
            paint.setColor(peerColor.getColor(0, c6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, c6Var));
            paint.setColor(peerColor.getColor(1, c6Var));
        }
        this.d.setColor(peerColor.getColor(2, c6Var));
        this.h = peerColor.hasColor2();
        this.f40925n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40926r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f40922b);
        if (this.h) {
            canvas.drawPath(this.f40924f, this.f40923c);
        }
        canvas.restore();
        if (this.f40925n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f40927s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40921a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40924f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40921a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40926r.c(z10);
    }
}
