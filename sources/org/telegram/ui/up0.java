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
public final class up0 extends Drawable {
    public static final int f42745j = 0;
    public float f42746a = AndroidUtilities.dpf2(10.6665f);
    public final boolean f42747b;
    public Paint f42748c;
    public final Paint d;
    public final Paint f42749e;
    public final Paint f42750f;
    public final Path f42751g;
    public final Path h;
    public final org.telegram.ui.Components.q5 f42752i;

    public up0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f42749e = paint2;
        Paint paint3 = new Paint(1);
        this.f42750f = paint3;
        this.f42751g = new Path();
        this.h = new Path();
        this.f42747b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f42752i = null;
        d();
    }

    public static up0 a(int i10, int i11) {
        MessagesController.PeerColor peerColor = null;
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.h6.f21047r8;
            return new up0(org.telegram.ui.ActionBar.h6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.h6.x0(null, iArr[i11], false), org.telegram.ui.ActionBar.h6.x0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i11);
        }
        return b(peerColor, false);
    }

    public static up0 b(MessagesController.PeerColor peerColor, boolean z10) {
        int color2;
        int color3;
        if (peerColor == null) {
            return new up0(0, 0, 0);
        }
        int color1 = peerColor.getColor1();
        if (z10 && !peerColor.hasColor6(org.telegram.ui.ActionBar.h6.I.q())) {
            color2 = peerColor.getColor1();
        } else {
            color2 = peerColor.getColor2();
        }
        if (z10) {
            color3 = peerColor.getColor1();
        } else {
            color3 = peerColor.getColor3();
        }
        return new up0(color1, color2, color3);
    }

    public static up0 c(int i10, int i11) {
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
        float f7 = this.f42746a;
        path.addCircle(f7, f7, f7, Path.Direction.CW);
        Path path2 = this.f42751g;
        path2.rewind();
        path2.moveTo(this.f42746a * 2.0f, 0.0f);
        float f10 = this.f42746a;
        path2.lineTo(f10 * 2.0f, f10 * 2.0f);
        path2.lineTo(0.0f, this.f42746a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f42746a, getBounds().centerY() - this.f42746a);
        Paint paint = this.f42748c;
        if (paint != null) {
            float f7 = this.f42746a;
            canvas.drawCircle(f7, f7, f7, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f42751g, this.f42749e);
        if (this.f42747b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f42746a - AndroidUtilities.dp(3.66f), this.f42746a - AndroidUtilities.dp(3.66f), this.f42746a + AndroidUtilities.dp(3.66f), this.f42746a + AndroidUtilities.dp(3.66f));
            float f10 = this.f42746a;
            canvas.rotate(45.0f, f10, f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f42750f);
        }
        canvas.restore();
        org.telegram.ui.Components.q5 q5Var = this.f42752i;
        if (q5Var != null) {
            int dp = AndroidUtilities.dp(14.0f) / 2;
            q5Var.setBounds(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            q5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.q5 q5Var = this.f42752i;
        if (view == null) {
            if (q5Var != null) {
                q5Var.b();
                q5Var.l(null);
                return;
            }
            return;
        }
        if (q5Var != null) {
            q5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new e5(this, 3));
    }

    public final void f(float f7, int i10) {
        if (this.f42748c == null) {
            Paint paint = new Paint(1);
            this.f42748c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f42748c.setStrokeWidth(f7);
        this.f42748c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f42746a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f42746a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public up0(long j3, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f42749e = paint2;
        Paint paint3 = new Paint(1);
        this.f42750f = paint3;
        this.f42751g = new Path();
        this.h = new Path();
        this.f42747b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(14.0f), null);
        this.f42752i = q5Var;
        q5Var.j(j3, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
