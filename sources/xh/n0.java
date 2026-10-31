package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.r8;
public final class n0 extends Drawable implements n6 {
    public final Paint f53918a;
    public final Paint f53919b;
    public final Paint f53920c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f53921f;
    public int h;

    public n0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.f53918a = paint;
        this.f53919b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f53920c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(2131231129).mutate();
        this.f53921f = mutate;
        int x02 = t6.x0(null, t6.L5, false);
        this.h = x02;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        r8 r8Var = new r8((p6) null);
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
        imageReceiver.J0(org.telegram.messenger.i0.L(25.0f));
        r8 r8Var2 = new r8((p6) null);
        r8Var2.r(user2);
        imageReceiver2.i0(user2, r8Var2, null);
        imageReceiver2.J0(org.telegram.messenger.i0.L(25.0f));
    }

    @Override
    public final void a(ei0 ei0Var) {
        this.e.H0(ei0Var);
        this.d.H0(ei0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.R();
        this.e.R();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.P();
        this.e.P();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = t6.L5;
        int x02 = t6.x0(null, i10, false);
        Paint paint = this.f53919b;
        paint.setColor(x02);
        float L = org.telegram.messenger.i0.L(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(bounds.centerX() - L, bounds.centerY() - org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + org.telegram.messenger.i0.L(41.0f);
        float L2 = org.telegram.messenger.i0.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L2, org.telegram.messenger.i0.L(14.0f), paint);
        canvas.drawCircle(centerX, L2, org.telegram.messenger.i0.L(12.0f), this.f53920c);
        int x03 = t6.x0(null, i10, false);
        int i11 = this.h;
        Drawable drawable = this.f53921f;
        if (x03 != i11) {
            this.h = x03;
            drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - org.telegram.messenger.i0.L(9.0f)), (int) (L2 - org.telegram.messenger.i0.L(9.0f)), (int) (centerX + org.telegram.messenger.i0.L(9.0f)), (int) (L2 + org.telegram.messenger.i0.L(9.0f)));
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.f53918a;
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.i0.L(3.33f), bounds.centerY() - org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(7.0f) + bounds.centerY(), org.telegram.messenger.i0.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.y0((bounds.centerX() + L) - org.telegram.messenger.i0.L(50.0f), bounds.centerY() - org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
        imageReceiver2.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
