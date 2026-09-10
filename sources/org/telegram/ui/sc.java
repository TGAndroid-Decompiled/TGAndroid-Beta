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
    public final Paint f36643a;
    public final Paint f36644b;
    public final Paint f36645c;
    public final Paint d;
    public final Path e;
    public final Path f36646f;
    public boolean h;
    public boolean f36647n;
    public final org.telegram.ui.Components.xc f36648r;
    public boolean f36649s;
    public final org.telegram.ui.Components.d6 v;
    public final tc f36650w;

    public sc(tc tcVar, Context context) {
        super(context);
        this.f36650w = tcVar;
        Paint paint = new Paint(1);
        this.f36643a = paint;
        this.f36644b = new Paint(1);
        this.f36645c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f36646f = new Path();
        this.f36648r = new org.telegram.ui.Components.xc(this);
        this.v = new org.telegram.ui.Components.d6(this, 0L, 320L, org.telegram.ui.Components.wr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36650w.f36899a;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Paint paint = this.f36645c;
        Paint paint2 = this.f36644b;
        if (q6 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, f6Var));
            paint.setColor(peerColor.getColor(0, f6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, f6Var));
            paint.setColor(peerColor.getColor(1, f6Var));
        }
        this.d.setColor(peerColor.getColor(2, f6Var));
        this.h = peerColor.hasColor2();
        this.f36647n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f36648r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f36644b);
        if (this.h) {
            canvas.drawPath(this.f36646f, this.f36645c);
        }
        canvas.restore();
        if (this.f36647n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f36649s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f36643a;
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
        Path path2 = this.f36646f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f36643a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f36648r.c(z10);
    }
}
