package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.gr;
public final class a extends FrameLayout {
    public final ImageView f48764a;
    public final org.telegram.ui.Components.e6 f48765b;
    public final Paint f48766c;
    public final Paint d;
    public boolean e;
    public int f48767f;
    public float h;
    public ValueAnimator f48768n;

    public a(Context context, wg.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f48766c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        w7.e6.a(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f48765b = e6Var;
        e6Var.u(-9866632);
        e6Var.w(org.telegram.messenger.i0.L(9.0f));
        e6Var.setCallback(this);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        tg.i iVar = new tg.i();
        iVar.f48750a = bVar;
        iVar.a();
        iVar.f48754g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f48753f = org.telegram.messenger.i0.L(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, w7.b6.e(40, 40, 17));
        ImageView e = z20.e(context, 2131231777);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(e, w7.b6.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.f48764a = imageView;
        imageView.setImageResource(2131231778);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, w7.b6.e(20, 20, 17));
        imageView.setPivotX(org.telegram.messenger.i0.L(10.27f));
        imageView.setPivotY(org.telegram.messenger.i0.L(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 180.0f;
        ImageView imageView = this.f48764a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f7 = 0.0f;
            }
            z20.m(animate.rotation(f7), gr.h, 420L);
            return;
        }
        if (z10) {
            f7 = 0.0f;
        }
        imageView.setRotation(f7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f7 = this.h;
        org.telegram.ui.Components.e6 e6Var = this.f48765b;
        float i10 = e6Var.i() * f7;
        float max = Math.max(org.telegram.messenger.i0.L(12.0f), e6Var.c() + org.telegram.messenger.i0.L(6.0f));
        canvas.save();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.i0.L(13.0f));
        canvas.scale(i10, i10, rectF.centerX(), rectF.centerY());
        rectF.inset(-org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.i0.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f48766c);
        canvas.translate(((max - e6Var.c()) / 2.0f) + rectF.left, org.telegram.messenger.i0.L(7.0f));
        e6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i10) {
        String E;
        if (i10 <= 0) {
            E = "";
        } else {
            E = cd.E(i10, ',');
        }
        this.f48765b.t(E, true, true);
        if (this.f48767f != i10) {
            ValueAnimator valueAnimator = this.f48768n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f48768n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f48768n = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 9));
            this.f48768n.addListener(new sg.r(this, 2));
            z20.j(2.5f, this.f48768n);
            this.f48768n.setDuration(200L);
            this.f48768n.start();
            this.f48767f = i10;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f48765b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
