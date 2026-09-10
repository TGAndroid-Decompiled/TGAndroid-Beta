package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
import xh.l8;
public final class f1 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final e1 f48398a;
    public final RectF f48399b;
    public final Path f48400c;
    public final l8 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f48401f;
    public final org.telegram.ui.Components.n6 h;
    public final Paint f48402n;
    public final Paint f48403r;
    public final Drawable f48404s;
    public final zg.i v;
    public int f48405w;
    public boolean f48406x;
    public long f48407y;

    public f1(Context context, e1 e1Var, ch.b bVar) {
        super(context);
        this.f48399b = new RectF();
        this.f48400c = new Path();
        wr wrVar = wr.h;
        this.e = new org.telegram.ui.Components.d6(this, 320L, wrVar);
        this.f48401f = new org.telegram.ui.Components.d6(this, 320L, wrVar);
        Paint paint = new Paint(1);
        this.f48402n = paint;
        Paint paint2 = new Paint(1);
        this.f48403r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f48398a = e1Var;
        w7.c6.a(this);
        this.f48404s = context.getResources().getDrawable(R.drawable.star).mutate();
        zg.i iVar = new zg.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.h = n6Var;
        n6Var.r(-9866632);
        n6Var.t(AndroidUtilities.dp(9.0f));
        n6Var.setCallback(this);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new uq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new l8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f48406x);
        if (this.f48405w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f48401f.e(z10);
        RectF rectF = this.f48399b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e, -14670806, -548067);
        Paint paint = this.f48402n;
        paint.setColor(d);
        zg.i iVar = this.v;
        iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        iVar.f48138g.setColor(d);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f48404s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f48400c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e);
        l8 l8Var = this.d;
        l8Var.h = lerp;
        l8Var.g(rectF);
        l8Var.d();
        l8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e));
        invalidate();
        canvas.restore();
        if (e7 > 0.0f) {
            org.telegram.ui.Components.n6 n6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), n6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = n6Var.g() * this.G * e7;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f48403r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - n6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            n6Var.r(i0.a.d(e, -9866632, -1));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f48398a.c(this);
    }

    public void setCount(int i10) {
        this.f48405w = i10;
        org.telegram.ui.Components.n6 n6Var = this.h;
        if (i10 > 50000) {
            n6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            n6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f48406x == z10) {
            return;
        }
        this.f48406x = z10;
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
