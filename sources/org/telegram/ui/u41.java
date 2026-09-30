package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u41 extends FrameLayout {
    public final Paint f38403a;
    public final Paint f38404b;
    public final RectF f38405c;
    public final org.telegram.ui.Components.n21 d;
    public boolean e;
    public long f38406f;
    public long h;
    public final org.telegram.ui.Components.lj0 f38407n;
    public final TextPaint f38408r;
    public StaticLayout f38409s;
    public float v;
    public float f38410w;
    public final SecretMediaViewer f38411x;

    public u41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f38411x = secretMediaViewer;
        this.f38405c = new RectF();
        this.d = new org.telegram.ui.Components.n21();
        this.f38408r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f38404b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f38403a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(R.raw.fire_on, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        this.f38407n = lj0Var;
        lj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        lj0Var.R(this);
        lj0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer;
        float max;
        MessageObject messageObject = this.f38411x.f31814h0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                if (this.f38406f == 0) {
                    max = 1.0f;
                } else {
                    max = ((float) Math.max(0L, this.f38406f - (System.currentTimeMillis() + (ConnectionsManager.getInstance(secretMediaViewer.f31796a).getTimeDifference() * 1000)))) / (((float) this.h) * 1000.0f);
                }
                boolean z10 = this.e;
                Paint paint = this.f38404b;
                Paint paint2 = this.f38403a;
                float f7 = max;
                RectF rectF = this.f38405c;
                if (z10) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.v / 2.0f), rectF.centerY() - (this.f38410w / 2.0f));
                    this.f38409s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f10 = 19.285715f;
                    for (int i10 = 0; i10 < 5; i10++) {
                        canvas.drawArc(rectF, f10 + 270.0f, 12.857143f, false, paint2);
                        f10 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY() - AndroidUtilities.dp(1.0f);
                    float dp = AndroidUtilities.dp(8.0f);
                    org.telegram.ui.Components.lj0 lj0Var = this.f38407n;
                    lj0Var.setBounds((int) (centerX - dp), (int) (centerY - dp), (int) (centerX + dp), (int) (centerY + dp));
                    lj0Var.draw(canvas);
                    float f11 = f7 * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f11, false, paint2);
                    this.d.a(f11, 1.0f, canvas, paint, rectF);
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float dpf2 = AndroidUtilities.dpf2(10.5f);
        this.f38405c.set(measuredWidth - dpf2, measuredHeight - dpf2, measuredWidth + dpf2, dpf2 + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
