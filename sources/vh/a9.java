package vh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ob0;
public class a9 extends View implements y1 {
    public final Path f50919a;
    public final Paint f50920b;
    public final Paint f50921c;
    public boolean d;
    public final org.telegram.ui.Components.t5 e;
    public Drawable f50922f;
    public Bitmap h;
    public int f50923n;
    public ValueAnimator f50924r;

    public a9(Context context) {
        super(context);
        this.f50919a = new Path();
        Paint paint = new Paint(1);
        this.f50920b = paint;
        Paint paint2 = new Paint(3);
        this.f50921c = paint2;
        this.e = new org.telegram.ui.Components.t5(this, 0L, 380L, gr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(ob0 ob0Var, boolean z10) {
        if (this.f50922f == ob0Var) {
            return;
        }
        ValueAnimator valueAnimator = this.f50924r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50924r = null;
        }
        if (z10) {
            this.f50924r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f50924r.addUpdateListener(new ci.b(this, new AtomicBoolean(), ob0Var, 4));
            this.f50924r.start();
            return;
        }
        setDrawable(ob0Var);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.d = z10;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.e.e(true, f7);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f50922f != null) {
            float d = this.e.d(this.d);
            int intrinsicWidth = this.f50922f.getIntrinsicWidth();
            int intrinsicHeight = this.f50922f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f50922f.setBounds(rect);
                this.f50922f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f50919a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f50922f.setBounds(rect);
                this.f50922f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * d, this.f50920b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f50921c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f50923n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f50923n);
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
        this.f50922f = getContext().getResources().getDrawable(i10).mutate();
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
    public void setInvert(float f7) {
        Drawable drawable = this.f50922f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f50920b.setColor(i0.b.f(f7, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f50922f = drawable;
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
