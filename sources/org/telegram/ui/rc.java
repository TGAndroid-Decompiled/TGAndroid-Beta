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
    public final Paint f37973a;
    public final Paint f37974b;
    public final Paint f37975c;
    public final Paint d;
    public final Path e;
    public final Path f37976f;
    public boolean h;
    public boolean f37977n;
    public final org.telegram.ui.Components.rc f37978r;
    public boolean f37979s;
    public final org.telegram.ui.Components.z5 v;
    public final sc f37980w;

    public rc(sc scVar, Context context) {
        super(context);
        this.f37980w = scVar;
        Paint paint = new Paint(1);
        this.f37973a = paint;
        this.f37974b = new Paint(1);
        this.f37975c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f37976f = new Path();
        this.f37978r = new org.telegram.ui.Components.rc(this);
        this.v = new org.telegram.ui.Components.z5(this, 0L, 320L, org.telegram.ui.Components.nr.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean q10;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37980w.f38291a;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        Paint paint = this.f37975c;
        Paint paint2 = this.f37974b;
        if (q10 && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, f6Var));
            paint.setColor(peerColor.getColor(0, f6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, f6Var));
            paint.setColor(peerColor.getColor(1, f6Var));
        }
        this.d.setColor(peerColor.getColor(2, f6Var));
        this.h = peerColor.hasColor2();
        this.f37977n = peerColor.hasColor3();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f37978r.a(0.05f);
        canvas.scale(a2, a2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.f37974b);
        if (this.h) {
            canvas.drawPath(this.f37976f, this.f37975c);
        }
        canvas.restore();
        if (this.f37977n) {
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(12.4f)) / 2.0f, (getMeasuredHeight() - AndroidUtilities.dp(12.4f)) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredWidth()) / 2.0f, (AndroidUtilities.dp(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.d);
            canvas.restore();
        }
        float e = this.v.e(this.f37979s);
        if (e > 0.0f) {
            float dpf2 = AndroidUtilities.dpf2(2.0f);
            Paint paint = this.f37973a;
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
        Path path2 = this.f37976f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.f37973a.setColor(i10);
    }

    @Override
    public final void setPressed(boolean z4) {
        super.setPressed(z4);
        this.f37978r.c(z4);
    }
}
