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
    public final Paint f43103a;
    public final Paint f43104b;
    public final Paint f43105c;
    public final Paint d;
    public final Path e;
    public final Path f43106f;
    public boolean h;
    public boolean f43107n;
    public final org.telegram.ui.Components.xc f43108r;
    public boolean f43109s;
    public final org.telegram.ui.Components.h6 v;
    public final sc f43110w;

    public rc(sc scVar, Context context) {
        super(context);
        this.f43110w = scVar;
        Paint paint = new Paint(1);
        this.f43103a = paint;
        this.f43104b = new Paint(1);
        this.f43105c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f43106f = new Path();
        this.f43108r = new org.telegram.ui.Components.xc(this);
        this.v = new org.telegram.ui.Components.h6(this, 0L, 320L, org.telegram.ui.Components.ds.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q5;
        org.telegram.ui.ActionBar.u6 u6Var = this.f43110w.f43462a;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        Paint paint = this.f43105c;
        Paint paint2 = this.f43104b;
        if (q5 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, u6Var));
            paint.setColor(peerColor.getColor(0, u6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, u6Var));
            paint.setColor(peerColor.getColor(1, u6Var));
        }
        this.d.setColor(peerColor.getColor(2, u6Var));
        this.h = peerColor.hasColor2();
        this.f43107n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f43108r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f43104b);
        if (this.h) {
            canvas.drawPath(this.f43106f, this.f43105c);
        }
        canvas.restore();
        if (this.f43107n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f43109s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f43103a;
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
        Path path2 = this.f43106f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f43103a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f43108r.c(z10);
    }
}
