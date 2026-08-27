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

public final class wo0 extends Drawable {

    public static final int f44155j = 0;

    public float f44156a = AndroidUtilities.dpf2(10.6665f);

    public final boolean f44157b;

    public Paint f44158c;
    public final Paint d;

    public final Paint f44159e;

    public final Paint f44160f;

    public final Path f44161g;
    public final Path h;

    public final org.telegram.ui.Components.i5 f44162i;

    public wo0(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f44159e = paint2;
        Paint paint3 = new Paint(1);
        this.f44160f = paint3;
        this.f44161g = new Path();
        this.h = new Path();
        this.f44157b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        this.f44162i = null;
        d();
    }

    public static wo0 a(int i10, int i11) {
        if (i11 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.g6.f23303r8;
            return new wo0(org.telegram.ui.ActionBar.g6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.g6.w0(null, iArr[i11], false), org.telegram.ui.ActionBar.g6.w0(null, iArr[i11], false));
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        return b(peerColors != null ? peerColors.getColor(i11) : null, false);
    }

    public static wo0 b(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor == null) {
            return new wo0(0, 0, 0);
        }
        return new wo0(peerColor.getColor1(), (!z10 || peerColor.hasColor6(org.telegram.ui.ActionBar.g6.I.q())) ? peerColor.getColor2() : peerColor.getColor1(), z10 ? peerColor.getColor1() : peerColor.getColor3());
    }

    public static wo0 c(int i10, int i11) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).profilePeerColors;
        return b(peerColors == null ? null : peerColors.getColor(i11), true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f44156a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f44161g;
        path2.rewind();
        path2.moveTo(this.f44156a * 2.0f, 0.0f);
        float f11 = this.f44156a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f44156a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f44156a, getBounds().centerY() - this.f44156a);
        Paint paint = this.f44158c;
        if (paint != null) {
            float f10 = this.f44156a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f44161g, this.f44159e);
        if (this.f44157b) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.f44156a - AndroidUtilities.dp(3.66f), this.f44156a - AndroidUtilities.dp(3.66f), this.f44156a + AndroidUtilities.dp(3.66f), this.f44156a + AndroidUtilities.dp(3.66f));
            float f11 = this.f44156a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.f44160f);
        }
        canvas.restore();
        org.telegram.ui.Components.i5 i5Var = this.f44162i;
        if (i5Var != null) {
            int iDp = AndroidUtilities.dp(14.0f) / 2;
            i5Var.setBounds(getBounds().centerX() - iDp, getBounds().centerY() - iDp, getBounds().centerX() + iDp, getBounds().centerY() + iDp);
            i5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.i5 i5Var = this.f44162i;
        if (view != null) {
            if (i5Var != null) {
                i5Var.l(view);
            }
            view.addOnAttachStateChangeListener(new f5(this, 3));
        } else if (i5Var != null) {
            i5Var.b();
            i5Var.l(null);
        }
    }

    public final void f(float f10, int i10) {
        if (this.f44158c == null) {
            Paint paint = new Paint(1);
            this.f44158c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f44158c.setStrokeWidth(f10);
        this.f44158c.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f44156a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f44156a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public wo0(long j10, int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f44159e = paint2;
        Paint paint3 = new Paint(1);
        this.f44160f = paint3;
        this.f44161g = new Path();
        this.h = new Path();
        this.f44157b = i12 != i10;
        paint.setColor(i10);
        paint2.setColor(i11);
        paint3.setColor(i12);
        d();
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(14.0f), null);
        this.f44162i = i5Var;
        i5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
