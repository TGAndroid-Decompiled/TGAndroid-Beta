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
    public final Paint f40434a;
    public final Paint f40435b;
    public final Paint f40436c;
    public final Paint d;
    public final Path f40437e;
    public final Path f40438f;
    public boolean h;
    public boolean f40439n;
    public final org.telegram.ui.Components.zc f40440r;
    public boolean f40441s;
    public final org.telegram.ui.Components.e6 v;
    public final tc f40442w;

    public sc(tc tcVar, Context context) {
        super(context);
        this.f40442w = tcVar;
        Paint paint = new Paint(1);
        this.f40434a = paint;
        this.f40435b = new Paint(1);
        this.f40436c = new Paint(1);
        this.d = new Paint(1);
        this.f40437e = new Path();
        this.f40438f = new Path();
        this.f40440r = new org.telegram.ui.Components.zc(this);
        this.v = new org.telegram.ui.Components.e6(this, 0L, 320L, org.telegram.ui.Components.tr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40442w.f40844a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        Paint paint = this.f40436c;
        Paint paint2 = this.f40435b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, d6Var));
            paint.setColor(peerColor.getColor(0, d6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, d6Var));
            paint.setColor(peerColor.getColor(1, d6Var));
        }
        this.d.setColor(peerColor.getColor(2, d6Var));
        this.h = peerColor.hasColor2();
        this.f40439n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f40440r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.f40437e);
        canvas.drawPaint(this.f40435b);
        if (this.h) {
            canvas.drawPath(this.f40438f, this.f40436c);
        }
        canvas.restore();
        if (this.f40439n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e7 = this.v.e(this.f40441s);
        if (e7 > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f40434a;
            paint.setStrokeWidth(dpf2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.lerp((paint.getStrokeWidth() * 0.5f) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f) - (paint.getStrokeWidth() * 2.0f), e7), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        Path path = this.f40437e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(20.0f), Path.Direction.CW);
        Path path2 = this.f40438f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f40434a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f40440r.c(z10);
    }
}
