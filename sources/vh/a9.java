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
    public final Path f50929a;
    public final Paint f50930b;
    public final Paint f50931c;
    public boolean d;
    public final org.telegram.ui.Components.t5 e;
    public Drawable f50932f;
    public Bitmap h;
    public int f50933n;
    public ValueAnimator f50934r;

    public a9(Context context) {
        super(context);
        this.f50929a = new Path();
        Paint paint = new Paint(1);
        this.f50930b = paint;
        Paint paint2 = new Paint(3);
        this.f50931c = paint2;
        this.e = new org.telegram.ui.Components.t5(this, 0L, 380L, gr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(ob0 ob0Var, boolean z10) {
        if (this.f50932f == ob0Var) {
            return;
        }
        ValueAnimator valueAnimator = this.f50934r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50934r = null;
        }
        if (z10) {
            this.f50934r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f50934r.addUpdateListener(new ci.b(this, new AtomicBoolean(), ob0Var, 4));
            this.f50934r.start();
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
        if (this.f50932f != null) {
            float d = this.e.d(this.d);
            int intrinsicWidth = this.f50932f.getIntrinsicWidth();
            int intrinsicHeight = this.f50932f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f50932f.setBounds(rect);
                this.f50932f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f50929a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f50932f.setBounds(rect);
                this.f50932f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * d, this.f50930b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f50931c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f50933n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f50933n);
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
        this.f50932f = getContext().getResources().getDrawable(i10).mutate();
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
        Drawable drawable = this.f50932f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f50930b.setColor(i0.b.f(f7, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f50932f = drawable;
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
