package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pr;
public class na extends View implements c2 {
    public final Path f45798a;
    public final Paint f45799b;
    public final Paint f45800c;
    public boolean d;
    public final org.telegram.ui.Components.z5 f45801e;
    public Drawable f45802f;
    public Bitmap h;
    public int f45803n;
    public ValueAnimator f45804r;

    public na(Context context) {
        super(context);
        this.f45798a = new Path();
        Paint paint = new Paint(1);
        this.f45799b = paint;
        Paint paint2 = new Paint(3);
        this.f45800c = paint2;
        this.f45801e = new org.telegram.ui.Components.z5(this, 0L, 380L, pr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(lc0 lc0Var, boolean z4) {
        if (this.f45802f == lc0Var) {
            return;
        }
        ValueAnimator valueAnimator = this.f45804r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45804r = null;
        }
        if (z4) {
            this.f45804r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f45804r.addUpdateListener(new eg.q(this, new AtomicBoolean(), lc0Var, 3));
            this.f45804r.start();
            return;
        }
        setDrawable(lc0Var);
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        this.d = z4;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f45801e.d(f10, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f45802f != null) {
            float e6 = this.f45801e.e(this.d);
            int intrinsicWidth = this.f45802f.getIntrinsicWidth();
            int intrinsicHeight = this.f45802f.getIntrinsicHeight();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (e6 <= 0.0f) {
                this.f45802f.setBounds(rect);
                this.f45802f.draw(canvas);
            } else if (e6 < 1.0f) {
                canvas.save();
                Path path = this.f45798a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e6, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f45802f.setBounds(rect);
                this.f45802f.draw(canvas);
                canvas.restore();
            }
            if (e6 > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e6, this.f45799b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f45800c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f45803n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f45803n);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
    }

    public void setDrawable(int i10) {
        this.f45802f = getContext().getResources().getDrawable(i10).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i10 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i10);
        }
        invalidate();
    }

    @Override
    public void setInvert(float f10) {
        Drawable drawable = this.f45802f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f45799b.setColor(i0.a.d(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z4) {
        this.d = z4;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f45802f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            drawable.setBounds(0, 0, createBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
