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
    public final Paint f40133a;
    public final Paint f40134b;
    public final Paint f40135c;
    public final Paint d;
    public final Path f40136e;
    public final Path f40137f;
    public boolean h;
    public boolean f40138n;
    public final org.telegram.ui.Components.zc f40139r;
    public boolean f40140s;
    public final org.telegram.ui.Components.e6 v;
    public final sc f40141w;

    public rc(sc scVar, Context context) {
        super(context);
        this.f40141w = scVar;
        Paint paint = new Paint(1);
        this.f40133a = paint;
        this.f40134b = new Paint(1);
        this.f40135c = new Paint(1);
        this.d = new Paint(1);
        this.f40136e = new Path();
        this.f40137f = new Path();
        this.f40139r = new org.telegram.ui.Components.zc(this);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 320L, org.telegram.ui.Components.pr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f40141w.f40407a;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Paint paint = this.f40135c;
        Paint paint2 = this.f40134b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, f6Var));
            paint.setColor(peerColor.getColor(0, f6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, f6Var));
            paint.setColor(peerColor.getColor(1, f6Var));
        }
        this.d.setColor(peerColor.getColor(2, f6Var));
        this.h = peerColor.hasColor2();
        this.f40138n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40139r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f40136e);
        canvas.drawPaint(this.f40134b);
        if (this.h) {
            canvas.drawPath(this.f40137f, this.f40135c);
        }
        canvas.restore();
        if (this.f40138n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e7 = this.v.e(this.f40140s);
        if (e7 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40133a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e7), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f40136e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40137f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40133a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40139r.c(z10);
    }
}
