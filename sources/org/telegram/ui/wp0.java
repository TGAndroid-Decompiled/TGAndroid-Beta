package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class wp0 extends Drawable {
    public static final int f42448j = 0;
    public float f42449a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f42450b;
    public Paint f42451c;
    public final Paint d;
    public final Paint f42452e;
    public final Paint f42453f;
    public final Path f42454g;
    public final Path h;
    public final org.telegram.ui.Components.o5 f42455i;

    public wp0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f42452e = paint2;
        Paint paint3 = new Paint(1);
        this.f42453f = paint3;
        this.f42454g = new Path();
        this.h = new Path();
        this.f42450b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f42455i = null;
        d();
    }

    public static wp0 a(int i10, int i11) {
        MessagesController.PeerColor peerColor = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.j6.f20918r8;
            return new wp0(org.telegram.ui.ActionBar.j6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.j6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.j6.w0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i11);
        }
        return b(peerColor, false);
    }

    public static wp0 b(MessagesController.PeerColor peerColor, boolean z10) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new wp0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z10 && !peerColor.hasColor6(org.telegram.ui.ActionBar.j6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z10) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new wp0(color1, color2, color3);
    }

    public static wp0 c(int i10, int i11) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i11);
        }
        return b(color, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f7 = this.f42449a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.f42454g;
        path2.rewind();
        path2.moveTo(this.f42449a * 2.0f, 0.0f);
        float f10 = this.f42449a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f42449a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f42449a, getBounds().centerY() - this.f42449a);
        Paint paint = this.f42451c;
        if (paint != null) {
            float f7 = this.f42449a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f42454g, this.f42452e);
        if (this.f42450b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f42449a - AndroidUtilities.dp(3.66f), this.f42449a - AndroidUtilities.dp(3.66f), this.f42449a + AndroidUtilities.dp(3.66f), this.f42449a + AndroidUtilities.dp(3.66f));
            float f10 = this.f42449a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f42453f);
        }
        canvas.restore();
        org.telegram.ui.Components.o5 o5Var = this.f42455i;
        if (o5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            o5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            o5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.o5 o5Var = this.f42455i;
        if (view == null) {
            if (o5Var != null) {
                o5Var.b();
                o5Var.l(null);
                return;
            }
            return;
        }
        if (o5Var != null) {
            o5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new f5(this, 3));
    }

    public final void f(float f7, int i10) {
        if (this.f42451c == null) {
            Paint paint = new Paint(1);
            this.f42451c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f42451c.setStrokeWidth(f7);
        this.f42451c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f42449a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f42449a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public wp0(long j3, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f42452e = paint2;
        Paint paint3 = new Paint(1);
        this.f42453f = paint3;
        this.f42454g = new Path();
        this.h = new Path();
        this.f42450b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(14.0f), null);
        this.f42455i = o5Var;
        o5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
