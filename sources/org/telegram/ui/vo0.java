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
public final class vo0 extends Drawable {
    public static final int f43550j = 0;
    public float f43551a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f43552b;
    public Paint f43553c;
    public final Paint d;
    public final Paint f43554e;
    public final Paint f43555f;
    public final Path f43556g;
    public final Path h;
    public final org.telegram.ui.Components.i5 f43557i;

    public vo0(int i9, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f43554e = paint2;
        Paint paint3 = new Paint(1);
        this.f43555f = paint3;
        this.f43556g = new Path();
        this.h = new Path();
        this.f43552b = i11 != i9;
        paint.setColor(i9);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f43557i = null;
        d();
    }

    public static vo0 a(int i9, int i10) {
        MessagesController.PeerColor peerColor = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.f6.f23250r8;
            return new vo0(org.telegram.ui.ActionBar.f6.w0(null, iArr[i10], false), org.telegram.ui.ActionBar.f6.w0(null, iArr[i10], false), org.telegram.ui.ActionBar.f6.w0(null, iArr[i10], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i9).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i10);
        }
        return b(peerColor, false);
    }

    public static vo0 b(MessagesController.PeerColor peerColor, boolean z10) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new vo0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z10 && !peerColor.hasColor6(org.telegram.ui.ActionBar.f6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z10) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new vo0(color1, color2, color3);
    }

    public static vo0 c(int i9, int i10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i9).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        return b(color, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f43551a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f43556g;
        path2.rewind();
        path2.moveTo(this.f43551a * 2.0f, 0.0f);
        float f11 = this.f43551a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f43551a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f43551a, getBounds().centerY() - this.f43551a);
        Paint paint = this.f43553c;
        if (paint != null) {
            float f10 = this.f43551a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f43556g, this.f43554e);
        if (this.f43552b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f43551a - AndroidUtilities.dp(3.66f), this.f43551a - AndroidUtilities.dp(3.66f), this.f43551a + AndroidUtilities.dp(3.66f), this.f43551a + AndroidUtilities.dp(3.66f));
            float f11 = this.f43551a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f43555f);
        }
        canvas.restore();
        org.telegram.ui.Components.i5 i5Var = this.f43557i;
        if (i5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            i5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            i5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.i5 i5Var = this.f43557i;
        if (view == null) {
            if (i5Var != null) {
                i5Var.b();
                i5Var.l(null);
                return;
            }
            return;
        }
        if (i5Var != null) {
            i5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new e5(this, 3));
    }

    public final void f(float f10, int i9) {
        if (this.f43553c == null) {
            Paint paint = new Paint(1);
            this.f43553c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f43553c.setStrokeWidth(f10);
        this.f43553c.setColor(i9);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f43551a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f43551a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public vo0(long j10, int i9, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f43554e = paint2;
        Paint paint3 = new Paint(1);
        this.f43555f = paint3;
        this.f43556g = new Path();
        this.h = new Path();
        this.f43552b = i11 != i9;
        paint.setColor(i9);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(14.0f), null);
        this.f43557i = i5Var;
        i5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
