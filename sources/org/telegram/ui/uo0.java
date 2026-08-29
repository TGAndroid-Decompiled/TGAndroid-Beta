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
public final class uo0 extends Drawable {
    public static final int f43296j = 0;
    public float f43297a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f43298b;
    public Paint f43299c;
    public final Paint d;
    public final Paint f43300e;
    public final Paint f43301f;
    public final Path f43302g;
    public final Path h;
    public final org.telegram.ui.Components.n5 f43303i;

    public uo0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f43300e = paint2;
        Paint paint3 = new Paint(1);
        this.f43301f = paint3;
        this.f43302g = new Path();
        this.h = new Path();
        this.f43298b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f43303i = null;
        d();
    }

    public static uo0 a(int i10, int i11) {
        MessagesController.PeerColor peerColor = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.g6.f23312r8;
            return new uo0(org.telegram.ui.ActionBar.g6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.g6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.g6.w0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i11);
        }
        return b(peerColor, false);
    }

    public static uo0 b(MessagesController.PeerColor peerColor, boolean z10) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new uo0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z10 && !peerColor.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z10) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new uo0(color1, color2, color3);
    }

    public static uo0 c(int i10, int i11) {
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
        float f9 = this.f43297a;
        path.addCircle(f9, f9, f9, Path.Direction.CW);
        Path path2 = this.f43302g;
        path2.rewind();
        path2.moveTo(this.f43297a * 2.0f, 0.0f);
        float f10 = this.f43297a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f43297a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f43297a, getBounds().centerY() - this.f43297a);
        Paint paint = this.f43299c;
        if (paint != null) {
            float f9 = this.f43297a;
            canvas.drawCircle(f9, f9, f9, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f43302g, this.f43300e);
        if (this.f43298b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f43297a - AndroidUtilities.dp(3.66f), this.f43297a - AndroidUtilities.dp(3.66f), this.f43297a + AndroidUtilities.dp(3.66f), this.f43297a + AndroidUtilities.dp(3.66f));
            float f10 = this.f43297a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f43301f);
        }
        canvas.restore();
        org.telegram.ui.Components.n5 n5Var = this.f43303i;
        if (n5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            n5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            n5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.n5 n5Var = this.f43303i;
        if (view == null) {
            if (n5Var != null) {
                n5Var.b();
                n5Var.l(null);
                return;
            }
            return;
        }
        if (n5Var != null) {
            n5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new f5(this, 3));
    }

    public final void f(float f9, int i10) {
        if (this.f43299c == null) {
            Paint paint = new Paint(1);
            this.f43299c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f43299c.setStrokeWidth(f9);
        this.f43299c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f43297a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f43297a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public uo0(long j10, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f43300e = paint2;
        Paint paint3 = new Paint(1);
        this.f43301f = paint3;
        this.f43302g = new Path();
        this.h = new Path();
        this.f43298b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(14.0f), null);
        this.f43303i = n5Var;
        n5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
