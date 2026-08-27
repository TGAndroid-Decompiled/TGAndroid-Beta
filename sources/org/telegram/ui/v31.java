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

public final class v31 extends FrameLayout {

    public final Paint f43340a;

    public final Paint f43341b;

    public final RectF f43342c;
    public final org.telegram.ui.Components.e11 d;

    public boolean f43343e;

    public long f43344f;
    public long h;

    public final org.telegram.ui.Components.oi0 f43345n;

    public final TextPaint f43346r;

    public StaticLayout f43347s;
    public float v;

    public float f43348w;

    public final SecretMediaViewer f43349x;

    public v31(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f43349x = secretMediaViewer;
        this.f43342c = new RectF();
        this.d = new org.telegram.ui.Components.e11();
        this.f43346r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f43341b = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f43340a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.fire_on, AndroidUtilities.dp(16.0f), "" + R.raw.fire_on, AndroidUtilities.dp(16.0f));
        this.f43345n = oi0Var;
        oi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oi0Var.f31328r0 = this;
        oi0Var.start();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        SecretMediaViewer secretMediaViewer = this.f43349x;
        MessageObject messageObject = secretMediaViewer.f36128d0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                float fMax = this.f43344f == 0 ? 1.0f : Math.max(0L, this.f43344f - (System.currentTimeMillis() + ((long) (ConnectionsManager.getInstance(secretMediaViewer.f36119a).getTimeDifference() * 1000)))) / (this.h * 1000.0f);
                boolean z10 = this.f43343e;
                Paint paint = this.f43341b;
                Paint paint2 = this.f43340a;
                float f10 = fMax;
                RectF rectF = this.f43342c;
                if (z10) {
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.v / 2.0f), rectF.centerY() - (this.f43348w / 2.0f));
                    this.f43347s.draw(canvas);
                    canvas.restore();
                    canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
                    float f11 = 19.285715f;
                    for (int i10 = 0; i10 < 5; i10++) {
                        canvas.drawArc(rectF, f11 + 270.0f, 12.857143f, false, paint2);
                        f11 += 32.14286f;
                    }
                    this.d.a(0.0f, 1.0f, canvas, paint, rectF);
                } else {
                    float fCenterX = rectF.centerX();
                    float fCenterY = rectF.centerY() - AndroidUtilities.dp(1.0f);
                    float fDp = AndroidUtilities.dp(8.0f);
                    int i11 = (int) (fCenterX - fDp);
                    int i12 = (int) (fCenterY - fDp);
                    int i13 = (int) (fCenterX + fDp);
                    int i14 = (int) (fCenterY + fDp);
                    org.telegram.ui.Components.oi0 oi0Var = this.f43345n;
                    oi0Var.setBounds(i11, i12, i13, i14);
                    oi0Var.draw(canvas);
                    float f12 = f10 * (-360.0f);
                    canvas.drawArc(rectF, -90.0f, f12, false, paint2);
                    this.d.a(f12, 1.0f, canvas, paint, rectF);
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
        float fDpf2 = AndroidUtilities.dpf2(10.5f);
        this.f43342c.set(measuredWidth - fDpf2, measuredHeight - fDpf2, measuredWidth + fDpf2, fDpf2 + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
