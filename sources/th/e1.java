package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import rh.s8;
public final class e1 extends View {
    public long D;
    public float E;
    public final int[] F;
    public final float G;
    public final d1 f48902a;
    public final RectF f48903b;
    public final Path f48904c;
    public final s8 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f48905f;
    public final org.telegram.ui.Components.e6 h;
    public final Paint f48906n;
    public final Paint f48907r;
    public final Drawable f48908s;
    public final tg.i f48909w;
    public int f48910x;
    public boolean f48911y;

    public e1(Context context, d1 d1Var, wg.b bVar) {
        super(context);
        this.f48903b = new RectF();
        this.f48904c = new Path();
        gr grVar = gr.h;
        this.e = new org.telegram.ui.Components.t5(this, 320L, grVar);
        this.f48905f = new org.telegram.ui.Components.t5(this, 320L, grVar);
        Paint paint = new Paint(1);
        this.f48906n = paint;
        Paint paint2 = new Paint(1);
        this.f48907r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f48902a = d1Var;
        w7.e6.a(this);
        this.f48908s = context.getResources().getDrawable(2131232745).mutate();
        tg.i iVar = new tg.i();
        this.f48909w = iVar;
        iVar.f48764a = bVar;
        iVar.a();
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.h = e6Var;
        e6Var.u(-9866632);
        e6Var.w(org.telegram.messenger.i0.L(9.0f));
        e6Var.setCallback(this);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        dq dqVar = new dq(2131232745, 0);
        dqVar.H = 1.8f;
        dqVar.I = 1.8f;
        setCount(0);
        this.d = new s8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float L = org.telegram.messenger.i0.L(38.0f);
        float d = this.e.d(this.f48911y);
        if (this.f48910x > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d10 = this.f48905f.d(z10);
        RectF rectF = this.f48903b;
        rectF.set((getWidth() - L) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + L) / 2.0f, (getHeight() + L) / 2.0f);
        int f7 = i0.b.f(d, -14670806, -548067);
        Paint paint = this.f48906n;
        paint.setColor(f7);
        tg.i iVar = this.f48909w;
        iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        iVar.f48768g.setColor(f7);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int L2 = org.telegram.messenger.i0.L(20.0f);
        Drawable drawable = this.f48908s;
        drawable.setBounds((getWidth() - L2) / 2, (getHeight() - L2) / 2, (getWidth() + L2) / 2, (getHeight() + L2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f48904c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float T1 = org.telegram.messenger.i0.T1(5.0f, 15.0f, d);
        s8 s8Var = this.d;
        s8Var.h = T1;
        s8Var.g(rectF);
        s8Var.d();
        s8Var.b(canvas, -1, org.telegram.messenger.i0.T1(0.5f, 1.0f, d));
        invalidate();
        canvas.restore();
        if (d10 > 0.0f) {
            org.telegram.ui.Components.e6 e6Var = this.h;
            float max = Math.max(org.telegram.messenger.i0.L(12.0f), e6Var.c() + org.telegram.messenger.i0.L(6.0f));
            float i10 = e6Var.i() * this.G * d10;
            canvas.save();
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.i0.L(13.0f));
            canvas.scale(i10, i10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f48907r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.i0.L(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - e6Var.c()) / 2.0f) + rectF2.left, org.telegram.messenger.i0.L(6.33f));
            e6Var.u(i0.b.f(d, -9866632, -1));
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f48902a.c(this);
    }

    public void setCount(int i10) {
        this.f48910x = i10;
        org.telegram.ui.Components.e6 e6Var = this.h;
        if (i10 > 50000) {
            e6Var.t(org.telegram.messenger.i0.o0(i10, 0), true, true);
        } else {
            e6Var.t(dd.E(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f48911y == z10) {
            return;
        }
        this.f48911y = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
