package zh;

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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.Components.wr;
public final class a extends FrameLayout {
    public final ImageView f48146a;
    public final org.telegram.ui.Components.n6 f48147b;
    public final Paint f48148c;
    public final Paint d;
    public boolean e;
    public int f48149f;
    public float h;
    public ValueAnimator f48150n;

    public a(Context context, ch.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f48148c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        w7.c6.a(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.f48147b = n6Var;
        n6Var.r(-9866632);
        n6Var.t(AndroidUtilities.dp(9.0f));
        n6Var.setCallback(this);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        zg.i iVar = new zg.i();
        iVar.a(bVar);
        iVar.f48138g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f48137f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, w7.a6.e(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, w7.a6.e(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.f48146a = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, w7.a6.e(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 180.0f;
        ImageView imageView = this.f48146a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f7 = 0.0f;
            }
            em.q(animate.rotation(f7), wr.h, 420L);
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
        org.telegram.ui.Components.n6 n6Var = this.f48147b;
        float g10 = n6Var.g() * f7;
        float max = Math.max(AndroidUtilities.dp(12.0f), n6Var.d() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(g10, g10, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f48148c);
        canvas.translate(((max - n6Var.d()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        n6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i10) {
        String formatNumber;
        if (i10 <= 0) {
            formatNumber = "";
        } else {
            formatNumber = LocaleController.formatNumber(i10, ',');
        }
        this.f48147b.q(formatNumber, true, true);
        if (this.f48149f != i10) {
            ValueAnimator valueAnimator = this.f48150n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f48150n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f48150n = ofFloat;
            ofFloat.addUpdateListener(new qg.o(this, 14));
            this.f48150n.addListener(new yg.b(this, 3));
            this.f48150n.setInterpolator(new OvershootInterpolator(2.5f));
            this.f48150n.setDuration(200L);
            this.f48150n.start();
            this.f48149f = i10;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f48147b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
